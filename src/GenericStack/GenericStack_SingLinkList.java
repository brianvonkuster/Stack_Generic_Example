package GenericStack;

import java.util.EmptyStackException;

public class GenericStack_SingLinkList<T> implements Stack<T> {
	
	private SinglyLinkedList<T> singList = new SinglyLinkedList<T>();

	@Override
	public int size() {
		return singList.getSize();
	}

	@Override
	public boolean isEmpty() {
		if (singList.toString() == "")
		{
			return true;
		}
		return false;
	}

	@Override
	public T peek() throws EmptyStackException {
		if (isEmpty())
		{
			throw new EmptyStackException();
		} 
		return singList.GetHead().Data();
	}

	@Override
	public void push(T element) throws Exception {
		singList.Add(element);
	}

	@Override
	public T pop() throws EmptyStackException {
		T elem;
		if (isEmpty())
		{
			throw new EmptyStackException();
		}
		
		elem = singList.GetTail().Data();
		singList.Remove(singList.getSize());
		return elem;
	}

}
