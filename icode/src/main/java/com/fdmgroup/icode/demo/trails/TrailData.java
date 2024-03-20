package com.fdmgroup.icode.demo.trails;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TrailData {

	@Bean("trails")
	public List<Trail> getStarterTrails(){
		Trail trail1 = new Trail(TrailIdGenerator.getId(),  "Cathedral Rock", "Sedona, AZ",  "Hiking", true);
		Trail trail2 = new Trail(TrailIdGenerator.getId(),  "Chittenango", "Cazenovia, NY",  "Walking", true);
		Trail trail3 = new Trail(TrailIdGenerator.getId(),  "Spoonbill Trail and Osprey Loop", "Cortex, FL",  "Biking", true);
		Trail trail4 = new Trail(TrailIdGenerator.getId(),  "Keppler Pass Trailhead", "Black Canyon, CO",  "Snowmobiling", false);
		Trail trail5 = new Trail(TrailIdGenerator.getId(),  "Angels Landing", "Hurricane, UT",  "Hiking", false);
		return new ArrayList<>(Arrays.asList(trail1, trail2, trail3,  trail4, trail5));
	}
}
