/**
 * @author Malaka Walpola 
 * @Email malaka.walpola@ufv.ca
 * This interface contains the public definition for Stack implementations.
 */
package week4;

public interface ADTStack <AnyType> {
	
	/**
	 * Add the specified value to the stack.
	 * @param x the value to be added to the stack.
	 */
	public void push (AnyType x);
	
	/**
	 * Remove and return the element at the top of the stack.
	 * @return the element at the top  of the stack.
	 */
	public AnyType pop();
	
	/**
	 * Return the element at the top of the stack without modifying the stack. 
	 * @return the element at the top  of the stack.
	 */
	public AnyType peek();
	
	/**
	 * Return whether the stack is empty.
	 * @return true if stack has not elements, false otherwise.
	 */
	public boolean isEmpty();
	
	/**
	 * Clear all elements in the stack and make the stack an empty stack.
	 */
	public void makeEmpty();
	
	/**
	 * Returns a string with all the values in the list (comma separated).
	 * @return a string with all the values in the list (comma separated).
	 */
	public String toString();

}