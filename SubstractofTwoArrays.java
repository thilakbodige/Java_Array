import java.util.Scanner;
class  SubstractofTwoArrays
{
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Substract of Arrays");
	int size=sc.nextInt();
	int a[] ={6,12,-9,5,1};
	int z[] ={-2,8,4,-3,-7};
	int result[]=new int[a.length];
	for(int i=0;i<=a.length-1;i++)
	{
		result[i]=a[i]-z[i];
	}
		System.out.print("result[]={");
		for(int i:result)
		{
			System.out.print(i+",");
	}
	System.out.println("}");
}
}