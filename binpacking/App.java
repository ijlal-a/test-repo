package test.thoughtworks;

import java.time.LocalTime;
import java.util.List;
import java.util.Scanner;

public class App {

//	Parser - reads input from console and initializes [Tracks -> Sessions, Talks]
//	Scheduler - reads talks details from talks and schedules it for each session.
	
//	https://en.wikipedia.org/wiki/Bin_packing_probl
	public static void main(String[] args){
		
//		LocalTime lt = LocalTime.of(9,0);
		
		
		Scanner sc = new Scanner(System.in);
		List<Talk> talkList = Parser.buildTalkList(sc);
		sc.close();
		
		
/*		for(Talk talk : talkList){
			System.out.println(talk);
		}
*/
		
		List<Track> trackList = TalkScheduler.buildTrackList(talkList, 2);
		
		for(Track t: trackList){
			for(Talk talk: t.getMorningSession().getTalkSet()){
				System.out.println(talk.getTitle());
			}
		}
		
		
	}
	
	
}
