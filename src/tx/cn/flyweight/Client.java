package tx.cn.flyweight;

public class Client {
	public static void main(String[] args) {
		NetworkDevice nd1,nd2,nd3,nd4,nd5;
		DeviceFactory dv=new DeviceFactory();
		
		nd1=dv.getNetworkDevice("cisco");
		nd1.use(new Port("1000"));
		
		nd2=dv.getNetworkDevice("cisco");
		nd2.use(new Port("1001"));
		
		nd3=dv.getNetworkDevice("cisco");
		nd3.use(new Port("1002"));
		
		nd4=dv.getNetworkDevice("tp");
		nd4.use(new Port("1003"));
		
		nd5=dv.getNetworkDevice("tp");
		nd5.use(new Port("1004"));
		
		System.out.println("Total device£º"+dv.getTaotalDevice());
		System.out.println("Total Terminal:"+dv.getTotalTerminal());
	}

}
