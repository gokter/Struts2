package com.flyingh.action;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

public class UploadAction {
	private File[] image;
	private String[] imageFileName;

	public File[] getImage() {
		return image;
	}

	public void setImage(File[] image) {
		this.image = image;
	}

	public String[] getImageFileName() {
		return imageFileName;
	}

	public void setImageFileName(String[] imageFileName) {
		this.imageFileName = imageFileName;
	}

	public String execute() throws IOException {
		final String realPath = ServletActionContext.getServletContext()
				.getRealPath("/images");
		System.out.println(realPath);
		if (image != null) {
			for (int i = 0; i < image.length; ++i) {
				FileUtils.copyFile(image[i],
						new File(realPath, UUID.randomUUID() + "_"
								+ imageFileName[i]));
			}
		}
		return "success";
	}
}
