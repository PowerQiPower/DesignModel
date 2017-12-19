package tx.cn.proxypattern;
/**
 * 
 * @作者：齐帅
 *描述：代理角色调用真实juese
 *
 */
public class PermissonProxy implements AbstractPermission {

	private RealPermission perssion ;
	private int level;
	
	
	public void setLevel(int level) {
		this.level = level;
	}


	public PermissonProxy( int level) {
		perssion=new RealPermission();
		this.level = level;
	}
	

	
	
	public void modifyUserInfo() {
		if(0==level){
			System.out.println("对不起，你没有权限");
		}
		else if(1==level){
			perssion.modifyUserInfo();
		}
		
	}

	public void viewNote() {
		System.out.println("查看帖子");
	}

	public void publishNote() {
		if(0==level){
			System.out.println("对不起，你没有权限");
		}
		else if(1==level){
			perssion.publishNote();
		}
		
	}

	public void modifyNote() {
		if(0==level){
			System.out.println("对不起，你没有权限");
		}
		else if(1==level){
			perssion.modifyNote();
		}
	}




}
