import java.util.Scanner;
class Array2D_User
{
	public static void main(String[]args)
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the no of sub arrays:");
	int i=sc.nextInt();
	System.out.println("Enter the no of elements to store:");
	int j=sc.nextInt();
	int a[][]=new int[i][j];
	for(int z=0;z<=(a.length)-1;z++)
	{
	for(int y=0;y<=(a[z].length)-1;y++)
		{
		System.out.println("Enter the " + (z+1) + " Array " + (y+1) + " value " );
			int value=sc.nextInt();
		     a[z][y]=value;
		}
	}
	System.out.println("*******************\n*****************");
	for(int z=0;z<=(a.length)-1;z++)
		{
		System.out.println("{");
	for(int y=0;y<=(a[z].length)-1;y++)
			{
	System.out.print(a[z][y]+",");
			}
	System.out.println("}");
	break;
		}
	}
}
	
		 