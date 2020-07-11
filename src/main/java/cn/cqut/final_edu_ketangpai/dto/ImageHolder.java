package cn.cqut.final_edu_ketangpai.dto;

import lombok.Data;

import java.io.InputStream;

/**
 * @CLASSNAME:ImageHolder
 * @description:
 * @author: Nonameguy
 * @create: 2020-05-25 08:00
 */

public class ImageHolder {
	private String imageName;
	private InputStream image;

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public InputStream getImage() {
		return image;
	}

	public void setImage(InputStream image) {
		this.image = image;
	}

	public ImageHolder(String imageName, InputStream image) {
		this.imageName = imageName;
		this.image = image;
	}
}
