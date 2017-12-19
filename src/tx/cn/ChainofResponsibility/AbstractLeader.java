package tx.cn.ChainofResponsibility;
/**
 * 
 * @���ߣ���˧
 *�����������쵼�� 
 *������һ���������͵ĺ�̶���successor����Ϊ�¼ҵ����ã�ͬʱ��Ҳ�����˳������������handleRequest()
 */
public abstract class AbstractLeader {
		protected String name;
		protected AbstractLeader leader;
		public AbstractLeader(String name) {
			this.name = name;
		}
		public void setLeader(AbstractLeader leader) {
			this.leader = leader;
		}
		
		public abstract void handleRequest(LeaveRequest Leave);
		
		
}
