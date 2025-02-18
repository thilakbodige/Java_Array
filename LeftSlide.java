import java.util.Scanner;
class LeftSlide
{
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no of shift array");
	int n = sc.nextInt();
	char arr[]={'a','b','c','d'};
	while(n!=0)
		{
		char start = arr[0];
		for(int i=0;i<(a.length-1);i++)
			{
			arr[i]=arr[i+1];
			}
			arr[(arr.length)-1]=start;
			n--;
		}
	}
}
