package test.thoughtworks;

import java.util.Date;

public class Talk implements Comparable{

	private String title;
	private int length;
	private Date startTime;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(this.title).append(" ").append(this.length).append(" ").append(this.startTime);
		return sb.toString();
	}
	
	@Override
	public int compareTo(Object o) {
		
		if(null != o && o instanceof Talk){
			return ((Talk)o).getLength() - this.getLength();	
		}
		
		return 0;
	}
	

	
	
	
	
}
