import java.awt.*;

public class a_52codingExercisePoint {
    public static void main(String []args) {

    }

    private int x;
    private int y;

    public a_52codingExercisePoint() {

    }

    public a_52codingExercisePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return distance(0,0);
    }

    public double distance(int x, int y) {
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
    }

    public double distance(Point point) {
        return distance(point.x, point.y);
    }
}
