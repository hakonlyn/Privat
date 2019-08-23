package assignment1;

public class Fibonacci {
  // Exercise 1: Fibonacci numbers
  //
  // fibonacci(n) returns nth Fibonacci number, and is defined by the
  // recurrence relation F_n = F_n-1 + F_n-2, with seed values F_0=0 and F_1=1.
	public long getFibonacci(long number) {
		if (number <= 0) {
			return 0;
		}
		if (number == 1) {
		  return 1;
		}
		return getFibonacci(number-1) + getFibonacci(number-2);
	}
}
