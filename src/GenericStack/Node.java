package GenericStack;

public class Node<T> {
	
	private T info; // current node
	private Node left;
	private boolean isHead = false;
	private boolean isTail = false;
	
	public Node(T val)
	{
		info = val;
	}
	
	public T Data()
	{
		return info;
	}
	
	public Node getLeft()
	{
		/*if (left == null)
		{
			System.out.println("nothing there");
			return null;
		}*/
		return left;
	}
	
	public void setLeft(Node n)
	{
		left = n;
	}
	
	public void setHead(boolean b)
	{
		isHead = b;
	}
	
	public void setTail(boolean b)
	{
		isTail = b;
	}
	
}
