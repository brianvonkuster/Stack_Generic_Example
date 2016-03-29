package GenericStack;

public interface Queue<T> {

	public int size();
	public boolean isEmpty();
	public T peek();
	
	public void Enqueue(T element);
	public void Enqueue(T element, int index);
	public T Dequeue();
	
	public String toString();
}
