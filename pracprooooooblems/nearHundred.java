public class nearHundred {
    public boolean nearHundred(int n) {
        if (n > 89 && n < 111 || n > 189 && n < 211){ // determines if n is within 100 or 200 by 10
            return true; // if n is within 100 or 200 by 10, returns true.
        }
        return false; // if n is not within 100 or 200 by 10, returns false.
    }



// given int num
// return true if within 10 of 100 OR 200
// note: math.abs(num) computes the absolute value of a number. (DID NOT USE)
}
