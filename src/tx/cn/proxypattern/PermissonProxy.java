package tx.cn.proxypattern;
/**
 * 
 * @���ߣ���˧
 *�����������ɫ������ʵjuese
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
			System.out.println("�Բ�����û��Ȩ��");
		}
		else if(1==level){
			perssion.modifyUserInfo();
		}
		
	}

	public void viewNote() {
		System.out.println("�鿴����");
	}

	public void publishNote() {
		if(0==level){
			System.out.println("�Բ�����û��Ȩ��");
		}
		else if(1==level){
			perssion.publishNote();
		}
		
	}

	public void modifyNote() {
		if(0==level){
			System.out.println("�Բ�����û��Ȩ��");
		}
		else if(1==level){
			perssion.modifyNote();
		}
	}




}
