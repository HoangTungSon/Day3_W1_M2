import java.util.Date;

public class StopWatch {

	Date now = new Date();
	
	private Date startTime;
	private Date endTime;
	private long elapsedTime = 0;
	
	public StopWatch() {
		this.startTime = now;
	}
	
	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	
	public Date start() {
		return this.startTime = now;
	}
	
	public Date stop() {
		return this.endTime = now;
	}
	
	public void setElapsedTime (long elapsedTime) {
		this.elapsedTime = elapsedTime;
	}
	
	public long getElapsedTime() {
		return this.elapsedTime;
	}
	

	
	
}
