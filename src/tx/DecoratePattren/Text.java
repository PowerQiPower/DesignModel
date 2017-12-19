package tx.DecoratePattren;

public class Text {

	public static void main(String[] args) {
		String password="sunnyLiu";
		String cpassword;
		Cipher sc,cc;
		
		sc=new SimpleCipher();
		cpassword=sc.encrypt(password);
		System.out.println(cpassword);
		System.out.println("1111111111111111111111");
		
		
		cc=new ComlexCipher(sc);
		cpassword=cc.encrypt(password);
		System.out.println(cpassword);
		System.out.println("2222222222222222222222");
	}

}
