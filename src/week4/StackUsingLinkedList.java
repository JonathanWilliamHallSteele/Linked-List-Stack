/**
 * @author Jon Steele 
 * @Email 300151384
 * This class implements the ADTStack interface.
 * The implementation must use the LinkedList implemented in last week as a library.
 */
package week4;

import week3.genericlist.ListNode;
import week3.genericlist.SimpleLinkedList;

public class StackUsingLinkedList<AnyType> implements ADTStack<AnyType> {

	//Declare (private) instance variables.
	private SimpleLinkedList<AnyType> itemList;
	private int head, tail;

	//Default constructor.
	public StackUsingLinkedList() {
		// TODO : Complete this method.
		itemList = new SimpleLinkedList<AnyType>();
	}

	@Override
	public void push(AnyType x) {
		itemList.add(x);
	}

	@Override
	public AnyType pop() {
		AnyType tailNode = itemList.get(itemList.size()-1);
		itemList.removeAt(itemList.size()-1);
		return tailNode;
	}

	@Override
	public AnyType peek() {
		return itemList.get(itemList.size()-1);
	}

	@Override
	public boolean isEmpty() {
		if (itemList.size() > 0)
			return false;
		else
			return true;
	}

	@Override
	public void makeEmpty() {
		itemList = new SimpleLinkedList<AnyType>();
	}
	
	@Override
	public String toString() {
		return "Stack items top to bottom: " + this.itemList.toString();
	}

}
