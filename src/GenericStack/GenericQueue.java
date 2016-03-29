package GenericStack;

public class GenericQueue<T> implements Queue<T> {

	private SinglyLinkedList<T> singList = new SinglyLinkedList<T>();
	
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return singList.getSize();
	}

	@Override
	public boolean isEmpty() {
		if (size() == 0)
		{
			return true;
		}
		return false;
	}

	@Override
	public T peek() {
		return singList.GetHead().Data();
	}

	@Override
	public void Enqueue(T element) {
		singList.Add(element);
	}

	@Override
	public void Enqueue(T element, int index) {
		singList.Add(element, index);
	}

	@Override
	public T Dequeue() {
		T elem;
		
		elem = singList.GetHead().Data();
		singList.Remove(1);
		
		return elem;
	}
	
	public String toString()
	{
		return singList.toString();
	}

}
