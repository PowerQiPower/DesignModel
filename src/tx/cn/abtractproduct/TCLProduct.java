package tx.cn.abtractproduct;

public class TCLProduct implements EFProduct {

	@Override
	public Television productTV() {
		// TODO Auto-generated method stub
		return new TCL();
	}

	@Override
	public AirCondition productAir() {
		// TODO Auto-generated method stub
		return new TCLAir();
	}

}
