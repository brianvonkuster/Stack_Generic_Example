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
		
		GenericStack_SingLinkList<Double> Gst = new GenericStack_SingLinkList<Double>();
		
		Gst.push(0.2524);
		Gst.push(1.83);
		Gst.push(0.52);
		System.out.println(Gst.pop());
		System.out.println(Gst.pop());
		System.out.println(Gst.pop());
		Gst.push(0.949);
		Gst.push(2.393);
		Gst.push(10.0384);
		System.out.println(Gst.pop());
		System.out.println(Gst.pop());
		System.out.println(Gst.pop());
	}

}
