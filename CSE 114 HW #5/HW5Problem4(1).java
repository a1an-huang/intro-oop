//Alan Huang 113443530 CSE114.02 HW# problem 4
import java.util.ArrayList;
import java.util.Arrays;
public class HW5Problem4 {    
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("Austin", "Dallas", "San Fransisco"));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Boston", "Chicago", "Denver", "Seattle"));
        System.out.println("List 1 : "  + list1);
        System.out.println("List 2 : "  + list2);
        System.out.println("Merged List : " + mergeList(list1, list2));
    }
    public static ArrayList<String> mergeList(ArrayList<String> list1, ArrayList<String> list2) {
        ArrayList<String> result = new ArrayList<String>();
        int i = 0;
        int j = 0;
        while (i < list1.size() || j < list2.size()) {
            if(i < list1.size() && (j >= list2.size() || list1.get(i).compareTo(list2.get(j)) < 0)) {
                result.add(list1.get(i++));
            }
            else {
                result.add(list2.get(j++));
            }
        }
        return result;
    }
}
