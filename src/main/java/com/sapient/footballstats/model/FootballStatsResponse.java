package com.sapient.footballstats.model;

public class FootballStatsResponse {
	//Country ID & Name: 
	private String countryDetails;
	//League ID & Name: 
	private  String leagueDetails;
	//Team ID  & Name:
	private  String temaDetails;
	
	private String overallLeaguePostion;

	public String getCountryDetails() {
		return countryDetails;
	}

	public void setCountryDetails(String countryDetails) {
		this.countryDetails = countryDetails;
	}

	public String getLeagueDetails() {
		return leagueDetails;
	}

	public void setLeagueDetails(String leagueDetails) {
		this.leagueDetails = leagueDetails;
	}

	public String getTemaDetails() {
		return temaDetails;
	}

	public void setTemaDetails(String temaDetails) {
		this.temaDetails = temaDetails;
	}

	public String getOverallLeaguePostion() {
		return overallLeaguePostion;
	}

	public void setOverallLeaguePostion(String overallLeaguePostion) {
		this.overallLeaguePostion = overallLeaguePostion;
	}
	
	
	
	


}
