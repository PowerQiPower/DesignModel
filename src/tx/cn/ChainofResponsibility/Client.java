package tx.cn.ChainofResponsibility;

public class Client {
	public static void main(String[] args) {
	AbstractLeader objab,objManager,genealManager;
	
	
	objab=new Director("王明");
	objManager=new Manager("赵强");
	genealManager =new GeneralManager("李波");
	
	objab.setLeader(objManager);
	objManager.setLeader(genealManager);

	LeaveRequest le=new LeaveRequest("张三",5);
	objab.handleRequest(le);
}
}
