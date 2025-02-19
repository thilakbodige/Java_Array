import java.util.Scanner;
class CommonValueTwoArray
{
	public static void main(String[]args)
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the value stored in array");
	int a[]={4,-1,0,11,3};
	int b[]={7,5,3,9,1};
	
	for(int i=0;i<=(a.length-1);i++)
	{
		for(int j=0;j<=(b.length-1);j++)
		{
			if(a[i]==b[j])
			{
		System.out.println(a[i]);
		break;
			}
		}
		
	}
}
}