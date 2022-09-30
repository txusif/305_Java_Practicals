// Write a java program to implement multilevel inheritance  with largest, even ,odd and factorial of two numbers functionality.

class A {
    int a, b;

    public void largest() {
        if (a > b) {
            System.out.println(a + " is bigger than " + b);
        } else {
            System.out.println(b + " is bigger than " + a);
        }
    }
}

class B extends A {
    public void oddeven() {
        if (a % 2 == 0) {
            System.out.println(a + " is even");
        } else {
            System.out.println(a + " is odd");
        }

        if (b % 2 == 0) {
            System.out.println(b + " is even");
        } else {
            System.out.println(b + " is odd");
        }
    }
}

class C extends B {
    public int fact() {
        int fact = 1;
        for (int i = 1; i <= a; i++) {
            fact = fact * i;
        }
        return fact;
    }
}

class Practical4 extends C {
    public static void main(String args[]) {
        C obj = new C();
        obj.a = 5;
        obj.b = 10;
        obj.largest();

        obj.oddeven();
        int y = obj.fact();
        {
            System.out.println(y + " is factorial of " + obj.a);
        }
    }
}