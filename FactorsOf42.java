import java.util.Scanner;
class FactorsOf42
{
 public static void main(String[] args) 
   {
	System.out.println("Factor of 42 in array");
    int a[]={1,2,3,4,6,7,14,15,21,24,42};
	     System.out.print("{");
	  for(int i=0;i<=a.length-1;i++)
		{

		if(42%a[i]==0)
		  {
	    System.out.print(a[i]+",");
	      }

		}	
	System.out.println("}");
   }
}