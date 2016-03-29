package GenericStack;

public class Node<T> {
	
	private T info; // current node
	private Node<T> next;
	private String dir = "left";
	
	public Node(T val)
	{
		info = val;
	}
	
	public T Data()
	{
		return info;
	}
	
	public Node<T> getNext()
	{	
		return next;
	}
	
	public void setNext(Node<T> n)
	{
		next = n;
	}
	
}
