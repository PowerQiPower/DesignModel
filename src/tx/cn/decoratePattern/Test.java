package tx.cn.decoratePattern;
/**
 * 
 * @���ߣ���˧
 * ��ʽ����������Decorater()δ����ΪĬ�Ϲ��캯�������붨����ʽ���캯��
 *��������������������Ϊ
 *װ��ģʽ==���������������/��ṹ��ģʽ��
 */
public class Test {
	public static void main(String[] args) {
		Transform tran=new Car();
		tran.move();
		System.out.println("-----------------");
		Robat robot=new Robat(tran);
		robot.move();
		
		
		System.out.println("000000000000000000000000000");
		tran.move();
		Airphone air=new Airphone(tran);
		air.move();
	}

}
