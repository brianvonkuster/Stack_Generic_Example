package GenericStack;

public class GenericStack_SingLinkList<T> implements Stack<T> {
	
	private SinglyLinkedList<T> singList = new SinglyLinkedList<T>();

	@Override
	public int size() {
		return singList.getSize();
	}

	@Override
	public T peek() {
		return singList.GetTail().Data();
	}

	@Override
	public void push(T element) {
		singList.Add(element);
	}

	@Override
	public T pop() {
		T elem;
		
		elem = singList.GetTail().Data();
		singList.Remove(singList.getSize());
		return elem;
	}
	
	public String toString()
	{
		String s = "";
		for (int i = (singList.getSize()-1); i >= 0; i--)
		{
			s += "Stack pos " + (i+1) + ": " + singList.GetNode(i).Data() + "\n";
		}

		return s;
	}

	@Override
	public boolean isEmpty() {
		// EMPTY: DON'T USE
		return false;
	}

}
