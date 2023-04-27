package test;

public class A {
    private int number;

    public A(int number) {
        this.number = number;
    }

    public A minus(B other) {
        return new A(this.number - other.getNumber());
    }

    public A plus(B other) {
        return new A(this.number + other.getNumber());
    }

    public A minus(int num) {
        return new A(this.number - num);
    }

    public int getNumber() {
        return number;
    }

    public String output() {
        return String.valueOf(this.number);
    }
}

public class B {
    private int number;

    public B(int number) {
        this.number = number;
    }

    public B minus(A other) {
        return new B(this.number - other.getNumber());
    }

    public B minus(int num) {
        return new B(this.number - num);
    }

    public int getNumber() {
        return number;
    }

    public String output() {
        return String.valueOf(this.number);
    }
}

public class Main {
    public static void main(String[] args) {
        A a = new A(10);
        B b = new B(20);

        System.out.println("A - B = -10" + a.minus(b).output());
        System.out.println("B - A = -20" + b.minus(a).output());
        System.out.println("A + B - 10 - 20=0" + a.plus(b).minus(10).minus(20).output());
    }
}

