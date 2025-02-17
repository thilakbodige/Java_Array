import java.util.Arrays;
class HalfAscendingHalfDescending 
	{
    public static void main(String[] args) 
	{
		int a[]= {5, 2, 8, 1, 9, 3, 7, 6, 4};
		Arrays.sort(a);

        int b = a.length/2;

        System.out.println("First half of the array in ascending order:");
        for (int i = 0; i < b; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println("\nSecond half of the array in descending order:");
        for (int i = a.length-1; i >= b; i--) {
            System.out.print(a[i] + " ");
        }
    }
}