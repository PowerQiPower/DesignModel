package tx.cn.ChainofResponsibility;

public class GeneralManager extends AbstractLeader{

	public GeneralManager(String name) {
		super(name);
	}

	public void handleRequest(LeaveRequest leave) {
		if (leave.getLeaveDays() < 30) {
			System.out.println("�ܾ���" + name + "����Ա��" + leave.getLeaveName() + "�����������ٵ�����" + leave.getLeaveDays());
		}
		else{
			if(this.leader!=null){
				this.leader.handleRequest(leave);
			}
		}		
	}

}
