package Generic;

public class Main {
    public static void main(String[] args) {
        CustomQueue Q = new CustomQueue(3);
        Q.enqueue(2);
        Q.enqueue(5);
        Q.enqueue(7);

        System.out.println(Q.dequeue());
        System.out.println(Q.dequeue());
        System.out.println(Q);
    }
}
