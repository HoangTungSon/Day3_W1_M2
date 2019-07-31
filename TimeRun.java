
public class TimeRun {

	public static void main(String[] args) {

		StopWatch time = new StopWatch();
		
		long start = System.currentTimeMillis();
		System.out.println(time.start());

		for (int i = 0; i < 10000; i++) {
			System.out.println(i);
		}
		
		System.out.println(time.stop());
		long end = System.currentTimeMillis();

		
		long sec = end - start;
		time.setElapsedTime(sec);
	
		System.out.println(time.getElapsedTime());
	}

}
