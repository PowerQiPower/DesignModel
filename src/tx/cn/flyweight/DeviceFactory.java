package tx.cn.flyweight;

import java.util.ArrayList;

/**
 * 
 * @作者：齐帅
 *描述：设备器工厂 内部状态存储数组或map存储  单例模式 组合关联
 *
 */
public class DeviceFactory {
	private ArrayList devices=new ArrayList();
	private int totalTerminal =0;
	
	
	public DeviceFactory() {
		NetworkDevice nd1= new Switch("Cisco-Ws-c2950-24");
		devices.add(nd1);
		NetworkDevice nd2=new Hub("TP-LINK-HF*M");
		devices.add(nd2);
		
	}
	
	public NetworkDevice getNetworkDevice(String type){
		if (type.equalsIgnoreCase("cisco")){
			totalTerminal++;
			return (NetworkDevice) devices.get(0);
		}
		else if(type.equalsIgnoreCase("tp")){
			totalTerminal++;
			return (NetworkDevice) devices.get(1);
		}
		
		return null;
	}
	public int getTaotalDevice(){
		return devices.size();
	}
	public int getTotalTerminal(){
		return totalTerminal;
		
	}
	
	
	
}
