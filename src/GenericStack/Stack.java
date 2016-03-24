package GenericStack;

import java.util.EmptyStackException;

public interface Stack<T> {
	
	public int size();
	public boolean isEmpty();
	public T peek() throws EmptyStackException;
	
	public void push (T element) throws Exception;
	public T pop() throws EmptyStackException;
	
	public String toString();
}
