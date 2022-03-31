/**
 * @author Jonathan Steele jonwhsteele@gmail.com
 */
package main;

import week4.StackUsingLinkedList;

public class Lab4Tester {

	public static void main(String[] args) {
		
		//creating a new stack
		StackUsingLinkedList myStack = new StackUsingLinkedList();
		
		
		//adding various data types into the stack
		myStack.push('F');
		myStack.push(9);
		myStack.push(8);
		myStack.push("A");
		myStack.push("B");
		myStack.push("C");
		myStack.push("D");
		myStack.push('E');
		myStack.push(7);
		myStack.push(6);
		
		//testing to see if each data type was properly inserted into stack
		System.out.println(myStack.toString());
		
		//testing peek() and pop() methods
		System.out.println(myStack.peek().toString());
		System.out.println(myStack.pop().toString());
		System.out.println(myStack.peek().toString());
		System.out.println(myStack.pop().toString());
		System.out.println(myStack.peek().toString());
		System.out.println(myStack.pop().toString());
		System.out.println(myStack.peek().toString());
		System.out.println(myStack.pop().toString());
		System.out.println(myStack.peek().toString());
		System.out.println(myStack.pop().toString());
		System.out.println(myStack.peek().toString());
		
		//Ensuring the popped items were removed correctly.
		System.out.println(myStack.toString());
		
	}

}
