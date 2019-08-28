package assignment1;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class FibonacciTest {

	Fibonacci fibo = new Fibonacci();
	
	@Test
	public void testGetFibonacci() {
		HashMap<Object, Object> fiboMap = new HashMap();
		fiboMap.put(0, 0);
		fiboMap.put(1, 1);
		fiboMap.put(20, 6765);
		fiboMap.put(-1, 0);
		for(Map.Entry<Object, Object> entry : fiboMap.entrySet()) {
			assertEquals(fibo.getFibonacci(((Number)(entry.getKey())).longValue()), ((Number)entry.getValue()).longValue());
		}
		
	}

}
