package com.fdmgroup.icode.library.locations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocationService {
	
	@Autowired
	private LocationRepository locationRepository;
	
	public LocationService(LocationRepository locationRepository) {
		super();
		this.locationRepository = locationRepository;
	}

	public Location addLocation(Location location) {
		return locationRepository.save(location);
	}
	
	public List<Location> findAll() {
		return locationRepository.findAll();
	}
	

	public List<Location> searchByLocationName(String locationName) {
		return locationRepository.findByLocationName(locationName);
	}

	public List<Location> searchByPhoneNumber(String phoneNumber) {
		return locationRepository.findByPhoneNumber(phoneNumber);
	}

	public Location updateLocationAddress(Long id, String address) {
		return locationRepository.updateLocationAddress(id, address);
	}

    public Location searchLocationById(Long locationId) {
		Location location = locationRepository.searchLocationById(locationId);
		return location;
    }

    public void deleteLocationById(Long locationId) {
		locationRepository.deleteLocationById(locationId);
    }

 



}
