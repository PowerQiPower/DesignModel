package tx.cn.proxypattern;
/**
 * 
 * @���ߣ���˧
 *��������̳Ȩ�޿��ƴ���
 *
 */
public interface AbstractPermission {
	//�޸��û�Ȩ���жϷ���
	public void modifyUserInfo();
	//�ۿ�����
	public void viewNote();
	//������Ϣ
	public void publishNote();
	//�޸ķ�����Ϣ
	public void modifyNote();
	//��ֵȨ��ֵ
	public void setLevel(int level);
}
