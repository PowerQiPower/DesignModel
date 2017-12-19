package tx.cn.ChainofResponsibility;

/**
 * 
 * @作者：齐帅 描述：主任类 具体执行者，抽象类的子类，对封装在请求对象中的请假天数小于3直接处理，否则转发给下家
 */
public class Director extends AbstractLeader {
	// 责任职责名称
	public Director(String name) {
		super(name);
	}

	@Override
	public void handleRequest(LeaveRequest leave) {
		if (leave.getLeaveDays() < 3) {
			System.out.println("主任" + name + "审批员工" + leave.getLeaveName() + "的请假条，请假的天数" + leave.getLeaveDays());
		}
		else{
			if(this.leader!=null){
				this.leader.handleRequest(leave);
			}
		}
	}

}
