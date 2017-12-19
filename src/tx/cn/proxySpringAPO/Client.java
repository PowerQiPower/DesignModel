package tx.cn.proxySpringAPO;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Client {
	public static void main(String[] args) {
		InvocationHandler hander=null;
		AbstractSubject sub=null;
		
		hander=new DynamicProxy(new RealSubjeceA());
		
		//用于根据传入的接口类型interfaces返回一个动态创建的代理类实例   1 类加载器  2代理类实现的接口列表（与真实主题类的接口列表一致）
		//3 参数h 调用处理程序类
		sub = (AbstractSubject) Proxy.newProxyInstance(AbstractSubject.class.getClassLoader(),
				new Class[] { AbstractSubject.class }, hander);
		sub.request();
		
		System.out.println("--------------------");
		
	}
}
