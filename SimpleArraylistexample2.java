import java.util.ArrayList;

public class SimpleArraylistexample2{
    public static void main(String[] args) {
        ArrayList<Integer> aList = new ArrayList<Integer>();
        aList.add(12);
        aList.add(14);
        aList.add(16);

        ArrayList<Integer> bList = new ArrayList<Integer>(aList);
        bList.add(45);
        bList.add(50);
        System.out.println(aList);
        System.out.println(bList);
    }
}