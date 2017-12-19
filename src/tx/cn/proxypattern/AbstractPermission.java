package tx.cn.proxypattern;
/**
 * 
 * @作者：齐帅
 *描述：论坛权限控制代理
 *
 */
public interface AbstractPermission {
	//修改用户权限判断方法
	public void modifyUserInfo();
	//观看方法
	public void viewNote();
	//发布信息
	public void publishNote();
	//修改发布信息
	public void modifyNote();
	//设值权限值
	public void setLevel(int level);
}
