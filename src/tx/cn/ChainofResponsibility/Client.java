package tx.cn.ChainofResponsibility;

public class Client {
	public static void main(String[] args) {
	AbstractLeader objab,objManager,genealManager;
	
	
	objab=new Director("����");
	objManager=new Manager("��ǿ");
	genealManager =new GeneralManager("�");
	
	objab.setLeader(objManager);
	objManager.setLeader(genealManager);

	LeaveRequest le=new LeaveRequest("����",5);
	objab.handleRequest(le);
}
}
