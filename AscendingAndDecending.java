import java.util.Scanner;
class AscendingAndDecending
{
	public static void main(string(args
	Scanner scanner = new Scanner(System.in);
   System.out.println("Enter the size of the array:");
    int size = scanner.nextInt();

	int a[]={4,-1,0,11,3,5};
	int array=new int[size];
	System.out.print("Enter the Size of Elements");
	for(int i=0;i<size;i++){
		array[i]=sc.nextInt();
	}
	   int mid = size/2;
	   int first_half=Arrays.copyORange(array,0,mid);
	   int second_half=Arrays.copyOrange(array,mid,size);
	   Arrays.sort(first_half);
	   reverseArray(second_half);
	   System.out.println("First_half in ascending order");
	   System.out.println("second_half in ascending order");
	   
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
	
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the size of the array:");
int size = scanner.nextInt();


# Step 2: Create the Array
Create an array of the specified size.

int[] array = new int[size];


# Step 3: Get Array Elements
Get the elements of the array from the user.

System.out.println("Enter " + size + " elements:");
for (int i = 0; i < size; i++) {
    array[i] = scanner.nextInt();
}


# Step 4: Calculate Mid Index
Calculate the mid index of the array.

int mid = size / 2;


# Step 5: Split Array into Two Halves
Split the array into two halves.

int[] firstHalf = Arrays.copyOfRange(array, 0, mid);
int[] secondHalf = Arrays.copyOfRange(array, mid, size);


# Step 6: Sort First Half
Sort the first half of the array in ascending order.

Arrays.sort(firstHalf);


# Step 7: Reverse Second Half
Reverse the second half of the array to get descending order.

reverseArray(secondHalf);


# Step 8: Print Results
Print the sorted first half and reversed second half.

System.out.println("First half in ascending order:");
printArray(firstHalf);

System.out.println("Second half in descending order:");
printArray(secondHalf);


# Helper Methods
Reverse Array
Reverse an array.

public static void reverseArray(int[] array) {
    int left = 0;
    int right = array.length - 1;
    while (left < right) {
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
        left++;
        right--;
    }
}


Print Array
Print an array.

public static void printArray(int[] array) {
    for (int element : array) {
        System.out.print(element + " ");
    }
    System.out.println();
}
