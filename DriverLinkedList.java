import java.util.*;
class UserNoSuchElementException extends RuntimeException{
	UserNoSuchElementException(){
		super();		
	}
}

class UserIndexOutOfBoundsException extends RuntimeException{
	UserIndexOutOfBoundsException(String desc){
		super(desc);
	}
}

class UserLinkedList<E>{
	private int indx ;
	private Node<E> head;
	private Node<E> tail;

	private class Node<E>{
		E ele ;
		Node<E> next ;
		public Node(E ele){
			this.ele = ele;
		}
	}
	@Override
	public String toString(){
		if(indx==0) return "[";

		Node<E> currEle = head ;
		String resp = "[";
		while(currEle.next!=null){
			resp += currEle.ele+"]";
			return resp;
		}
		resp +=currEle.ele+"]";
		return resp;
	}

	public boolean add(E ele){
		Node<E> newNode = new Node(ele);
		if(indx==0){
			head = newNode;
			tail = head;
			indx++;
		}else{
			tail.next = newNode;
			tail = newNode;
			indx++;
		}
		return true;
	}

	public void addLast(E ele){
		add(ele);
	}
	public void addFirst(E ele){
		Node<E> newNode = new Node<E>(ele);
		newNode.next = head;
		head = newNode;
		indx++;
	}

	public int size(){
		return indx ;
	}
	
	public E getFirst(){
		if(size()==0)
			throw new UserNoSuchElementException();
			return head.ele;
		
	}
	public E getLast(){
		if(size()==0)
			throw new UserNoSuchElementException();
			return tail.ele;
		
	}

	public boolean isEmpty(){
		return size()==0;
	}

	public E removeLast(){
		if(size()==0)
			throw new UserNoSuchElementException();
		E temp = tail.ele;
		Node<E> curr = head;
		for (int i = 0 ;i<size()-2 ;i++){
			curr = curr.next;
		}
		tail = curr ;
		curr.next = null ;
		indx--;
		return temp;
	} 

	public E removeFirst(){
		if(size()==0)
			throw new UserNoSuchElementException();

		E temp = head.ele;
		Node<E> curr = head.ele;
		head = head.next ;
		curr.next = null;
		indx--;
		return temp ;
	}

	public E getFirst(){
		if(size()==0)
			throw new UserNoSuchElementException();
		return head.ele;
	}

	public E getLast(){
		if(size()==0)
			throw new UserNoSuchElementException();
		return tail.ele;
	}

	public void add(int indx, E ele){
		if(indx<0 || indx>size()){
			throw new UserIndexOutOfBoundsException("Index : "+indx+"Size : "+ size());
		}
		Node<E> newNode = new Node<E>(ele);
		Node<E>	curr1 = head;
		for (int i = 0 ;i<indx-1 ;i++){
			curr1=curr1.next;
		}
		Node<E> curr2 = curr1.next;
		curr1.next=newNode;
		newNode.next=curr2;
		this.indx++;
	}

	public E remove(int indx){
		if(indx<0 || indx>size()){
			throw new UserIndexOutOfBoundsException("Index : "+indx+"Size : "+ size());
		}
		Node<E> curr1 = head ;
		for (int i = 0 ;i<indx-1 ;i++){
			curr1 = curr1.next;
		}
		Node<E> curr2 = curr1.next;
		curr1.next=curr2.next;
		E temp = curr2.ele;
		curr2.next = null;
		this.indx--;
		return temp ;
	}
	public boolean contains(Object obj){
		E search = (E)obj;
		if(search.equals(getLast())) return false;
		Node<E> curr = head;

		while(curr.next!=null){
			if(curr.ele.equals(search)) return true ;
			curr = curr.next ;
		}
		return false;
	}

	public int indexOf(Object obj){
		(search = (E)obj);
		if(!contains(obj)) return -1;
		if(search.equals(getLast())) return size()-1;
		Node<E> curr = head ;
		int i = 0 ;
		while(curr.next!=null){
			if(curr.ele.equals(search)) return i ;
			i++;
			curr = curr.next ;
		}
		return -1;
	}
	public E remove(){
		return removeLast();
	}

	public void clear(){
		while(!isEmpty()) removeFirst();
	}

	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	public void addAll(UserLinkedList<E> list){
		for (int i = 1;i<list.size() ;i++ ) {
			list2.add(list.get(i));
		}
		while(!list2.isEmpty()){
			E ele = (E)list2.getFirst();
			this.addLast(ele);
			list2.removeFirst();
		}
	}
	public E get(int indx){
		if(indx <0 || indx>=size())
			throw new UserIndexOutOfBoundsException("Invalid index");
		if(indx==size()-1) return getLast();
		int i = 1;
		Node<E> curr = head ;
		while(curr.next!=null){
			if(i==indx) return curr.ele;
			i++;
			curr = curr.next;
		}
		return null;
	}

}
class DriverLinkedList{
	public static void main(String[] args) {
		LinkedList<Integer> list1 = new LinkedList<>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(50);
		System.out.println(list1);
		System.out.println("--------");

		UserLinkedList<Integer> list2 = new UserLinkedList<>();
		list2.add(10);
		list2.add(20);
		list2.add(30);
		list2.add(40);
		list2.add(50);
		System.out.println(list2);
	}
}