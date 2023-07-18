package example3;

public class Example3 {
    public static void main(String[] args) {
        A a = new A() {
            @Override
            void method() {
                System.out.println("abstract class");
            }
        };

        a.value =10;

        A a1 = new A() {
            @Override
            void method() {

            }
        };
        a1.value =100;

        Object o = new Object() {

        };

        System.out.println(o.getClass());
    }
}

abstract class A {
    public int value;

    abstract void method();
}

class B extends Object{

}
