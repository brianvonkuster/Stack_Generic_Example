package GenericStack;

import java.util.EmptyStackException;

public class GenericStack_SingLinkList<T> implements Stack<T> {

	public static final int CAPACITY = 1024;
	
	//private int N;
	
	//private int t = -1;
	//private T S[];
	
	private Node<T> curNode;
	
	private boolean isFirst = false;
	
	public GenericStack_SingLinkList()
	{
		isFirst = true;
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
		if (curNode == null)
		{
			return true;
		}
		else
		{
			return false;
		}
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
		if (isFirst)
		{
			Node<T> n = new Node<T>(element);
			n.setHead(true);
			n.setTail(true);
			curNode = n;
			isFirst = false;
		}
		else
		{
			Node<T> n = new Node<T>(element);
			curNode.setTail(false);
			n.setTail(true);
			n.setLeft(curNode);
			curNode = n;
		}
	}

	@Override
	public T pop() throws EmptyStackException {

		
		T elem;
		if (isEmpty())
		{
			throw new EmptyStackException();
		} 
		
		if (curNode.getLeft() == null)
		{
			
		}
		else
		{
			curNode.getLeft().setTail(true);
		}
		//elem = S[t];
		//S[t--] = null;
		return elem;
	}

}
