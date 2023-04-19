import java.lang.Thread;

class HelloThread extends Thread {
    public void run() {
        try {
            while (true) {
                System.out.println("Hello");
                sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class WorldThread extends Thread {
    public void run() {
        try {
            while (true) {
                System.out.println("World");
                sleep(3000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Par_35 {
    public static void main(String[] args) {
        HelloThread hello = new HelloThread();
        WorldThread world = new WorldThread();
        hello.start();
        world.start();
    }
}
