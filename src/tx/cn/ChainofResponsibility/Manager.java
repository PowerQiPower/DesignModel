package tx.cn.ChainofResponsibility;

public class Manager extends AbstractLeader{

	public Manager(String name) {
		super(name);
	}

	public void handleRequest(LeaveRequest leave) {
		if (leave.getLeaveDays() < 10) {
			System.out.println("����" + name + "����Ա��" + leave.getLeaveName() + "�����������ٵ�����" + leave.getLeaveDays());
		}
		else{
			if(this.leader!=null){
				this.leader.handleRequest(leave);
			}
		}
	}

}
