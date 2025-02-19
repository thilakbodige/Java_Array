import java.util.Scanner;
class StudentDetails
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		for (int i=0;i<=9;i++)
		{
			String name[] = new String [10];
			System.out.println("Enter the name");
			name[i]=sc.next();
			
			int age[] = new int[10];
			System.out.println("Enter the age");
			 age[i]=sc.nextInt();
			
			double[] height = new double[10];
			System.out.println("Enter the height");
			height[i] = sc.nextDouble();
			
			double [] weight = new double[10];
			System.out.println("Enter the Weight");
			weight[i] = sc.nextDouble();

			String[] bloodgroup = new String[10];
			System.out.println("Enter the blood group");
			bloodgroup[i] = sc.next();

			int[] percentage = new int[10];
			System.out.println("Enter the Educational percentage"); 
			percentage[i] = sc.nextInt();

			char[] grade = new char[10];
			System.out.println("Enter the grade");
			grade[i] = sc.next().charAt(0);
			

            System.out.print("Student no."+(i+1)+ "=  { ");
			System.out.print(name[i]+",");
			System.out.print(age[i]+",");
			System.out.print(height[i]+",");
			System.out.print(weight[i]+",");
			System.out.print(bloodgroup[i]+",");
			System.out.print(percentage[i]+",");
			System.out.print(grade[i]+", ");

            System.out.println("}");
        }
		
	}
}