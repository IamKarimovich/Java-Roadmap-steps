public class Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyThread());
        t1.start();

        System.out.println(t1.getState());
        System.out.println(t1.getName());
        System.out.println(t1.getPriority());

        Thread t2 = new Thread(new MyThread());
        t2.start();

        System.out.println(t2.getName());
        System.out.println(t2.getPriority());

    }
}