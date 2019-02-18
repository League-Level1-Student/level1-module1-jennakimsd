import java.util.Random;

public class Vault {
int secretCode= new Random().nextInt(1000001);	

	boolean tryCode(int number) {
	if(number==secretCode) {
		return true;
	}
	else return false;
	}

}
