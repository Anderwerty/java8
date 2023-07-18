package example2;

public class Example2 {
    public static void main(String[] args) {
        A a = (message, times) -> {
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i <times ; i++) {
                builder.append(message).append("\n");
            }

            return builder.toString();
        };

        A a1 = new A() {
            @Override
            public String method(String message, int times) {
                return null;
            }

            @Override
            public String method(String message) {
                return A.super.method(message);
            }


            private void privateMethod(){};
        };

        String result = a.method("Hello", 5);
        System.out.println(result);
        System.out.println(a.method("Hi"));

        System.out.println(a.getClass());
    }
}

@FunctionalInterface
interface A {
    abstract String method(String message, int times);

    default String method(String message){
        return message;
    }

    public static void staticMethod(){
        System.out.println("static method");
    }
}

class AImpl implements A{

    @Override
    public String method(String message, int times) {
        return null;
    }

    @Override
    public String method(String message) {
        return "...........";
    }
}
