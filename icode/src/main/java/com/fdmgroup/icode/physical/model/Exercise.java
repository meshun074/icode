package com.fdmgroup.icode.physical.model;

public class Exercise {

	private long id;
	private String name;
	private BodyPart partOfBody;
	private String video;
	private String description;
	
	public Exercise() {
		//TODO
	}
	
	public Exercise(long id, String name, BodyPart partOfBody, String video, String description) {
		super();
		this.id = id;
		this.name = name;
		this.partOfBody = partOfBody;
		this.video = video;
		this.description = description;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BodyPart getPartOfBody() {
		return partOfBody;
	}
	public void setPartOfBody(BodyPart partOfBody) {
		this.partOfBody = partOfBody;
	}
	public String getVideo() {
		return video;
	}
	public void setVideo(String video) {
		this.video = video;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public long getId() {
		return id;
	}
	
	
}
