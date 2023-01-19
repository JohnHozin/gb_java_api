package lection_1;

public class Program {
    public static void main(String[] args) {
        System.out.println("hello");
        float f = 123.45f;
        System.out.println(f);
        var a2 = 123;
        var b = 123.45f;
        System.out.println(getType(f));
        System.out.println(getType(a2));
        System.out.println(getType(b));

        int a = 123;
        System.out.println(a);
        a = a-- - --a;
        System.out.println(a);
        a = 123;
        a = --a - a--;
        System.out.println(a);

        int a3 = 5;
        int b3 = 2;
        System.out.println(a3 | b3);
        // 101
        // 010
        // 111
        System.out.println(a3 & b3);
        System.out.println(a3 ^ b3);

        boolean a1 = true;
        boolean b1 = true;
        System.out.println(a1 & b1);
        System.out.println(a1 && b1);

    }

    static String getType(Object o) {
        return o.getClass().getSimpleName();
    }
}