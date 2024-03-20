package com.fdmgroup.icode.library.event;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventService {
	
	@Autowired
	private EventRepository eventsRepository;
	
	public EventService(EventRepository eventsRepository) {
		super();
		this.eventsRepository = eventsRepository;
	}
	
	
	public List<Event> findAll(){
		List<Event> events = eventsRepository.findAll();
		return events;
	}

	public Event addEvent(Event event) {
		return eventsRepository.addEvent(event);
	}
	
	public Event updateEventDescription(Long id, String eventDescription) {
		return eventsRepository.updateEventDescription(id, eventDescription);
	}
	
	public Event findByEventId(Long id) {
		Event event = eventsRepository.findById(id);
		return event;
	}

	public List<Event> searchByEventName(String eventName) {
		return eventsRepository.findByEventName(eventName);
	}

	public void deleteEvent(Long id) {
		eventsRepository.deleteById(id);
		
	}


	

	public List<Event> searchByEventLocation(String eventLocation) {

		return eventsRepository.findByEventLocation(eventLocation);
	}


    public Event searchEventById(Long eventId) {
		Event event = eventsRepository.findById(eventId);
		return event;
    }


    public Event updateEventLocation(Long eventId, String eventLocation) {
       Event event = eventsRepository.updateEventLocation(eventId, eventLocation);
	   return event;
    }

}
