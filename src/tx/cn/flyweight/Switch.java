package tx.cn.flyweight;
/**
 * 
 * @���ߣ���˧
 *������������Ԫģ�ࣺ������
 *
 */
public class Switch implements NetworkDevice {
	private String type;
	
	public Switch(String type) {
		this.type = type;
	}
	
	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return this.type;
	}

	public void use(Port port) {
		System.out.println("linked by switch,type is "+this.type+"   port is"+ port.getPort());
	}

}
