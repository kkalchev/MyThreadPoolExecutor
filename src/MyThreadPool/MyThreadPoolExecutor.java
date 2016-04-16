package MyThreadPool;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class MyThreadPoolExecutor {
	public static void main(String[] args) {
		ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(4);
		for (int i = 0; i <= 6; i++) {
			Job job = new Job("Job " + i);
			System.out.println("A new job has been added : " + job.getName());
			executor.execute(job);
		}
		executor.shutdown();
	}
}
