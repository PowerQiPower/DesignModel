package tx.DecoratePattren;
/**
 * 
 * @���ߣ���˧
 *����������װ����
 *
 */
public class CipherDecorate implements Cipher {
	private Cipher cipher;
	public CipherDecorate(Cipher cipher) {
		this.cipher=cipher;
	}

	// ����һ��Cipher���͵Ķ��󣬲�������encrypt��������cipher�����encrypted��������
	public String encrypt(String plainText) {
		return cipher.encrypt(plainText);
	}

}
