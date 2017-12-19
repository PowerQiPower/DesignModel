package tx.cn.proxypattern;

public class Client {
	public static void main(String[] args) {
		AbstractPermission perssion=new PermissonProxy(0);
		perssion.modifyUserInfo();
		perssion.viewNote();
		perssion.publishNote();
		perssion.modifyNote();
		System.out.println("-------------------------------");
		perssion.setLevel(1);
		perssion.modifyUserInfo();
		perssion.viewNote();
		perssion.publishNote();
		perssion.modifyNote();
	}
}
