package tx.cn.decoratePattern;
/**
 * 
 * @���ߣ���˧
 *����������������������Ϊ
 *�ۺϹ���
 */
public class Decorater implements Transform {
	private Transform transform;
	public Decorater(Transform transform){
		this.transform=transform;
	}
	public void move() {
		//���ø���ķ��������Ա�֤ԭ�еķ������ᶪʧ�����ҿ�����չ�µķ���
		transform.move();
	}

}
