package tx.cn.ChainofResponsibility;
/**
 * 
 * @作者：齐帅
 *描述：抽象领导者 
 *定义了一个抽象类型的后继对象successor，作为下家的引用，同时塔也定义了抽象的请求处理方法handleRequest()
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
