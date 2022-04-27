//Tokenize a String.. delimiter---> -,@ and saving using Linked list

class SplitList{
	private Node head=null;
	private Node cur=null;
	void add(String x){
		Node newNode=new Node(x);
		if (head==null){
			head=newNode;
			cur=newNode;
		}
		else{
			cur.next=newNode;
			cur=newNode;
		}
	}
	void print(){
		Node temp=head;
		while(temp!=null){
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
}

class Node{
	String data;
	Node next;

	public Node(String x){
		data=x;
		next=null;
	}
}


class Pg7_1{	

	static void spilt(String str){
		StringBuilder sb=new StringBuilder();
		SplitList list=new SplitList();

		for (Integer i=0;i<str.length();i++){
			if (str.charAt(i)=='-' || str.charAt(i)=='@'){
				if (sb.length()!=0) list.add(sb.toString());
				sb.setLength(0);
			}
			else{
				sb.append(str.charAt(i));
			}
		}
		if (sb.length()!=0){
			list.add(sb.toString());
		}
		list.print();
	}

	public static void main(String args[]){
		String str="-shyam-prasanna-cj@zoho";
		spilt(str);
	}

}
