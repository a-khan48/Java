import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list1 = Display("C:\\Users\\admin\\Documents\\Coding\\Repos\\Full Stack 103\\Java\\IO\\input1.txt");
        List<Integer> list2 = Display("C:\\Users\\admin\\Documents\\Coding\\Repos\\Full Stack 103\\Java\\IO\\input2.txt");

        List<Integer> mergedList = mergeLists(list1, list2);
        writeTo("merge.txt", mergedList);

        List<Integer> commonElements = findCommonElements(list1, list2);
        writeTo("common.txt", commonElements);
    }

    private static List<Integer> Display(String filename) {
        List<Integer> list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                list.add(Integer.parseInt(line));
            }
        } catch (FileNotFoundException e) {
            System.err.println("Could not find " + filename);
        } catch (IOException e) {
            System.err.println("Could not display " + filename);
        } catch (NumberFormatException e) {
            System.err.println("Formatting not valid in " + filename);
        }
        return list;
    }

    private static void writeTo(String filename, List<Integer> list) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (int num : list) {
                writer.write(Integer.toString(num));
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Could not write to " + filename);
        }
    }

    private static List<Integer> mergeLists(List<Integer> list1, List<Integer> list2) {
        List<Integer> mergedList = new ArrayList<>(list1);
        mergedList.addAll(list2);
        return mergedList;
    }

    private static List<Integer> findCommonElements(List<Integer> list1, List<Integer> list2) {
        List<Integer> commonElements = new ArrayList<>(list1);
        commonElements.retainAll(list2);
        return commonElements;
    }
}