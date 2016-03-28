package GenericStack;

import java.util.EmptyStackException;

public class GenericStack_SingLinkList<T> implements Stack<T> {

	public static final int CAPACITY = 1024;
	
	//private int N;
	
	private int sz = 0;
	//private T S[];
	
	private Node<T> curNode;
	
	private boolean isFirst = false;
	
	public GenericStack_SingLinkList()
	{
		isFirst = true;
	}

	@Override
	public int size() {
		return sz;
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
		return curNode.Data();
	}

	@Override
	public void push(T element) throws Exception {
		
		Node<T> n = new Node<T>(element);
		
		if (size() > 0)
		{
			n.setTail(true);
			n.setLeft(curNode);
			curNode.setTail(false);
		}
		else
		{
			n.setHead(true);
			n.setTail(true);
			curNode = n;
		}
		
		curNode = n;
		sz++;
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
			elem = curNode.Data();
		}
		else
		{
			elem = curNode.Data();
			curNode.getLeft().setTail(true);
		}
		//elem = S[t];
		//S[t--] = null;
		curNode = curNode.getLeft();
		sz--;
		return elem;
	}

}
