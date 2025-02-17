import java.util.Scanner;
class AscendingOrder
{
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no of Ascending Order array");
	int a[]={4,-1,0,11,3};
	for(int i=0;i<=(a.length)-1;i++)
		{
	for(int j=0;j<(a.length)-1;j++)
		{
		if(a[j]>a[j+1])
			{
			int c=a[j];
			a[j]=a[j+1];
			a[j+1]=c;
			}
		}
		}
	 System.out.print("a[]={");
		 for (int i:a)
		 {
		 System.out.print(i+",");
		 }
		 System.out.println("}");
	
}
}
	

