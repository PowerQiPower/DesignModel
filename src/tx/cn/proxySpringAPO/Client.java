package tx.cn.proxySpringAPO;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {
	public static void main(String[] args) {
		InvocationHandler hander=null;
		AbstractSubject sub=null;
		
		hander=new DynamicProxy(new RealSubjeceA());
		
		//���ڸ��ݴ���Ľӿ�����interfaces����һ����̬�����Ĵ�����ʵ��   1 �������  2������ʵ�ֵĽӿ��б�����ʵ������Ľӿ��б�һ�£�
		//3 ����h ���ô��������
		sub = (AbstractSubject) Proxy.newProxyInstance(AbstractSubject.class.getClassLoader(),
				new Class[] { AbstractSubject.class }, hander);
		sub.request();
		
		System.out.println("--------------------");
		
	}
}
