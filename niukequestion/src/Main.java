public class Main {
    public static void main(String[] args) {
        A a0 = new A();
        A a1 = new B();
        A a2 = new C();
        System.out.println(a2.getName() + ((C) a2).getSex() + ((C) a2).getAge());
    }
}
