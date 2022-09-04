import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person{
    private String name;
    private Integer age;

    public Person(String name ,Integer age) {
        this.name=name;
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public Integer getAge(){
        return age;
    }
    public void setAge(Integer age){
        this.age = age;
    }
    @Override
    public String toString(){
        return "("+"name='"+name+'\''+",age="+age+')';
    }
}
public class SimpleArraylistexample5 {
    public static void main(String[] args) {
        List<Person> people  = new ArrayList<>();
        people.add(new Person("Sachin", 47));
        people.add(new Person("Chris",34));
        people.add(new Person("Rajeev",25));
        people.add(new Person("David",31));
        System.out.println("Person List: "+ people);

        people.sort((o1, o2) ->{
            return o1.getAge()-o2.getAge();
        } );
        people.sort(Comparator.comparingInt(Person::getAge));

        System.out.println("Sorted Person List by Age "+ people);
           
        Collections.sort(people,Comparator.comparing(Person::getName));
        System.out.println("Sorted Person List by Name: "+ people);
        
    }
    
}
