package com.fdmgroup.icode.image.upload.model;

public class ImageInfo {

	private String name;
	private String url;

	public ImageInfo(String name, String url) {
		this.name = name;
		this.url = url;
	}

	public String getSimpleName() {
		return this.name.substring(0,this.name.lastIndexOf("."));
	}
	
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
