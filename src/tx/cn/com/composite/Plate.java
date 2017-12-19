package tx.cn.com.composite;

import java.util.ArrayList;
/**
 * 
 * @作者：齐帅
 *描述：组合模式：循环递归方法 数组 在接口的方法中递归
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
			//引用层次高的上层抽象层类
			((MyElement)obj).eat();
		}
	}

}
