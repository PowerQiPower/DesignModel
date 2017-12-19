package tx.cn.ChainofResponsibility;

/**
 * 
 * @���ߣ���˧ ������������ ����ִ���ߣ�����������࣬�Է�װ����������е��������С��3ֱ�Ӵ�������ת�����¼�
 */
public class Director extends AbstractLeader {
	// ����ְ������
	public Director(String name) {
		super(name);
	}

	@Override
	public void handleRequest(LeaveRequest leave) {
		if (leave.getLeaveDays() < 3) {
			System.out.println("����" + name + "����Ա��" + leave.getLeaveName() + "�����������ٵ�����" + leave.getLeaveDays());
		}
		else{
			if(this.leader!=null){
				this.leader.handleRequest(leave);
			}
		}
	}

}
