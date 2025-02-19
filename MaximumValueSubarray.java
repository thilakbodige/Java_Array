import java.util.Scanner;
class MaximumValueSubarray 
 {
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int cols = sc.nextInt();

        int array[][] = new int[rows][cols];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < rows; i++) 
		{
            for (int j = 0; j < cols; j++) 
			{
                array[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) 
			{
            int max = array[i][0];
            for (int j = 1; j < cols; j++) 
			{
                if (array[i][j] > max) 
		    {
                    max = array[i][j];
                }
            }
            System.out.println("Maximum value in row " + (i + 1) + ": " + max);
        }
    }
}