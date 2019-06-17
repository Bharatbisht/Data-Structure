package Collection;

public class Linkedlist {
	Node head;
  public void insert(int data) {
	 Node node=new Node();
	  node.data=data;
	  node.next=null;
	  
	  if(head==null) {
		  
		head=node;
	  }else {
		Node temp = head;
		  
		 while(temp.next!=null) {
			 temp=temp.next;
		 }
		 temp.next=node;
	  }
	 // System.out.print("number inserted");
  }
  public void show(){
	  Node node = head;
	  
	while(node.next!=null) {
		  System.out.println(node.data);
		  node=node.next;
	  }
	  System.out.println(node.data);
  }
}
