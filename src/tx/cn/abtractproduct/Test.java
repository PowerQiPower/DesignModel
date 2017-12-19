package tx.cn.abtractproduct;

import tx.cn.abtractproduct.AirCondition;
import tx.cn.abtractproduct.EFProduct;
import tx.cn.abtractproduct.Television;
import tx.cn.abtractproduct.XMLUtil;

public class Test {
	public static void main(String[] args) {
		
			
		try {
			EFProduct fac;
			Television tv;
			AirCondition ai;
			Object ob;
		
			ob= XMLUtil.getBean();
			fac=(EFProduct) ob;
			System.out.println(fac+"999999999999999999");
			tv= fac.productTV();
			tv.play();
			ai= fac.productAir();
			ai.changeTemperature();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
}
