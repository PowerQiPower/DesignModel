package tx.cn.bridgePattern;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLUtilPen {
	//�÷������ڴ�XML�����ļ�����ȡ�����������������һ��ʵ������
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
			//��ȡ�����������ı��ڵ�
			classNode=nl.item(0).getFirstChild();
		}
		else if(args.equals("pen")){
			//��ȡ�����������ı��ڵ�
			classNode=nl.item(1).getFirstChild();
		}
		name=classNode.getNodeValue();
		//ͨ����������ʵ�����󲢷���
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
