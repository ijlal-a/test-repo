package test.thoughtworks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Ijlal
 *
 *         Purpose of this class is to read the input from console and
 *         initialize the Track, Session and Talk objects.
 */

public class Parser {

	public static List<Talk> buildTalkList(Scanner sc){
		List<Talk> talkList = new ArrayList<Talk>();
		
		while(sc.hasNextLine()){
			Talk talk = new Talk();
			String line = sc.nextLine();
			int lastSpaceIndex = line.lastIndexOf(" ");
			String timeToken = null;
			if(lastSpaceIndex != -1){
				timeToken = line.substring(lastSpaceIndex).trim();
			}
			
			talk.setTitle(line);
			
			if(null != timeToken){
				if("lightning".equals(timeToken)){
					talk.setLength(5);
				}else if(timeToken.contains("min")){
					talk.setLength(Integer.parseInt(timeToken.replace("min", "").trim()));
				}
			}
			
			talkList.add(talk);
		}
		
		
		return talkList;
	}
	
}
