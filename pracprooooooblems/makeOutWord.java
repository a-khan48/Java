public class makeOutWord {
    public String makeOutWord(String out, String word) {
        // out.substring returns the characters from the index given
        return out.substring(0, 2) + word + out.substring(2);
// in this case the beginning characters of the "out" string (indexes 0 to 2 but excluding 2) are extracted
// the word is then placed after, and the ending characters of the out string (indexes 2 and on)-
// are typed, resulting in the word string being inbetween the out string
    }

// given "out" string with a length of 4
// given another string, a word
// return a new string where the word is in the middle of the out string.
// so putting the word inbetween the first two and last two characters of the out string.
// ex: out: "[[]]" word: "stupid" result: "[[stupid]]"

}
