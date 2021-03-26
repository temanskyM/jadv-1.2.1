public class Consumer implements Runnable {
    Dealership dealership;

    public Consumer(Dealership dealership) {
        this.dealership = dealership;
    }

    @Override
    public void run() {
        System.out.println("Покупатель " + Thread.currentThread().getName() + ": запущен.");
        System.out.println("Покупатель" + Thread.currentThread().getName() + ": хочу купить машину иду к диллеру.");
        dealership.getOneCar();
    }
}

