package com.uuid.test;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;

import my.uuid.test.UUIDHexGenerator;

import org.apache.commons.lang3.time.StopWatch;
import java.util.UUID;
public class Benchmark {
	public static void main(String[] args) throws InterruptedException {
		Benchmark benchmark = new Benchmark();
		benchmark.test();
	}

	public void test() throws InterruptedException {
		int threadCount = 20;
		final int genCount = 10000;
		StopWatch watch = new StopWatch();

		final CountDownLatch latch = new CountDownLatch(threadCount);

		  
		// unique id check
		//final Map<Long, Object> map = new ConcurrentHashMap<Long, Object>();
		watch.start();

		final Object o = new Object();
		for (int i = 0; i < threadCount; ++i) {
			Thread thread = new Thread() {
				public void run() {
					for (int j = 0; j < genCount; ++j) {
						  UUID uuid = UUID.randomUUID();
					System.out.println("insert into tmp_id values('"+uuid+"');")	;
						
					}
					latch.countDown();
				}
			};
			thread.start();
		}

		latch.await();
		watch.stop();

		System.out.println("threadCount:" + threadCount + ", genCount:" + genCount);
	//	System.out.println("map size:" + map.size());

		System.out.println("time:" + watch);
		System.out.println("speed:" + genCount * threadCount / (watch.getTime() / 1000.0));

//		if (map.size() != threadCount * genCount) {
//			System.err.println("It seems generated the same id!!!");
//			System.exit(-1);
//		}
	}
}
