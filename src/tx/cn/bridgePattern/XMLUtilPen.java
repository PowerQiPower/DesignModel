package tx.cn.bridgePattern;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLUtilPen {
	//该方法用于从XML配置文件中提取具体的类名，并返回一个实例对象
	public static Object getBean(String args){
		try{
		DocumentBuilderFactory dFactory=DocumentBuilderFactory.newInstance();
		DocumentBuilder builder=dFactory.newDocumentBuilder();
		Document doc=builder.parse(new File("configPen.xml"));
		NodeList nl=null;
		Node classNode=null;
		String name=null;
		nl=doc.getElementsByTagName("className");
		if(args.equals("color"))
		{
			//获取包含类名的文本节点
			classNode=nl.item(0).getFirstChild();
		}
		else if(args.equals("pen")){
			//获取包含类名的文本节点
			classNode=nl.item(1).getFirstChild();
		}
		name=classNode.getNodeValue();
		//通过类名生成实例对象并返回
		Class c=Class.forName(name);
		Object obj=c.newInstance();
		return obj;
	}
		catch(Exception e){
			e.printStackTrace();
			return null;
			}
		}
		}
