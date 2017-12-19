package tx.cn.flyweight;
/**
 * 
 * @作者：齐帅
 *描述：具体享元类：交换机
 *内部状态
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
