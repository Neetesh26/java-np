
public class Main {

    // interface------------>
    public static void doSomeStuff(Bird b) {
        b.fly();
        b.eat();
        b.sleep();
        // b.walking();
    }

    // second interface
    public static void doSomeOtherStuff(Walk w) {

        w.walking();
    }
    
    // ----------------------------

    public static void main(String[] args) {

        // Bird b = new Sparrow();
        // b.fly();
        // b.eat();

        doSomeStuff(new Sparrow());
        doSomeOtherStuff(new Sparrow());

        doSomeStuff(new Crow());
        doSomeOtherStuff(new Crow());
    }
}
