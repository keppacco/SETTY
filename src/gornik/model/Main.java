package gornik.model;

import java.util.*;

public class Main {
    public static void main(String[] args) {
       Set<Integer> setHash = new HashSet<>();
       Set<Integer> setLinked = new LinkedHashSet<>();
       Set<Integer> setTree = new TreeSet<>();
       List<Integer> list = new ArrayList<>();

       Random random = new Random();

       int i = 0;
       while (i < 20)
       {
           int number = random.nextInt(100);
           setHash.add(number);
           setLinked.add(number);
           setTree.add(number);
           list.add(number);
           i++;
       }
        System.out.println("HashSet/n" + setHash);
        System.out.println("LinkedHashSet/n" + setLinked);
        System.out.println("TreeSet/n" + setTree);
        System.out.println("Lista/n" + list);

        List<Integer> list1 = new LinkedList<>(setLinked);
        System.out.println("LinkedList/n" + list1);
        System.out.println(list1.get(3));

//        List<Integer> list2 = new setHash<>(setHash);
////        System.out.println("Hashset/n" + list2);

        System.out.println("----------------------------------------------------\n");

        Set<Person> persons = new HashSet<>();
        Person person1 = new Person("Igor", "Wodz", 32, "03231231234");
        Person person2 = new Person("Adi", "Jankowski", 34, "05895723231");
        Person person3 = new Person("Piotr", "lala", 45, "05895723231");
        Person person4 = new Person("Mateusz", "Pochec", 10, "0884234232");
        Person person5 = new Person("Adi", "Kuerzepa", 10, "0884234232");

        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);

        for(Person person:persons) System.out.println(person);
        System.out.println("----------------------------------------------------\n");

        Set<Person> personTreeSet = new TreeSet<>(comp);
        ComparatorBySurname comp = new ComparatorBySurname();
        personTreeSet.add(person1);
        personTreeSet.add(person2);
        personTreeSet.add(person3);
        personTreeSet.add(person4);
        personTreeSet.add(person5);
        for(Person person:personTreeSet) System.out.println(person);



    }

}