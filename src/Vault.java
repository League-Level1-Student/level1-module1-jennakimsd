public class Vault {
int code= 1234;	

	Vault(){
	
	}
	boolean tryCode(int number) {
	if(number==code) {
		return true;
	}
	else return false;
	}

}
