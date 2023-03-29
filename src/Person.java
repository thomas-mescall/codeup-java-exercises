public class Person {

    private String name;

    //initialzer
    public Person(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }
    public void sayHello(){
        System.out.println("Why hello there " + this.name);
    }

    public static void main(String[] args) {
        //creating instance of person
        Person person = new Person("Tom");
        //testing getName
        System.out.println("Your name is: " + person.getName());
        //testing setName()
        person.setName("Tommy");
        System.out.println("Your new name is: " + person.getName());
        //testing sayHello()
        person.sayHello();

    }

}

