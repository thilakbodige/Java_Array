import java.util.Scanner;
class RightShift_SecondHalf
{
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no of shift array");
	int a[]={1,2,3,4,5,6};
	int half_last=a[(a.length/2)-1];
		for(int i=(a.length/2)-1;i>0;i--)
		{
		a[i]=a[i-1];
		}
		a[0]=half_last;
	 System.out.print("a[]={");
		 for (int i:a)
		 {
		 System.out.print(i+",");
		 }
		 System.out.println("}");
	}
}
	
