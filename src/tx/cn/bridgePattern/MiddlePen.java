package tx.cn.bridgePattern;

public class MiddlePen extends Pen {

	@Override
	public void draw(String name) {
		String penType="�кŵ�ë�ʻ���";
		this.color.bepaint(penType, name);
	}

}
