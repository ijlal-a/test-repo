package test.thoughtworks;

import java.time.LocalTime;

public class Track {
	
	private Session morningSession = null;
	private Session lunch = null;
	private Session eveningSession = null;
	private Session networkingSession = null;
	
	public Track(){
		this.morningSession = new Session();
		this.morningSession.setDescription("Morning Session");
		this.morningSession.setStartTime(LocalTime.of(9, 0));
		this.morningSession.setDuration(180);
		this.morningSession.setDeviation(0);
		
		this.lunch = new Session();
		this.lunch.setDescription("Lunch");
		this.lunch.setStartTime(LocalTime.of(12, 0));
		this.lunch.setDuration(60);
		this.lunch.setDeviation(0);

		this.eveningSession = new Session();
		this.eveningSession.setDescription("Evening Session");
		this.eveningSession.setStartTime(LocalTime.of(13, 0));
		this.eveningSession.setDuration(180);
		this.eveningSession.setDeviation(60);

		
		this.networkingSession = new Session();
		this.networkingSession.setDescription("Networking Session");
		this.networkingSession.setStartTime(LocalTime.of(16, 0));
		this.networkingSession.setDuration(60);
		this.networkingSession.setDeviation(0);		
	}

	public Session getMorningSession() {
		return morningSession;
	}

	public void setMorningSession(Session morningSession) {
		this.morningSession = morningSession;
	}

	public Session getLunch() {
		return lunch;
	}

	public void setLunch(Session lunch) {
		this.lunch = lunch;
	}

	public Session getEveningSession() {
		return eveningSession;
	}

	public void setEveningSession(Session eveningSession) {
		this.eveningSession = eveningSession;
	}

	public Session getNetworkingSession() {
		return networkingSession;
	}

	public void setNetworkingSession(Session networkingSession) {
		this.networkingSession = networkingSession;
	}


}
