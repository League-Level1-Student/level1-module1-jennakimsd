import javax.swing.JOptionPane;

/* Your mission and you have to accept it:
 * Create a PopcornMaker class and add a main method to it that creates a bag of Popcorn and 
 * cooks it in the microwave.
 * Ask the user for the flavor of the popcorn and the number of minutes to cook it.
 *  Don't change the existing methods.
 */
public class PopcornMaker {
public static void main(String[] args) {
Microwave nice= new Microwave();
String flavor= JOptionPane.showInputDialog("What flavor of popcorn would you like?");
Popcorn cool= new Popcorn(flavor);
nice.putInMicrowave(cool);
String amount= JOptionPane.showInputDialog("How many minutes do you want to cook the popcorn for?");
int time= Integer.parseInt(amount);
nice.setTime(time);
nice.startMicrowave();
}
}
