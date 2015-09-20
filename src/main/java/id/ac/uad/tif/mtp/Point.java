package id.ac.uad.tif.mtp;

/**
 * [TODO: Documentation]
 *
 * @author Deny Prasetyo.
 */

public class Point {
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        if (x < 0 || y < 0) {
            throw new IllegalArgumentException("X or Y cannot negative");
        }
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        if (x < 0) {
            throw new IllegalArgumentException("X cannot negative");
        }
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        if (y < 0) {
            throw new IllegalArgumentException("X cannot negative");
        }
        this.y = y;
    }

    public double distance() {
        return Math.sqrt((this.x * this.x) + (this.y * this.y));
    }

    public double distance(int x, int y) {
        final int differenceX = this.x - x;
        final int differenceY = this.y - y;
        return Math.sqrt((differenceX * differenceX) + (differenceY * differenceY));
    }

    public double distance(Point other) {
        final int differenceX = this.x - other.x;
        final int differenceY = this.y - other.y;
        return Math.sqrt((differenceX * differenceX) + (differenceY * differenceY));
    }


}
