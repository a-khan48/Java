public class sleepIn {
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (weekday == false || vacation == true){ // if it is not the weekday, or vacation is true
            return true; // you can sleep in!
        }
        return false; // you can't sleep in :(
    }


// weekday is TRUE if weekday
// vacation is TRUE if vacation
// sleepIn if not weekday or vacation true
}
