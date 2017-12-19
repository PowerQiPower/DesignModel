package tx.DecoratePattren;
/**
 * 
 * @作者：齐帅
 *描述：加密算法
 *
 */
public class AdvancedCipher extends CipherDecorate {

	public AdvancedCipher(Cipher cipher) {
		super(cipher);
	}
	public String encrypt(String plainText){
		String result =super.encrypt(plainText);
		result=mod(result);
		return result;
		
	}
	private String mod(String result) {
		String str="";
		for(int i=0;i<result.length();i++){
			String c=String.valueOf(result.charAt(i)%6);
			str+=c;
		}
		return str;
	}

}
