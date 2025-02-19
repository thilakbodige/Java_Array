import java.util.Scanner;
class  ProductofTwoArrays
{
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the product of Arrays");
	int size=sc.nextInt();
	int a[] ={8,-3,8,-2,9};
	int z[] ={5,7,-1,-4,-10};
	int result[]=new int[a.length];
	for(int i=0;i<=a.length-1;i++)
	{
		result[i]=a[i]*z[i];
	}
		System.out.print("result[]={");
		for(int i:result)
		{
			System.out.print(i+",");
	}
	System.out.println("}");
}
}