package tx.cn.bridgePattern;

public abstract class Pen {
	protected Color color;
	public void setColor(Color color) {
		this.color = color;
	}
	//��ʲô
	public abstract void draw(String name);
}
