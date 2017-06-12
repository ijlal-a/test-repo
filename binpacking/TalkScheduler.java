package test.thoughtworks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author bruce
 *
 *	Input Param: 
 *  	talkList - all the talks in an ArrayList.
 *  	numberOfTracks - how many tracks this talk list should be divided into.
 *  
 *  Return:
 *  	List<Track> - a list of tracks with scheduled talks per sessions. 
 */
public class TalkScheduler {
	

	public static List<Track> buildTrackList(List<Talk> talkList, int numberOfTracks){
		
		Collections.sort(talkList);
		System.err.println("Sorted..." + talkList);
		
		List<Track> trackList = new ArrayList<Track>(numberOfTracks);
		
		for(int i=0; i < numberOfTracks; i++){
			Track t = new Track();
			System.out.println("inside for...");
			populateMorningSession(talkList, t.getMorningSession());
			
			
			trackList.add(t);
		}
		
		
		return trackList;
		
	}
	
	
	private static void populateMorningSession(List<Talk> talkList, Session ms){
		
		int duration = ms.getDuration();
		
		while(!(duration - talkList.get(0).getLength() <= 0)){
			duration -= talkList.get(0).getLength();
			ms.getTalkSet().add(talkList.remove(0));
				
		}
		
		int lastIndex = talkList.size()-1;
		
		while(!(duration - talkList.get(lastIndex).getLength() <= 0)){
			duration -= talkList.get(lastIndex).getLength();
			ms.getTalkSet().add(talkList.remove(lastIndex));
			lastIndex--;
		
		}
//		set start time for lunch
		System.err.println("talk set for morning session: " + ms.getTalkSet());
		
	}
	
	private static void populateEveningSession(List<Talk> talkList, Session ms){
//		set start time for networking event
	}
	
}
