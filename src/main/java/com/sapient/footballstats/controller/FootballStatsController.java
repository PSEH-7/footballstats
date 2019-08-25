package com.sapient.footballstats.controller;

import java.net.URISyntaxException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.footballstats.model.FootballStatsResponse;
import com.sapient.footballstats.service.FootballStatsService;

@RestController
public class FootballStatsController {
	
	@Autowired
	public FootballStatsService servie;
	
	@GetMapping("/standings")
	public ResponseEntity<String> getFootballStatsResponse(@RequestParam("countryName") String countryName,
			@RequestParam("leagueName") String leagueName, @RequestParam("teamName") String teamName) throws URISyntaxException {
		return	servie.getOverallStandings(countryName, leagueName, teamName);
		
		
	}

}
