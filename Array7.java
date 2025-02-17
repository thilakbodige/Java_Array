import java.util.Scanner;
class Array7
{
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter how many elements to store");
	int size = sc.nextInt();
	int a[]=new int[size];
	for(int i=0;i<=(size-1);i++)
	{
	  System.out.println("Enter the Element");
	  int val =sc.nextInt();
	  a[i]=val;
	}
     for(int i : a)
	{
	  System.out.println(i);
}
}
}

