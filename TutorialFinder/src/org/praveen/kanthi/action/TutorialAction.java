package org.praveen.kanthi.action;

import org.praveen.kanthi.service.TutorialFinderService;

public class TutorialAction {
	
	private String serviceName=null;
	private String language;
	
	public String execute(){
		TutorialFinderService finderService = new TutorialFinderService();
		this.setServiceName(finderService.getBestTutorialSite(this.getLanguage()));
		//System.out.println("@@this.getLanguage()--->"+this.getLanguage());
		//System.out.println("Best Tutorial is:"+serviceName);
		return "success";
	}
	
	
	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	

	public String getLanguage() {
		return language;
	}


	public void setLanguage(String language) {
		this.language = language;
	}

}
