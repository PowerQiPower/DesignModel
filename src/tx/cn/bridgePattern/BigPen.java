package tx.cn.bridgePattern;

public class BigPen extends Pen {

	@Override
	public void draw(String name) {
		String penType="´óºÅµÄÃ«±Ê»æÖÆ";
		this.color.bepaint(penType, name);
	}

}
