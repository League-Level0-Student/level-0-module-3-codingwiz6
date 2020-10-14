
package _03_modulo._4_fizz_buzz;

/**
 * Fizz Buzz
 * 
 * In this project, we're going to build FizzBuzz. It's a children's game where
 * you count from 1 to 20. Easy, right? Here's the catch:
 * 
 * Instead of saying a number that is divisible by 3, say "Fizz". And instead of
 * saying a number that is divisible by 5, say "Buzz". For numbers divisible by
 * both 3 and 5, say "FizzBuzz". 15
 * 
 * Print your results to the console.
 * 
 * If your code is correct, the output will be:
 * 
 * 1 2 fizz(3) 4 buzz(5) fizz(6) 7 8 fizz(9) buzz(10) 11 fizz(12) 13 14
 * fizzbuzz(15) 16 17 fizz(18) 19 buzz(20)
 * 
 **/

public class FizzBuzz {
	public static void main(String[] args) {
			for(int a=1;a<21;a++) {
				if(a%15==0) {
					System.out.println("FizzBuzz");
				}
				else if(a % 3==0) {
					System.out.println("Fizz");
				}
				else if(a % 5==0) {
					System.out.println("Buzz");
				}
				
				else {
					System.out.println(a);	
				}
			}
	}
}
