package tx.cn.decoratePattern;

public class Airphone extends Decorater {

	public Airphone(Transform transform) {
		super(transform);
		System.out.println("��ɷɻ�������");
		fiy();
	}

	public  void fiy() {
		System.out.println("����շɣ�����");
	}

}
