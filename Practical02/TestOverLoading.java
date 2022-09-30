package Practical02;
// Write a java program to implement method overloading to perform addition of two integers and three integers.

class Adder {
    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    static float add(float a, float b, float c) {
        return a + b + c;
    }
}

class TestOverLoading {
    public static void main(String[] args) {
        System.out.println(Adder.add(11, 11));
        System.out.println(Adder.add(11, 11, 11));
        System.out.println(Adder.add(11f, 11f, 11f));
    }
}