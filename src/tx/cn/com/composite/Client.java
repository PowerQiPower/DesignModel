package tx.cn.com.composite;

public class Client {

	public static void main(String[] args) {
		MyElement obj1,obj2,obj3,obj4;
		Plate p1,p2,p3;
		obj1=new Apple();
		obj2=new Banana();
		
		
		p1=new Plate();
		p1.add(obj1);
		p1.add(obj2);
		//p1.add(obj3);
		System.out.println("=======");
		 
		p2=new Plate();
		obj3=new Pear();
		//p2.add(obj2);
		p2.add(obj3);
		System.out.println("111111111111");
		
		p3=new Plate();
		obj4=new Apple();
		p3.add(p1);
		p3.add(p2);
		p3.add(obj4);
		System.out.println("=4444444444444444444=");
		
		
		p3.eat();
	
		
		
		
	}

}
