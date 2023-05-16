import java.util.HashMap;
import java.util.ArrayList;
public class IOU {
    private HashMap<String, Double> list;

    public IOU() {
        this.list = new HashMap<>();
    }

    public static void main(String[] args) {

        IOU mattsIOU = new IOU();
        mattsIOU.setSum("Arthur", 51.5);
        mattsIOU.setSum("Michael", 30);

        System.out.println(mattsIOU.howMuchDoIOweTo("Arthur"));
        System.out.println(mattsIOU.howMuchDoIOweTo("Michael"));
    }

    public void setSum(String toWhom, double amount){
        this.list.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom){
        return (this.list.get(toWhom) == null)? 0 : this.list.get(toWhom);
    }

}