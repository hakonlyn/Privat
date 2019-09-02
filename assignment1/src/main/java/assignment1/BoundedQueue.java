package assignment1;

import java.util.ArrayList;

/* Implement a BoundedQueue that supports a data structure which is of fixed size and circular,
i.e, insert at the end and the items are being pulled from front should be done in a circular fashion.
I.e, if the end position exceeds the size of the array the index of end should be
fixed appropriately to the beginning of the array. If the queue is full return an error
Notice the T, it makes the code to work for any type of items.
*/

public class BoundedQueue<T> {
	
	private ArrayList<T> arr = new ArrayList<>(); 
	private int size;
	private int taken = 0;
	

  public BoundedQueue(int size){
  	//Todo implement the constructor to create a bounded queue of ssize size@
	  this.size = size;
  }
  
  //Returns 0 if insertion was successful -1 if it fails
  public Integer insertItem(T item){
	return null;
  	//Write code to insert item at the 'end'
	  if (taken >= size) {
		  return -1;
	  }
	  arr.add(item);
	  taken++;
	  return 0;
  }
  
  public T getFront(){
	return null;
  	//Write code to return the item at the front and remove that item from the queue
	  if (taken > 0) {
		  taken--;
		  return arr.remove(0);
	  }
	  return null;
	  }
}
