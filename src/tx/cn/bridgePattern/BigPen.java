package tx.cn.bridgePattern;

public class BigPen extends Pen {

	@Override
	public void draw(String name) {
		String penType="��ŵ�ë�ʻ���";
		this.color.bepaint(penType, name);
	}

}
