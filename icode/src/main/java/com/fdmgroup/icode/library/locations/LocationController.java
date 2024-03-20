package com.fdmgroup.icode.library.locations;

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
@RequestMapping("/library/locations")
public class LocationController {

    @Autowired
    private LocationService locationService;

    @Autowired
    private LocationRepository locationRepo;

    public LocationController(LocationService locationService, LocationRepository locationRepo) {
        super();
        this.locationService = locationService;
        this.locationRepo = locationRepo;
    }

    @GetMapping("/allLocations")
	public String goToAllLibraryLocations(Model model) {
		List<Location> allLocations = locationRepo.findAll();
		model.addAttribute("allLocations", allLocations);
		return "/library/locations/allLocations";
	}
	
	@GetMapping("/createLocationForm")
	public String goToCreateANewLocation(Model model) {
		 model.addAttribute("location", new Location());
		return "/library/locations/createLocation";
	}

    @PostMapping("/createLocation")
    public String postCreateLocation(Location location) {
        locationService.addLocation(location);
        return "redirect:/library/locations/allLocations";
    }

    @GetMapping("/deleteLocationForm")
    public String goToDeleteLocationForm() {
        return "/library/locations/deleteLocationById";
    }


    @PostMapping("/deleteLocationById")
    public String postMethodName(@RequestParam("locationId") Long locationId, Model model) {
        Location location = locationService.searchLocationById(locationId);
        model.addAttribute("location", location);
        if(location != null) {
            locationService.deleteLocationById(locationId);
        }else {
            model.addAttribute("errorMessage", "Location not found for ID: " + locationId);
        }
        
        return "redirect:/library/locations/allLocations";
    }
    
	
	@GetMapping("/updateLocationAddressForm")
	public String goToEditLibraryLocationAddress() {
		return "/library/locations/updateLocationAddressById";
	}

    @GetMapping("/searchByLocationId")
    public String searchLocationById(@RequestParam Long locationId, Model model) {
        Location location = locationService.searchLocationById(locationId);
        model.addAttribute("location", location);
        return "/library/locations/updateLocationAddressById";
    }

    @GetMapping("/searchByLocationNameForm")
    public String getMethodName(Model model) {
        return "/library/locations/searchByLocationName";
    }
    

    @GetMapping("/searchByLocationName")
    public String searchLocationByName(@RequestParam String locationName, Model model) {
        List<Location> location = locationService.searchByLocationName(locationName);
        model.addAttribute("location", location);
        return "/library/locations/searchByLocationName";
    }


    @PostMapping("/{id}/updateLocationAddress")
    public String updateLocationAddress(@PathVariable Long id, @RequestParam String address) {
        locationService.updateLocationAddress(id, address);
        return "redirect:/library/locations/allLocations";
    }

}
