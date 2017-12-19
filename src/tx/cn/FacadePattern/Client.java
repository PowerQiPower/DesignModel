package tx.cn.FacadePattern;

public class Client {
	public static void main(String[] args) {
		GeneralAwitchFacade gena=new GeneralAwitchFacade();
		gena.on();
		System.out.println("============================"+gena.toString());
		gena.off();
	}
}
