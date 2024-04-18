package Array_Blocking_Queue;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent. TimeUnit;

import WITH_Synchronization.Buffer;
import WITH_Synchronization.Consumer;
import WITH_Synchronization.Producer;


public class BlockingBufferTest {
	public static void main(String[] args) throws InterruptedException{
		ExecutorService executorService= Executors.newCachedThreadPool();
		Buffer sharedLocation = new BlockingBuffer ();
		executorService.execute (new Producer (sharedLocation));
		executorService.execute (new Consumer (sharedLocation));

		executorService.shutdown();
		executorService.awaitTermination(1, TimeUnit.MINUTES);
	}

}
