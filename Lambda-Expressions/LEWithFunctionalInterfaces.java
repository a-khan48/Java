public class LEWithFunctionalInterfaces {

        @FunctionalInterface
        interface Adder {
            int add(int a, int b);
        }
            public static void main(String[] args) {
                Adder adder = (a, b) -> a + b;
                int result = adder.add(3, 5);
                System.out.println(result);
            }


        }

