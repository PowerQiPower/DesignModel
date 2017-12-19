package tx.cn.FacadePattern;

public class Light {
	private String positon;

	public Light(String positon) {
		this.positon = positon;
	}
	public void on(){
		System.out.println(this.positon+"µÆ´ò¿ª");
	}
	public void off(){
		System.out.println(this.positon+"µÆ¹Ø±Õ");
	}

}
