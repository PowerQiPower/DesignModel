package tx.cn.abtractproduct;


import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLUtil {
	//�÷������ڴ�XML�����ļ�����ȡ����������������һ��ʵ��������
	//DOM�ͷ������
	public static Object getBean(){
		try {
			//����DOM�ĵ�����
		DocumentBuilderFactory dFactory=DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder= dFactory.newDocumentBuilder();
		Document doc;
		
		 doc= dBuilder.parse(new File("config.xml"));
		 
		 //��ȡ�����������ı��ڵ�
		 NodeList nl=doc.getElementsByTagName("className");
	     Node classNode=nl.item(0).getFirstChild();
	     String  cName=classNode.getNodeValue();
	     System.out.println(cName);
	     
	     
	     //ͨ����������ʵ�����󲢽��䷵��
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
