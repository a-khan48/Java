public class diff21 {
    public int diff21(int n) {
        if (n < 21){ // If n is less than 21
            return 21 - n; // return 21 - n (absolute difference)
        }
        return (n - 21) * 2; // if n is greater, return absolute difference of n - 21 doubled
    }

// given int num
// return absolute difference between num and 21 ("return 21 - n;")
// return double the absolute difference only if n is over 21 ("return (n - 21) * 2;")
}
