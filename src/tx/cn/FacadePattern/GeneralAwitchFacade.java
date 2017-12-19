package tx.cn.FacadePattern;

public class GeneralAwitchFacade {
	private Light light[]=new Light[4];
	private Fan fan;
	private AirConditioner con;
	private Television tel;
	
	public GeneralAwitchFacade(){
		light[0]=new Light("��ǰ");
		light[1]=new Light("��ǰ");
		light[2]=new Light("��ǰ");
		light[3]=new Light("��ǰ");
		fan=new Fan();
		con=new AirConditioner();
		tel =new Television();
	}
	
	public void on(){
		light[0].on();
		light[1].on();
		light[2].on();
		light[3].on();
		fan.on();
		con.on();
		tel.on();
		
	}
	public void off(){
		light[0].off();
		light[1].off();
		light[2].off();
		light[3].off();
		fan.off();
		con.off();
		tel.off();
	}
	
}
