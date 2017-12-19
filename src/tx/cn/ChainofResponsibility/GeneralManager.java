package tx.cn.ChainofResponsibility;

public class GeneralManager extends AbstractLeader{

	public GeneralManager(String name) {
		super(name);
	}

	public void handleRequest(LeaveRequest leave) {
		if (leave.getLeaveDays() < 30) {
			System.out.println("总经理" + name + "审批员工" + leave.getLeaveName() + "的请假条，请假的天数" + leave.getLeaveDays());
		}
		else{
			if(this.leader!=null){
				this.leader.handleRequest(leave);
			}
		}		
	}

}
