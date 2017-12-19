package tx.cn.ChainofResponsibility;
/**
 * 
 * @作者：齐帅
 *描述：请假条类
 *
 */
public class LeaveRequest {
	private String leaveName;
	private int leaveDays;
	public LeaveRequest(String leaveName, int leaveDays) {
		this.leaveName = leaveName;
		this.leaveDays = leaveDays;
	}
	public String getLeaveName() {
		return leaveName;
	}
	public void setLeaveName(String leaveName) {
		this.leaveName = leaveName;
	}
	public int getLeaveDays() {
		return leaveDays;
	}
	public void setLeaveDays(int leaveDays) {
		this.leaveDays = leaveDays;
	}
	 
	
}
