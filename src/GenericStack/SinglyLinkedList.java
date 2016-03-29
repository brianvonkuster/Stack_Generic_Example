package GenericStack;

public class SinglyLinkedList<T> {

	private Node<T> head;
	private Node<T> tail;
	private int size;
	
	// Add head and tail accessors for purpose of stack/queue?
	
	public SinglyLinkedList()
	{
		head = null;
		tail = null;
		size = 0;
	}
	
	public Node<T> GetHead()
	{
		return head;
	}
	
	public Node<T> GetTail()
	{
		return tail;
	}
	
	public void Add(T data) 
	{
		Node<T> curNode = head;
		Node<T> tmp = new Node<T>(data); 
		if (head == null)
		{
			head = tmp;
			tail = tmp;
		}
		else
		{
			while (curNode.getNext() != null)
			{
				curNode = curNode.getNext();
			}
			curNode.setNext(tmp);
			tail = curNode.getNext();
		}
		size++;
	}
	
	public void Add(T data, int index) 
	{
		if (index >= size || index <= 0)
		{
			System.out.println("ERROR input outside of List range, try again");
			return;
		}
		
		Node<T> tmp = new Node<T>(data);
		if (index == 1)
		{
			tmp.setNext(head);
			head = tmp;
		}
		else
		{
			Node<T> prevNode = GetNode(index-2);
			tmp.setNext(prevNode.getNext());
			prevNode.setNext(tmp);
			if ((index-1) == size)
			{
				tail = tmp;
			}
		}
		size++;
	}
	
	// String[] s = { "s", "ss", "sss", "" }
	// getNode(2) == s[2]
	// for (i=0; i < s.length; i++)
	// 		if (s[i] == "sss")
	//			return s[i];
	// for (i=0; i < size; i++)
	// 		if (getNode(i).Data() = "sss")
	//			return getNode(i).Data();
	
	
	public boolean Remove(int index)
	{
		if ((index-1) > size || index < 1)
		{
			System.out.println("ERROR input outside of List range, try again");
			return false;
		}
		Node<T> tmp;
		Node<T> tmp2;
		if (index == 1)
		{
			tmp = GetNode(index-1);
			head = tmp.getNext();
			tmp = null;
		}
		else
		{
			tmp = GetNode(index-2);
			tmp2 = tmp.getNext();
			tmp.setNext(tmp2.getNext());
			tmp2 = null;
			if (index == size)
			{
				tail = tmp;
			}
		}
		
		size--;
		return true;
	}
	
	public int getSize()
	{
		return size;
	}
	
	public Node<T> GetNode(int index)
	{
		if (index > size || index < 0)
		{
			System.out.println("ERROR input outside of List range, try again");
			return null;
		}
		Node<T> tmp = head;
		
		for (int i = 0; i < index; i++)
		{
			tmp = tmp.getNext();
		}
		
		return tmp;
	}
	
	public Node<T> FindNode(T data)
	{
		Node<T> tmp = head;
		
		while (tmp != null)
		{
			if (tmp.Data() == data)
			{
				return tmp;
			}
			tmp = tmp.getNext();
		}
		
		return null;
	}
	
	
	// print out list of elements
	public String toString()
	{
		String s = "";
		for (int i = 0; i < size; i++)
		{
			s += "Node " + (i+1) + ": " + GetNode(i).Data() + "\n";
		}

		return s;
	}
	
	
}
