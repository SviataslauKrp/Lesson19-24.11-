public class Main {

    public static void main(String[] args) {

        Thread firstThread = new Thread(new FirstTaskThread());
        firstThread.setName("firstThread");
        Thread secondThread = new Thread(new FirstTaskThread());
        secondThread.setName("secondThread");
        Thread thirdThread = new Thread(new FirstTaskThread());
        thirdThread.setName("thirdThread");

        thirdThread.start();
        try {
            thirdThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        secondThread.start();
        try {
            secondThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        firstThread.start();
        try {
            firstThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        if (!thirdThread.isAlive()) {
            System.out.println(thirdThread.getName() + " is stopped");
        }
        if (!secondThread.isAlive()) {
            System.out.println(secondThread.getName() + " is stopped");
        }
        if (!firstThread.isAlive()) {
            System.out.println(firstThread.getName() + " is stopped");
        }

    }
}