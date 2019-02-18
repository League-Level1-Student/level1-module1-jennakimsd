
public class JamesBond {
public static void main(String[] args) {
	Vault cool= new Vault();
	JamesBond nice= new JamesBond();
	System.out.println(nice.findCode(cool));

}
int findCode(Vault v) {
	for (int i = 0; i < 1000001; i++) {
	if (v.tryCode(i)) {
		return i;
	}
	}
	return -1;
}
}
