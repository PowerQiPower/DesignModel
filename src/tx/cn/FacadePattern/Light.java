package tx.cn.FacadePattern;

public class Light {
	private String positon;

	public Light(String positon) {
		this.positon = positon;
	}
	public void on(){
		System.out.println(this.positon+"�ƴ�");
	}
	public void off(){
		System.out.println(this.positon+"�ƹر�");
	}

}
