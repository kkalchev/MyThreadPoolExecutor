package MyThreadPool;

import java.util.concurrent.TimeUnit;

class Job implements Runnable {
	private String name;

	public Job(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public void run() {

		try {
			Long duration = (long) (Math.random() * 100);
			System.out.println(" Doing a job during : " + name);
			TimeUnit.SECONDS.sleep(duration);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}