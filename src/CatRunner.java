
// Create a CatRunner class with a main method that creates a Cat object.
public class CatRunner {
public static void main(String[] args) {
	Cat cool= new Cat("fluffy");
	
	// 1. Make the Cat meow
	cool.meow();
	
	// 2. Get the Cat to print it's name
	cool.printName();
	
	// 3. Kill the Cat!
	for (int i = 0; i < 9; i++) {
	cool.kill();	}
}
}
