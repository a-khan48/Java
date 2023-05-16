import java.util.HashMap;
public class Abbreviations {
    HashMap<String, String> abbreviations;
    public Abbreviations(){
        this.abbreviations = new HashMap<>();
    }

    public static void main(String[] args) {
        Abbreviations abbreviations = new Abbreviations();
        abbreviations.addAbbreviation("e.g.", "for example");
        abbreviations.addAbbreviation("etc.", "and so on");
        abbreviations.addAbbreviation("i.e.", "more precisely");

        String text = "e.g. i.e. etc. lol";

        for (String part: text.split(" ")) {
            if(abbreviations.hasAbbreviation(part)) {
                part = abbreviations.findExplanationFor(part);
            } else {
                part = null;
            }

            System.out.println(part);
            System.out.println(" ");
        }

        System.out.println();

    }
    public void  addAbbreviation(String abbreviation, String explanation) {
        this.abbreviations.put(abbreviation, explanation);
    }
    private boolean hasAbbreviation(String part) {
        return this.abbreviations.containsKey(part);
    }
    private String findExplanationFor(String part) {
        return this.abbreviations.get(part);
    }
}
