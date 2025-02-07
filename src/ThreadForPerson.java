public class ThreadForPerson implements Runnable {
    private Road road;

    public ThreadForPerson(Road road) {
        this.road = road;
    }

    @Override
    public void run() {
        try {
            while (road.person <= 4) {
                Thread.sleep(2000);
                road.person++;
                System.out.println("Прибыло " + road.person + " человек");
                if (road.person == 5) {
                    System.out.println("Светофор для пешеходов включен");
                    road.person = 0;
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
