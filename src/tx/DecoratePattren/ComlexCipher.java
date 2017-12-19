package tx.DecoratePattren;
/**
 * 
 * @作者：齐帅
 *描述：机密算法
 *
 */
public class ComlexCipher extends CipherDecorate {
	//显示构造
	public ComlexCipher(Cipher cipher) {
		super(cipher);
	}
	
	//简单加密基础上复杂加密
	public String encrypt(String plainText){
		String result =super.encrypt(plainText);
		result=reverse(result);
		return result;
		
	}
	private String reverse(String result) {
		String str="";
		for(int i=result.length();i>0;i--){
			str+=result.substring(i-1,i);
		}
		return str;
	}

}
