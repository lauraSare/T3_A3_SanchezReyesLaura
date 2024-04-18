package Array_Blocking_Queue;
public interface Buffer{
	public void blockingPut(int value) throws InterruptedException;

	public int blockingGet() throws InterruptedException;
}
