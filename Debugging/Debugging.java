public class Debugging {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};  //part 2: int[] array = null;
        double average = calcArray(array);
        System.out.println("Average of numbers: " + average);
    }
    public static double calcArray(int[] array) {

        int sum = 0;

        for (int i = 0; i < array.length; i++) {   //part 1: for (int i = 0; i > array.length; i++) {
            sum += array[i];  //part 2: sum += array[5]; //part 3: sum = array[i];
        }

        return (double) sum / array.length;

    }
}

// Part 1: When I had finished writing the method, the first error I had ran into was a
// logic error. My code ran, but would always return 0.0 for the average.
// because of this, I decided to use the debugger to debug my code instead of using print commands.
// I placed my first breakpoint at line 9, and then stepped into the lines after, as I knew that was where the error was.
// I played around with values for line 9 and line 11, until I realized there was a syntax error in "i < array.length"
// which I had accidentally typed "i > array.length"

// Part 2: For the second requirement, I initialized my array as "null" which induced a NullPointerException at line 3.
// Part 2: I also set my array index at "5" which is one over the indexes in the array. This induced an ArrayIndexOutOfBounds at line 12.

// For the NullPointException, I placed my break point at lines 3 and 9, after stepping into line 9 is where I found the array initializes.
// I tried setting the value of the array, changing it from null to the required array. I kept getting "Invalid Expression:" while trying to set
// After a bit of research I realized I needed to initialize a new array inside the set value parameter. After this, I was able to successfully debug my code.

// For the ArrayOutOfBoundsException, I had to rewrite a bit of my code, as when I tried to debug, I was unable to set the value of the Array. I'm still unsure of why,
// but after rewriting my code by separating my code into different methods and writing a return statement, I was able to update the values of the array from
// "Array[5]" to "Array[i]".

// Part 3: For the logic error in part 3, I removed the "+" symbol from "sum += array[i];" on line 12, this induces a logic error
// which causes the sum to be equal to the index of the array. as the index of the array increases, the sum will be equal to the index of the array.
// to fix this, I changed the code in Intellij, then used the HotSwap feature to reload the classes, which allowed me to continue debugging and verify that the code was functional.




