package test.thoughtworks;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;


public class Session {
	
	String description;
	LocalTime startTime;
	int deviation;
	int duration;
	Set<Talk> talkSet; 
	
	public Session(){
		this.talkSet = new HashSet();
	}
	

	public LocalTime getStartTime() {
		return startTime;
	}
	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}

	public int getDeviation() {
		return deviation;
	}
	public void setDeviation(int deviation) {
		this.deviation = deviation;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Set<Talk> getTalkSet() {
		return talkSet;
	}
	public void setTalkSet(Set<Talk> talkSet) {
		this.talkSet = talkSet;
	}

}
