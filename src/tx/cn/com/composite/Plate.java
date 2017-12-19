package tx.cn.com.composite;

import java.util.ArrayList;
/**
 * 
 * @���ߣ���˧
 *���������ģʽ��ѭ���ݹ鷽�� ���� �ڽӿڵķ����еݹ�
 *
 */
public class Plate implements MyElement {
	private ArrayList<MyElement> list=new ArrayList<>();
	public void add(MyElement e){
		list.add(e);
	}
	public void remove(MyElement e){
		list.remove(e);
	}
	public void eat() {
		for(Object obj : list){
			//���ò�θߵ��ϲ�������
			((MyElement)obj).eat();
		}
	}

}
