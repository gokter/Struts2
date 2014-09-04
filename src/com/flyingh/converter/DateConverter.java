package com.flyingh.converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.opensymphony.xwork2.conversion.impl.DefaultTypeConverter;

public class DateConverter extends DefaultTypeConverter {
	@Override
	public Object convertValue(Object value,
			@SuppressWarnings("rawtypes") Class toType) {
		final SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		try {
			return toType == Date.class ? sdf.parse(((String[]) value)[0])
					: sdf.format(value);
		} catch (final ParseException e) {
			throw new RuntimeException(e);
		}
	}
}
