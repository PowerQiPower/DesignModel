package tx.cn.abtractproduct;


import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLUtil {
	//该方法用于从XML配置文件中提取具体类名，并返回一个实例化对象
	//DOM和反射机制
	public static Object getBean(){
		try {
			//创建DOM文档对象
		DocumentBuilderFactory dFactory=DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder= dFactory.newDocumentBuilder();
		Document doc;
		
		 doc= dBuilder.parse(new File("config.xml"));
		 
		 //获取包含类名的文本节点
		 NodeList nl=doc.getElementsByTagName("className");
	     Node classNode=nl.item(0).getFirstChild();
	     String  cName=classNode.getNodeValue();
	     System.out.println(cName);
	     
	     
	     //通过类名生成实例对象并将其返回
	    Class c= cName.getClass();
	 //  System.out.println(c.getName()+"-----------");
	    // Class c=Class.forName(cName);
	    Object obj= c.newInstance();
	    System.out.println(obj.getClass()+"+++++++++++++");
	    return obj.getClass();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
