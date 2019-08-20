package assignment1;
/* Implement a BoundedQueue that supports a data structure which is of fixed size and circular,
i.e, insert at the end and the items are being pulled from front should be done in a circular fashion.
I.e, if the end position exceeds the size of the array the index of end should be
fixed appropriately to the beginning of the array. If the queue is full return an error
Notice the T, it makes the code to work for any type of items.
*/

public class BoundedQueue<T> {
  public BoundedQueue(int size){
  	//Todo implement the constructor to create a bounded queue of ssize size
  }
  
  //Returns 0 if insertion was successful -1 if it fails
  public Integer insertItem(T item){
  	//Write code to insert item at the 'end'
  }
  
  public T getFront(){
  	//Write code to return the item at the front and remove that item from the queue
  }
}
