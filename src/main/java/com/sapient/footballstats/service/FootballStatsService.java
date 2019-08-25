package com.sapient.footballstats.service;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Map;import org.apache.tomcat.util.threads.ResizableExecutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sapient.footballstats.constant.FootballStatsConstants;
import com.sapient.footballstats.model.FootballStatsResponse;

@Service
public class FootballStatsService {
	@Autowired
	RestTemplate restTemplate;

	public ResponseEntity<String> getOverallStandings(String countryName, String leagueName, String teamName) throws URISyntaxException {
		String url= "https://apiv2.apifootball.com/?action=get_standings&league_id=148&APIkey="+FootballStatsConstants.API_KEY;
		 URI uri = new URI(url);		 
		 ResponseEntity<String> result = restTemplate.getForEntity(uri, String.class);		
		 
		 
		/*
		 * ObjectMapper mapper = new ObjectMapper(); Map obj = mapper.readValue(result,
		 * valueType)
		 * 
		 * List<Object> students = (List<Object>) obj.get("Students"); Object[]
		 * delhiStudents = students .stream() .filter(student ->
		 * ((Map)student).get("City").equals("Delhi")) .toArray();
		 */
		return result;
		
		
	}
	

}
