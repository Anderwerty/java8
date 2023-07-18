package example1;

public class Example1 {
    public static void main(String[] args) {
        A a1 = new A() {
            @Override
            public void method() {
                System.out.println("method");
            }
        };

        A a2 = new A() {
            @Override
            public void method() {
                System.out.println("method2");
            }
        };

        System.out.println(a1.getClass());
        System.out.println(a2.getClass());

        A a3 = () -> System.out.println("method2");

        A a4 = Example1::printStaticMethod4;
        Example1 example1 = new Example1();
        A a5 = example1::printNonStaticMethod4;

    }

    public static Example1 createInstance(){
        return new Example1();
    }

    private static void printStaticMethod4() {
        System.out.println("method4");
    }

    public void printNonStaticMethod4() {
        System.out.println("method4");
    }
}

@FunctionalInterface
interface A {
    public abstract void method();
}
