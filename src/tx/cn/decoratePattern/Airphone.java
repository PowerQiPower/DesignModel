package tx.cn.decoratePattern;

public class Airphone extends Decorater {

	public Airphone(Transform transform) {
		super(transform);
		System.out.println("变成飞机！！！");
		fiy();
	}

	public  void fiy() {
		System.out.println("在天空飞！！！");
	}

}
