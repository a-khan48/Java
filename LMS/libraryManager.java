import java.util.ArrayList;
import java.util.List;
public class libraryManager<T extends libraryItem> implements libraryOperations<T> {
    private List<T> libraryList;
    public libraryManager(){
        libraryList = new ArrayList<>();
    }

    @Override
    public void addItem(T item) {
        libraryList.add(item);
    }

    @Override
    public void removeItem(T item) {
        libraryList.remove(item);
    }

    @Override
    public void displayItems() {
        for (T item: libraryList){
            System.out.println(item.getItemDetails());
        }
    }
}
