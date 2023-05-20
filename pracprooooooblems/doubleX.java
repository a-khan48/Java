public class doubleX {
    boolean doubleX(String str) {
        int index = str.indexOf("x"); // Finds the first instance of x in the string

        if (index == -1 || index + 1 >= str.length()) { // checks if x isn't in the string or if it's the last char in it
            return false;
        }

        return str.charAt(index + 1) == 'x'; // checks if there is any more x's after the first instance.
    }
}
