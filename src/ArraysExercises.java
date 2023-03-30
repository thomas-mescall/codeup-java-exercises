import java.util.Arrays;


public class ArraysExercises {

    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));
        Person[] people = new Person[3];
        people[0] = new Person("Tom");
        people[1] = new Person("Tommy");
        people[2] = new Person("Thomas");

        for (Person person : people) {
            System.out.println(person.getName());
        }

        System.out.println("LINE BREAK LINE BREAK LINE BREAK");

        Person newPerson = new Person("Tomas");
        people = addPerson(people, newPerson);

        for(Person person : people) {
            System.out.println(person.getName());
        }

    }


            public static Person[] addPerson(Person[] people,Person newPerson){
                Person[] newPeople = Arrays.copyOf(people, people.length + 1);
                newPeople[newPeople.length - 1] = newPerson;
                return newPeople;
        }


}
