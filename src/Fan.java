public class Fan {
    int slow = 1;
    int medium = 2;
    int fast = 3;
    private int speed = slow;
    private boolean onOff = false;
    private double radius = 5;
    private String color = "blue";

    public Fan() {
    }

    public Fan(boolean onOff, double radius, String color) {
        this.onOff = onOff;
        this.radius = radius;
        this.color = color;
    }

    public Fan(int speed, boolean onOff, double radius, String color) {
        this.speed = speed;
        this.onOff = onOff;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOnOff() {
        return onOff;
    }

    public void setOnOff(boolean onOff) {
        this.onOff = onOff;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (this.onOff == true) {
            return "speed = " + speed +
                    ", color = " + color +
                    ", radius = " + radius;
        } else {
            return "fan is off";
        }
    }
}
