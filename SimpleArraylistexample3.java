import java.util.ArrayList;
import java.util.function.Predicate;

public class SimpleArraylistexample3 {
    public static void main(String[] args) {
        ArrayList<String> langs = new ArrayList<String>();
        langs.add("C");
        langs.add("C++");
        langs.add("Java");
        langs.add("Python");
        langs.add("R");
        langs.add("Spark");
        System.out.println("Initial List: "+langs);

        langs.remove(5);
        System.out.println("After removal 5 "+ langs);

        boolean status = langs.remove("Smalltalks");
        System.out.println("Smalltalks is removed "+status);

        ArrayList<String> script = new ArrayList<String>(langs);
        script.add("Python");
        script.add("Sql");
        script.add("JavaScript");
        langs.removeAll(script);
        System.out.println("After removal of script "+ langs );

        script.removeIf(new Predicate<String>(){
            public boolean test(String s){
                return s.startsWith("C");
            }});
        System.out.println("After removal of All elements that starts with C "+script);
        langs.clear();
        System.out.println("List is empty? "+langs.isEmpty());
    }
    
}
