package tx.cn.product;

public class Test {
	public static void main(String[] args) {
		ProductTV tvFactory;
		TV tv;
		try{
		 tvFactory= (ProductTV)XMLUtil.getBean();
		 tv= tvFactory.tv();
		 tv.play();
		}catch(Exception e)
		{System.out.println(e.getMessage());}
	}

}
