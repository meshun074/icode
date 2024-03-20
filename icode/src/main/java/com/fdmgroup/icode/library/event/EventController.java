package com.fdmgroup.icode.library.event;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;




@Controller
@RequestMapping("/library/events")
public class EventController {

    @Autowired
    private EventService eventService;

    @Autowired
    private EventRepository eventRepo;

    public EventController(EventService eventService, EventRepository eventRepo) {
        super();
        this.eventService = eventService;
        this.eventRepo = eventRepo;
    }

    @GetMapping("/allEvents")
    public String goToAllEvents(Model model) {
        List<Event> allEvents = eventRepo.findAll();
		model.addAttribute("allEvents", allEvents);
        return "/library/events/allEvents";
    }

    @GetMapping("/createEventForm")
    public String goToCreateEventForm(Model model) {
        model.addAttribute("event", new Event());
        return "/library/events/createEvent";
    }


    @PostMapping("/createEvent")
    public String addEvents(Event event) {
    	eventService.addEvent(event);
        return "redirect:/library/events/allEvents";  		
    }

    @GetMapping("/deleteEventForm")
    public String goToDeleteEventForm() {
        return "/library/events/deleteEventById";
    }

    @PostMapping("deleteEventById")
    public String postDeleteEventById(@RequestParam Long eventId, Model model) {
        Event event = eventService.searchEventById(eventId);
        model.addAttribute("event", event);
        if(event != null) {
            eventService.deleteEvent(eventId);
        }else {
            model.addAttribute("errorMessage", "Event not found for ID: " + eventId);
        }
        return "redirect:/library/events/allEvents";
    }
    

    @GetMapping("/purchaseEventTicketsForm")
    public String goToPurchaseEventTicketForm(Model model) {
        List<Event> allEvents = eventRepo.findAll();
		model.addAttribute("allEvents", allEvents);
        return "/library/events/purchaseEventTickets";
    }


    @PostMapping("/purchase")
    public String postPurchaseTickets(@RequestParam String name, @RequestParam String eventId, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("eventId", eventId);      
        return "redirect:/library/events/confirmationPage";
    }


    @GetMapping("/confirmationPage")
    public String goToConfirmationPage(Model model) {
        return "/library/events/confirmationPage";
    }
        

    @GetMapping("/library/events/eventType")
    public String handleEventTypeSelection(@RequestParam("event-type") String eventType, @RequestParam(value = "location", required = false) String location, Model model) {
    List<Event> virtualEvents = new ArrayList<>();
    List<Event> locationEvents = new ArrayList<>();
    model.addAttribute("virtualEvents", virtualEvents);
    model.addAttribute("locationEvents", locationEvents);
    return "/library/events/searchEventByLocation";
    }



    @GetMapping("/updateEventLocationForm")
    public String goToUpdateEventLocationById() {
        return "/library/events/updateEventLocationById";
    }
    
    
    @GetMapping("/searchLocationByEventId")
    public String goToSearchEventByLocation(@RequestParam Long eventId, Model model) {
        Event event = eventService.findByEventId(eventId);
        model.addAttribute("event", event);
        return "/library/events/updateEventLocationById";
    }

    @PostMapping("/{eventId}/updateEventLocation")
    public String updateEventLocation(@PathVariable Long eventId, @RequestParam String eventLocation, Model model) {
        Event event = eventService.searchEventById(eventId);
        eventService.updateEventLocation(eventId, eventLocation);
        model.addAttribute("event", event);
        return "redirect:/library/events/allEvents";
    }
    

    @GetMapping("/updateEventDescriptionForm")
	public String goToEditALibraryEvent() {
		return "/library/events/updateEventDescriptionById";
	}
    
    @GetMapping("/searchDescriptionByEventId")
    public String searchByEventId(@RequestParam Long eventId, Model model) {
        Event event = eventService.findByEventId(eventId);
        model.addAttribute("event", event);
        return "/library/events/updateEventDescriptionById";
    }

    @PostMapping("/{eventId}/updateEventDescription")
    public String updateEventDescription(@PathVariable Long eventId, @RequestParam String eventDescription, Model model) {
        Event event = eventService.searchEventById(eventId);
        eventService.updateEventDescription(eventId, eventDescription);
        model.addAttribute("event", event);
        return "redirect:/library/events/allEvents";
    }


  








	




}

