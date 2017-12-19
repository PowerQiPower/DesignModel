package tx.cn.proxySpringAPO;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
/**
 * 
 * @���ߣ���˧
 *������
 *ʵ�ֵ��ô��������ӿ� ��̬��
 */
public class DynamicProxy implements InvocationHandler {
	//��̬��ʵ����ʵ����
	private Object obj;
	
	//�������
	public DynamicProxy(Object obj) {
		super();
		this.obj = obj;
	}


	//��һ��������ʾ�����࣬������ķ������� �������Ĳ�������
	//ʵ��invoke������������������ʵ�����ඨ��ķ���
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		preRquest();
		method.invoke(obj, args);
		post();
		
		return null;
	}
	
	public void preRquest(){
		System.out.println("����֮ǰ");
	}
	public void post(){
		System.out.println("����֮��");
	}
	
	
	

}
