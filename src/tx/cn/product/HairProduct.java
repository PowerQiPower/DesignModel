package tx.cn.product;

public class HairProduct implements ProductTV {

	public TV tv(){	
		System.out.println("--askdaskd");
		return new HairTv();

	}

}
