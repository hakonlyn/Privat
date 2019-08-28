package assignment1;

import org.junit.Test;
import static org.junit.Assert.*;


public class BoundedQueueTest {
	
	BoundedQueue<String> queue = new BoundedQueue<>(5);
    
    @Test 
    public void  testInsertItem() {
    	System.out.println(queue.insertItem("a"));
    	System.out.println(queue.getFront());
	    System.out.println(queue.insertItem("b"));
	    System.out.println(queue.insertItem("c"));
	    System.out.println(queue.insertItem("d"));
	    System.out.println(queue.insertItem("e"));
	    System.out.println(queue.insertItem("f"));
	    System.out.println(queue.insertItem("g"));
	    System.out.println(queue.insertItem("h"));
	    System.out.println(queue.insertItem("i"));
	    System.out.println(queue.insertItem("j"));
	    System.out.println(queue.insertItem("k"));
	    System.out.println(queue.getFront());
	    System.out.println(queue.insertItem("l"));
//	    
////	    int Successfull = "Nattu";
////	    
////	    HashMap<Object, Object> bqMap = new HashMap();
////	    bqMap.put(0, 0);
////		for(Map.Entry<Object, Object> entry : fiboMap.entrySet()) {
////			assertEquals(fibo.getFibonacci(((Number)(entry.getKey())).longValue()), ((Number)entry.getValue()).longValue());
////		}
////		
////	    assertEquals(0, queue.insertItem("a"));
    }
    
    @Test 
    public void testGetFront() {
//    	assertTrue(true);
//	    System.out.println(queue.getFront());
//	    System.out.println(queue.getFront());
//	    System.out.println(queue.getFront());
//	    System.out.println(queue.getFront());
//	    System.out.println(queue.getFront());
//	    System.out.println(queue.getFront());
//	    System.out.println(queue.getFront());
	    
    }
}







