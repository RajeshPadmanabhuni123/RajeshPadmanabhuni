
public class Main_Arithmetic_2D {
	public void Addition(int a[][],int b[][],int n,int m)
	{
		System.out.println("Addition of two arrrays: ");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.print((a[i][j]+b[i][j])+" ");
			}
			System.out.println();
		}
	}

	public void subtraction(int a[][],int b[][],int n,int m)
	{
		System.out.println("Subtraction of two arrrays: ");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.print((a[i][j]-b[i][j])+" ");
			}
			System.out.println();
		}
	}
	public void multiplication(int a[][],int b[][],int n,int m)
	{
		System.out.println("Addition of two arrrays: ");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				int sum=0;
				for(int k=0;k<m;k++)
				{
					sum+=a[i][k]*b[k][j];
				}
				System.out.print(sum+" ");
			}
			System.out.println();
		}
	}
}
