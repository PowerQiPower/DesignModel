package tx.cn.decoratePattern;

public class Robat extends Decorater {

	public Robat(Transform transform) {
		super(transform);
		
		say();
		System.out.println("��ɻ����ˣ�����");
	}
	public void say(){
		System.out.println("˵��������");
	}

}
