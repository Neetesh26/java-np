// abstract class Bird {

//     abstract void fly();

//     abstract void eat();
// }

// class Sparrow extends Bird{
//     @Override
//     void fly(){
//         System.out.println("Sparrow is flying...");
//     }
//     @Override
//     void eat(){
//         System.out.println("Sparrow is eating...");
//     }
// }
// class Crow extends Bird{
//     @Override
//     void fly(){
//         System.out.println("Crow is flying...");
//     }
//     @Override
//     void eat(){
//         System.out.println("Crow is eating...");
//     }
// }

// New java version Infterface <-----> abstract class

interface Bird {
    void fly();

    void eat();

    default void sleep() {
        System.out.println("sleeping...");
    }
}

interface Walk {
    void walking();
}


class Sparrow implements Bird, Walk {
    // @Override
    public void fly() {
        System.out.println("From Interface Sparrow is flying...");
    }

    // @Override
    public void eat() {
        System.out.println("From Interface Sparrow is eating...");
    }

    // @Override
    public void walking() {
        System.out.println("From Interface Sparrow is walking...");
    }
}

class Crow implements Bird, Walk {
    // @Override
    public void fly() {
        System.out.println("From Interface Crow is flying...");
    }

    // @Override
    public void eat() {
        System.out.println("From Interface Crow is eating...");
    }

    public void walking() {
        System.out.println("From Interface crow is walking...");
    }
}