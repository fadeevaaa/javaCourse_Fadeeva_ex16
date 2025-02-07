public class ThreadForCars implements Runnable {
    private Road road;

    public ThreadForCars(Road road) {
        this.road = road;
    }

    @Override
    public void run() {

        try {
            while (road.cars <= 3) {
                Thread.sleep(5000);
                road.cars++;
                System.out.println("Прибыло " + road.cars + " машин");
                if (road.cars == 4) {
                    System.out.println("Светофор для машин включен");
                    road.cars = 0;
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
