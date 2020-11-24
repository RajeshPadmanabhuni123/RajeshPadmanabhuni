import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class File1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fil=null;
		DataOutputStream dos=null;
			try {
				for(int i=1;i<=5;i++)
				{
					String filename="Rajesh"+i+".txt";
					fil=new FileOutputStream(filename);
				
				dos=new DataOutputStream(fil);
				dos.writeByte(120);
				dos.writeInt(559);
				dos.writeDouble(51.05);
				dos.writeChar('R');
				dos.writeUTF("Rajesh Rockzz");
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally
			{
				fil.close();
				dos.close();
			}
			FileInputStream fis=null;
			DataInputStream dis=null;
			try
			{
				for(int i=0;i<5;i++)
				{
				String filename="Rajesh"+i+".txt";
				fis= new FileInputStream(filename);
				dis=new DataInputStream(fis);
				int in=dis.readInt();
				byte by=dis.readByte();
				double d=dis.readDouble();
				char c=dis.readChar();
				String str=dis.readUTF();
				System.out.println("Output:\n"+by+" byte\n "+ in+" integer\n "+d+" double\n "+c+" char\n "+str+" String");
				}
			}
			finally
			{
				try
				{
				fis.close();
				dis.close();
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				
			}
	}
}
