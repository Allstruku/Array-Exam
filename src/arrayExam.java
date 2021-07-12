import java.util.Arrays;

public class arrayExam {
	public static void main(String[] args) {
		int[] array1 = new int[100];
		// int indicates that the array created will be an integer type
		// [] indicates the creation of an array
		// array1 is the name of the array that is created
		// "new" is a keyword that is necessary to declare an array
		// int[100] means that the array created will have 100 spaces for integers
	// Unlike variables, it is impossible to change the number of spaces that arrays will contain
		
		array1[0] = 50;
	// To place an operand inside an index within the array,
	// name of array[index number] = operand intended to be placed
	// The indices of an array start from number 0. Therefore, the first index of array1 will be array1[0]
		array1[10] = 100;
	// The code above places the operand value of 100 within the 11th index of the array, array1
		
		int[] array2 = new int[] {1, 2, 3, 4, 5, 6};
	// the code above and below are ways to place operands into the array while they are created.
		int[] array3 = {1, 2, 3, 4, 5, 6};
	// such arrays are called one-dimensional arrays
		
		System.out.println(Arrays.toString(array2));
		System.out.println(Arrays.toString(array3));
	// the print method above prints entire array

	// to take value from the indices within the array, simply type the index of the operand you want to take from the array
		System.out.println(array3[3]);
		int i = array3[2];
		System.out.println(i);
	}
}
