package tx.cn.decoratePattern;
/**
 * 
 * @作者：齐帅
 * 隐式超级构造器Decorater()未定义为默认构造函数。必须定义显式构造函数
 *描述：关联机制增加行为
 *装饰模式==适配器（区别对象/类结构型模式）
 */
public class Test {
	public static void main(String[] args) {
		Transform tran=new Car();
		tran.move();
		System.out.println("-----------------");
		Robat robot=new Robat(tran);
		robot.move();
		
		
		System.out.println("000000000000000000000000000");
		tran.move();
		Airphone air=new Airphone(tran);
		air.move();
	}

}
