import java.util.ArrayList;
import java.util.List;

public class Dealership {
    private List<String> carList = new ArrayList<>();

    public Dealership() {
    }

    public synchronized void produceOneCar(String name) {
        carList.add(name);
        notify();
    }

    public synchronized void getOneCar() {
        if (carList.size() == 0) {
            System.out.println("Покупатель " + Thread.currentThread().getName() + ": у диллера нет машин, ожидаю поставки.");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        carList.remove(0);
        System.out.println("Покупатель " + Thread.currentThread().getName() + ": купил новую машину.");
    }
}
