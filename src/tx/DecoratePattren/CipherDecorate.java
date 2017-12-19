package tx.DecoratePattren;
/**
 * 
 * @作者：齐帅
 *描述：抽象装饰类
 *
 */
public class CipherDecorate implements Cipher {
	private Cipher cipher;
	public CipherDecorate(Cipher cipher) {
		this.cipher=cipher;
	}

	// 定义一个Cipher类型的对象，并调用其encrypt（）调用cipher对象的encrypted（）方法
	public String encrypt(String plainText) {
		return cipher.encrypt(plainText);
	}

}
