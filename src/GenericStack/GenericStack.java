package GenericStack;

import java.util.EmptyStackException;

public class GenericStack<T> implements Stack<T> {

	public static final int CAPACITY = 1024;
	
	private int N;
	
	private int t = -1;
	private T S[];
	
	public GenericStack()
	{
		this(CAPACITY);
	}
	
	public GenericStack(int cap) 
	{
		N = cap;
		S = (T[])new Object[N];
	}

	@Override
	public int size() {
		if (isEmpty())
		{
			throw new EmptyStackException();
		}
		return t;
	}

	@Override
	public boolean isEmpty() {
		return (t < 0);
	}

	@Override
	public T peek() throws EmptyStackException {
		if (isEmpty())
		{
			throw new EmptyStackException();
		} 
		return S[t];
	}

	@Override
	public void push(T element) throws Exception {
		S[++t] = element;
	}

	@Override
	public T pop() throws EmptyStackException {

		T elem;
		if (isEmpty())
		{
			throw new EmptyStackException();
		} 
		elem = S[t];
		S[t--] = null;
		return elem;
	}

}
