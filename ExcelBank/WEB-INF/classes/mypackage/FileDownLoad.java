package mypackage;
import java.io.*;
import java.net.*;


public class FileDownLoad
{
		public String d;
		public FileDownLoad(){}
		public boolean fileDownLoad(String s,String d)
		{
			boolean flag=false;
			try{
				Socket client=new  Socket("127.0.0.1",7080);
				d=d+"9";
				
				OutputStream b=client.getOutputStream();
				b.write(d.getBytes());
									
				FileInputStream fis=new FileInputStream(s);
				int c;
				while((c=fis.read())!=-1)
					b.write(c);
				flag=true;
				fis.close();
				b.close();
				client.close();
			}catch(Exception e){
				System.out.println(e);
			}
			return flag;
		}
		
}