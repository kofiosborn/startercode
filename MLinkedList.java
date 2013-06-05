
public class MLinkedList<E>{

	private MNode<E> first;
	private int size;
	
	public MLinkedList(E e){
		first = new MNode<E>(e);
		size = 1;
	}
	
	private MNode<E> getNode(int index){
		MNode<E> cur = first;
		for (int i = 0; i < index; i ++){
			cur = cur.getNext();
		}
		return cur;
	}
	
	public void addLast(E e){
		MNode<E> last = getNode(size -1);
		last.setNext(new MNode<E>(e));
		size ++;
		//Adds an item to the end of the list
	}
	
	public void add(int index, E e){
		//These cases should be handled specially
		assert(index > 0);
		assert(index < (size-1));
		assert(size > 2);
		MNode<E> pre = getNode(index-1);
		MNode<E> post = getNode(index);
		MNode<E> toInsert = new MNode(e);
		pre.setNext(toInsert);
		toInsert.setNext(post);
		size ++;
	}
	
	public void print(){
		MNode<E> cur = first;
		for (int i = 0; i < size; i ++){
			System.out.println(cur.getData());
			cur = cur.getNext();
		}
	}
	
	public static void main(String[] args){
		MLinkedList<String> eits 
			= new MLinkedList<String>("Susannah");
		eits.addLast("Osborn");
		eits.addLast("Linda");
		eits.addLast("Adelaide");
		eits.add(2,"SamG");
		eits.print();
		
	}
}
