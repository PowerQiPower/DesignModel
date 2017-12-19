package tx.cn.flyweight;
/**
 * 
 * @���ߣ���˧
 *������������Ԫ�ࣺ������
 *�ڲ�״̬
 */
public class Hub implements NetworkDevice {
	private String type;
	
	public Hub(String type) {
		this.type = type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return this.type;
	}

	public void use(Port port) {
		System.out.println("linked by hub,type is "+this.type+"  port is"+ port.getPort());
	}

	

}
