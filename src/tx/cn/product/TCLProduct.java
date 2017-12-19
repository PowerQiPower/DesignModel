package tx.cn.product;

public class TCLProduct implements ProductTV {
	public TV tv(){
		System.out.println("--askdaskd");
		return new TCLTV();
	}

}
