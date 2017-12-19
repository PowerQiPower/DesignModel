package tx.cn.flyweight;
/**
 * 
 * @作者：齐帅
 *描述：网络设备器
 *抽象享元类
 */
public interface NetworkDevice {
	public String getType();
	public void use(Port port);
}
