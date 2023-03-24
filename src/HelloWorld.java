

public class HelloWorld{

public static void main(String[] args) {
    System.out.println("Hello, World");

    int myFavoriteNumber = 3;
    System.out.println(myFavoriteNumber);

    String myString = "Why hello there";
    System.out.println(myString);

    double myNumber = 3.14;
    System.out.println(myNumber);

    int x = 5;
    System.out.println(x++);
    System.out.println(x);

    int y = 5;
    System.out.println(++y);
    System.out.println(y);


//    ***Exception in thread "main" java.lang.ClassCastException: class java.lang.String cannot be cast to class java.lang.Integer (java.lang.String and java.lang.Integer are in module java.base of loader 'bootstrap')
//    at HelloWorld.main(HelloWorld.java:29)***
//    String theNumberThree = "three";
//    Object o = theNumberThree;
//    int three = (int) o;
//    System.out.println(three);

//    ***incompatible types error***
//    int three = (int) "three";
//    System.out.println(three);

    int z = 4;
    z += 5;

    int a = 3;
    int b = 4;
    b *= a;

    int c = 10;
    int d = 2;
    c /= d;
    d -= c;

    byte shorty = 127;
    System.out.println(shorty);
    System.out.println(++shorty);
}

}

