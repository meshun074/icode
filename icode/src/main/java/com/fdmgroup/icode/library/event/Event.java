package com.fdmgroup.icode.library.event;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Event {
	
	private Long eventId;
	private String eventName;
	private String eventLocation;
	private String eventDescription;
	private Double eventCost;
	private Integer eventCapacity;
	
	private static Long nextId = 300000L;
	
	public Event() {
		this.eventId = generateUniqueId();
		
	}



	public Event(String eventName, String eventLocation, String eventDescription, Double eventCost, Integer eventCapacity) {
		this();
		this.eventName = eventName;
		this.eventLocation = eventLocation;
		this.eventDescription = eventDescription;
		this.eventCost = eventCost;
		this.eventCapacity = eventCapacity;
	}

	public Long getEventId() {
		return eventId;
	}

	public void setEventId(Long id) {
		this.eventId = id;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getEventLocation() {
		return eventLocation;
	}

	public void setEventLocation(String eventLocation) {
		this.eventLocation = eventLocation;
	}

	public String getEventDescription() {
		return eventDescription;
	}

	public void setEventDescription(String eventDescription) {
		this.eventDescription = eventDescription;
	}
	
	public Long generateUniqueId() {
		nextId += 7;
		return nextId;
	}

	public Double getEventCost() {
		return eventCost;
	}

	public void setEventCost(Double eventCost) {
		this.eventCost = eventCost;
	}

	public Integer getEventCapacity() {
		return eventCapacity;
	}

	public void setEventCapacity(Integer eventCapacity) {
		this.eventCapacity = eventCapacity;
	}



	@Override
	public String toString() {
		return "Events [id=" + eventId + ", eventName=" + eventName + ", eventLocation=" + eventLocation
				+ ", eventDescription=" + eventDescription + "]";
	}
	
	
	

}
