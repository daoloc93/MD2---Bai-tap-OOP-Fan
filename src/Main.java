public class Main {

    public static void main(String[] args) {

        Fan fan1 = new Fan(true, 10, "yellow");
        fan1.setSpeed(fan1.fast);
        Fan fan2 = new Fan(false, 10, "blue");
        fan2.setSpeed(fan2.medium);

    }
}
