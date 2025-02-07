public class Main {
    public static void main(String[] args) {
        Road road = new Road(0, 0);

        ThreadForPerson threadForPerson  = new ThreadForPerson(road);
        new Thread(threadForPerson, "threadForPerson").start();

        ThreadForCars threadForCars  = new ThreadForCars(road);
        new Thread(threadForCars, "threadForCars").start();

        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.exit(0);
    }
}