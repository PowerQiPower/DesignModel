package tx.cn.bridgePattern;

public class MiddlePen extends Pen {

	@Override
	public void draw(String name) {
		String penType="ÖĞºÅµÄÃ«±Ê»æÖÆ";
		this.color.bepaint(penType, name);
	}

}
