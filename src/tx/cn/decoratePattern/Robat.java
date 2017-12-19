package tx.cn.decoratePattern;

public class Robat extends Decorater {

	public Robat(Transform transform) {
		super(transform);
		
		say();
		System.out.println("变成机器人！！！");
	}
	public void say(){
		System.out.println("说话！！！");
	}

}
