import java.util.Arrays;

public class Point2D {
    private float x;
    private float y;

    public Point2D() {
        this.x = 0.0F;
        this.y = 0.0F;
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return this.x;
    }

    public float getY() {
        return this.y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        
        float[] xy = {this.x, this.y};
        return xy;
    }

    public String toString() {
        return "x: " + this.getX() 
                + "\nY: " + this.getY()
                + "\nXY: " + Arrays.toString(this.getXY());
    }
}