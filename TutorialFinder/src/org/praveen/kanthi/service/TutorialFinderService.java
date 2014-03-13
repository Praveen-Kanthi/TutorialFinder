package org.praveen.kanthi.service;

public class TutorialFinderService {
	
	public String getBestTutorialSite(String lang){
		if("Java".equalsIgnoreCase(lang)){
			return "Java Braines";
		}else if("dotNet".equalsIgnoreCase(lang)){
			return "dotNet Tutorial";
		}else if("Ruby".equalsIgnoreCase(lang)){
			return "Ruby Tutorial";
		}else{
			return "No good Tutorial";
		}
	}

}
