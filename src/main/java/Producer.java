public class Producer implements Runnable {
    Dealership dealership;
    private final int MAX_AUTO = 10;

    public Producer(Dealership dealership) {
        this.dealership = dealership;
    }

    @Override
    public void run() {
        System.out.println("Завод по производству автомобилей: запущен.");
        for (int i = 0; i < MAX_AUTO; i++) {
            try {
                Thread.sleep(2000);
                System.out.println("Завод по производству автомобилей: выпустил с конвеера машину с номером " + i);
                dealership.produceOneCar("newCar" + i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
