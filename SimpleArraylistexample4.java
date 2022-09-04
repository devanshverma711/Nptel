import java.util.ArrayList;

public class SimpleArraylistexample4 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Bob");
        names.add("John");
        names.add("Steve");
        names.add("Kaya");
        names.add("Maria");
        names.add("Henry");

        System.out.println("Bob exits "+names.contains("Bob"));
        System.out.println("indexof\"Steve\": "+names.indexOf("Steve"));
        System.out.println("indexof\"Mark\": "+names.indexOf("Mark"));
        System.out.println("Last Index of John"+ names.lastIndexOf("John"));
        System.out.println("Last Index of Phill"+ names.lastIndexOf("Phill"));
    }
}
