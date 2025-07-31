package practice;

class Tank {
    private boolean isReleased = false;

    public void fill() {
        System.out.println("Tank is filled.");
    }

    public void empty() {
        System.out.println("Tank is emptied.");
    }

    public void releaseTank() {
        isReleased = true;
        System.out.println("Tank is properly released.");
    }

    @Override
    protected void finalize() throws Throwable {
        if (!isReleased) {
            System.out.println("Warning: Tank was not released before cleanup!");
        } else {
            System.out.println("Tank cleanup verified.");
        }
        super.finalize();
    }
}

public class TankTest {
    public static void main(String[] args) {

        Tank tank1 = new Tank();
        tank1.fill();
        tank1.empty();
        tank1.releaseTank();
        tank1 = null;

        Tank tank2 = new Tank();
        tank2.fill();
        tank2.empty();

        tank2 = null;

        System.gc();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Sleep interrupted.");
        }

        System.out.println("Main ends.");
    }
}



/*
Tank is filled.
Tank is emptied.
Tank is properly released.
Tank is filled.
Tank is emptied.
Warning: Tank was not released before cleanup!
Tank cleanup verified.
Main ends.
*/