package tx.cn.abtractproduct;

public class HairProduct implements EFProduct {

	@Override
	public Television productTV() {
		
		return new Hair();
	}

	@Override
	public AirCondition productAir() {
		// TODO Auto-generated method stub
		return new HairAir();
	}

}
