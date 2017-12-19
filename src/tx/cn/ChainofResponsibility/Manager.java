package tx.cn.ChainofResponsibility;

public class Manager extends AbstractLeader{

	public Manager(String name) {
		super(name);
	}

	public void handleRequest(LeaveRequest leave) {
		if (leave.getLeaveDays() < 10) {
			System.out.println("经理" + name + "审批员工" + leave.getLeaveName() + "的请假条，请假的天数" + leave.getLeaveDays());
		}
		else{
			if(this.leader!=null){
				this.leader.handleRequest(leave);
			}
		}
	}

}
