import java.util.Scanner;
class Array2D
{
	public static void main(String[]args)
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the value stored in array");
	int a[][]={{1,2,3},{4,5,6},{7,8,9}};
	
	for(int i=0;i<=(a.length)-1;i++)
		{
		System.out.print("{");
			{
		for(int j=0;j<=(a[i].length)-1;j++)
		
			{
				System.out.print(a[i][j]+",");
				
			}
			{
			System.out.println("}");
			
		    }
	}
	}
	}
}
			
