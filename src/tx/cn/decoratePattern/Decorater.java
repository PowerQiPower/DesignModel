package tx.cn.decoratePattern;
/**
 * 
 * @作者：齐帅
 *描述：关联机制来增加行为
 *聚合关联
 */
public class Decorater implements Transform {
	private Transform transform;
	public Decorater(Transform transform){
		this.transform=transform;
	}
	public void move() {
		//调用父类的方法，可以保证原有的方法不会丢失，而且可以扩展新的方法
		transform.move();
	}

}
