package Array_Blocking_Queue;

import java.util.concurrent.ArrayBlockingQueue;

import WITH_Synchronization.Buffer;
public class BlockingBuffer  implements Buffer{
	private final ArrayBlockingQueue<Integer> buffer;

	public BlockingBuffer() {
		buffer= new ArrayBlockingQueue<Integer>(1);
	}

	@Override
	public void blockingPut(int value) throws InterruptedException {
		buffer.put(value);
		System.out.printf("%s%2d\t%s%d%n","Producer writes",value,"Buffer cells occupied: ",buffer.size());

	}

	@Override
	public int blockingGet() throws InterruptedException {
		int readValue=buffer.take();
		System.out.printf("%s %2d\t%s%d%n","Consumer reads ",
				readValue,"Buffer cells occupied: ",buffer.size());

		return readValue;
	}



}
