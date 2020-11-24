import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class File2 {

	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Number of students : ");
		n=sc.nextInt();
		FileOutputStream fos=null;
		DataOutputStream dos=null;
		for(int i=1;i<=n;i++)
		{
			System.out.println("enter the name of student : "+i);
			String name=sc.next();
			System.out.println("enter the date of birth of student : "+i);
			String dob=sc.next();
			System.out.println("enter the marks of subject1 : ");
			int s1=sc.nextInt();
			System.out.println("enter the marks of subject 2 : ");
			int s2=sc.nextInt();
			System.out.println("enter the marks subject3 : ");
			int s3=sc.nextInt();
			Student st=new Student(name,dob,s1,s2,s3);
			float avg=st.average(s1,s2,s3);
			int tot=st.total(s1,s2,s3);
			String filename=name.concat(".txt");
			String s="";
			s=s+"\n"+"Name : "+st.sname+"\n"+" Date of birth : "+st.sdob+"\n"+" Subject 1 marks: "+st.s1+"\n"+" Subject 2 marks "+st.s2+"\n"+" Subject 1 marks "+st.s3+"\n"+" Total : "+tot+"\n"+" Average :"+avg;
			try {
				fos=new FileOutputStream(filename);
				dos=new DataOutputStream(fos);
				byte[]b=s.getBytes();
				dos.write(b);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try
			{
				fos.close();
				dos.close();
			}
			finally
			{
				System.out.println("Data entered Successfully..!!");
			}
		}
	}

}
