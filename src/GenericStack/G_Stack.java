package GenericStack;

public class G_Stack {

	public static void main(String[] args) throws Exception 
	{
			/*System.out.println("proof");
			GenericStack<Double> St = new GenericStack<Double>();
			St.push(2.013);
			System.out.println(St.peek());
			System.out.println(St.pop());
			
			GenericStack<String> Sr = new GenericStack<String>();
			Sr.push("test");
			System.out.println(Sr.peek());
			System.out.println(Sr.pop());
			
			System.out.println();
			Node<Double> n1 = new Node<Double>(0.1);
			Node<Double> n2 = new Node<Double>(0.25);
			n2.setLeft(n1);
			System.out.println(n2.getLeft().Data());
			System.out.println(n2.Data());*/
		
		/*GenericStack_SingLinkList<Double> Gst = new GenericStack_SingLinkList<Double>();
		
		Gst.push(0.2524);
		Gst.push(1.83);
		Gst.push(0.52);
		System.out.println(Gst.pop());
		System.out.println(Gst.pop());
		System.out.println(Gst.pop());
		Gst.push(0.949);
		Gst.push(2.393);
		Gst.push(10.0384);
		System.out.println(Gst.toString());
		System.out.println(Gst.pop());
		System.out.println(Gst.pop());
		System.out.println(Gst.pop());*/
		
		/*SinglyLinkedList<Double> sLL = new SinglyLinkedList<Double>();
		
		System.out.println("Test 1");
		sLL.Add(2.22);
		sLL.Add(4.44);
		sLL.Add(6.66);
		sLL.Add(8.88);
		sLL.Add(10.10);
		sLL.Add(12.12, 6);
		System.out.println(sLL.toString());

		System.out.println("Test 2");
		sLL.Remove(4);
		sLL.Add(394.0, 6);
		sLL.Remove(6);
		System.out.println(sLL.toString());
		System.out.println(sLL.GetTail().Data());*/
		
		/*GenericQueue<Integer> Gsq = new GenericQueue<Integer>();
		
		Gsq.Enqueue(1);
		Gsq.Enqueue(2);
		Gsq.Enqueue(3);
		Gsq.Enqueue(4, 3);
		System.out.println(Gsq.toString());*/
		
		DoublyLinkedList<Double> dLL = new DoublyLinkedList<Double>();
		
		//dLL.AddFirst(3.33);
		//dLL.AddFirst(4.44);
		//dLL.AddFirst(5.55);
		//dLL.AddLast(6.66);
		//dLL.AddLast(7.77);
		dLL.Add(2.0, 0);
		dLL.Add(3.0, 0);
		dLL.Add(4.0, 0);
		System.out.println(dLL.GetTail().Data());
	
		
		System.out.println(dLL.toString());
	}

}
