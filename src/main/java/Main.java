public class Main {
    private final static int MAX_CONSUMER = 5;

    public static void main(String[] args) {
        Dealership dealership = new Dealership();

        new Thread(new Producer(dealership)).start();

        for (int i = 0; i < MAX_CONSUMER; i++) {
            new Thread(new Consumer(dealership)).start();
        }

    }
}
