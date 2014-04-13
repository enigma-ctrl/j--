package pass;

public class Test implements test2 {
	public void test(int x) {

		// Double Literal Tests
		// int x = 2; // used int as an example for how double needed to be
		// parsed
		 double y;

		// Logical Or Tests
		// I used && to check if || was properly parsing
		// if (x == 1 && y == 2) {
		// System.out.println("something");
		// }

		// if(x == 1 && (y == 2 && z == 3)) {
		// System.out.println("something");
		// }

		 if (x == 1 || y == 2) {
		 System.out.println("something");
		 }
		
		// if(x == 1 || (y == 2 && z == 3)) {
		// System.out.println("something");
		// }

		// Operators Tests
		 x += y;
		 x -= y;
		 x *= y;
		 x /= y;
		 (x /= y);

		// Post and Prefix increment/decrement
		 ++x;
		 --x;
		 x++;
		 x--;

		// Conditional (Ternary) Expression Tests
		// if (1 = 1){
		// System.out.println("if");
		// } else {
		// System.out.println("else");
		// }
		
		 (a = a) ? System.out.println("a") : System.out.println("b");

		// Static blocks and Instance blocks tests

		 {
		 System.out.println("Instance Test");
		 }

		// Do-While Tests
		 do {
		 x++;
		 } while (x > 11)

		// For-Loop Tests
		 for(int x = 0;
		 x = 5;
		 x++){
		 System.out.println("*");
		 }

		// Enhanced For-Loop Test
		 for(int x : numbers) {
		 System.out.println("numbers");
		 }

	}

	public interface VenomousPredator extends Predator, Venomous {
	}

	 static {
	 x = 10;
	 }

}