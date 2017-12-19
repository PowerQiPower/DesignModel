package tx.cn.proxySpringAPO;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
/**
 * 
 * @作者：齐帅
 *描述：
 *实现调用处理程序类接口 动态化
 */
public class DynamicProxy implements InvocationHandler {
	//动态的实例真实对象
	private Object obj;
	
	//对象参数
	public DynamicProxy(Object obj) {
		super();
		this.obj = obj;
	}


	//第一个参数表示代理类，二代理的方法，三 代理方法的参数数组
	//实现invoke（）方法，调用在真实主题类定义的方法
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		preRquest();
		method.invoke(obj, args);
		post();
		
		return null;
	}
	
	public void preRquest(){
		System.out.println("调用之前");
	}
	public void post(){
		System.out.println("调用之后");
	}
	
	
	

}
