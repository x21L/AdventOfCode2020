package application;

import days.Day1; 
import static com.google.common.math.IntMath.isPrime;

public class Main {

	public static void main(String[] args) {
		// call your implemented solutions
		new Day1().read();
		
		/**
		 * You can also use the Google Guava library.
		 * The newest version 30 is integrated.
		 * @see <a href="https://github.com/google/guava/wiki">Guava Wiki</a>
		 */
		System.out.println(isPrime(3));
	}

}
