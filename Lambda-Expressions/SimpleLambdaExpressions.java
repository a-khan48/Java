public class SimpleLambdaExpressions {
    public static void main (String[] args) {

        Addition add=(int a,int b)->(a + b);
        System.out.println(add.add(25,30));

        Subtraction sub=(int a,int b)->(a - b);
        System.out.println(sub.sub(30,25));

        Multiplication mul=(int a,int b)->(a * b);
        System.out.println(mul.mul(10,3));

        Division div=(int a,int b)->(a / b);
        System.out.println(div.div(5,2));

    }
    interface Addition{
        int add(int a,int b);
    }
    interface Subtraction{
        int sub(int a,int b);
    }
    interface Multiplication{
        int mul(int a,int b);
    }
    interface Division{
        int div(int a,int b);
    }
}
