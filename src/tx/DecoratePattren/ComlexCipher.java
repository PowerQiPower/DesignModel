package tx.DecoratePattren;
/**
 * 
 * @���ߣ���˧
 *�����������㷨
 *
 */
public class ComlexCipher extends CipherDecorate {
	//��ʾ����
	public ComlexCipher(Cipher cipher) {
		super(cipher);
	}
	
	//�򵥼��ܻ����ϸ��Ӽ���
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
