package Developer_final_control_blok_2.Java.Controller;

public class Counter implements AutoCloseable {

    static int sum;
    {
        sum = 0;
    }

    public void add() {
        sum++;
    }

    @Override
    public void close() {
        System.out.println("Counter closed");
    }
}
