class A {
    // Constructor
    A() {
        System.out.println("I am class A");
    }
}
// Class B extends A
class B extends A {
    // Constructor
    B() {
        super(); // calls constructor of class A
        System.out.println("I am class B");
    }
}
// Class C extends B
class C extends B {
    // Constructor
    C() {
        super(); // calls constructor of class B
        System.out.println("I am class C");
    }
}
public class Main {
    public static void main(String[] args) {
        A obj = new A();
        System.out.println("calling b");
        B obj2 = new B();
        System.out.println("calling c");
        C obj22 = new C();
    }
}
