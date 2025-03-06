package dataTypes;

import org.jetbrains.annotations.NotNull;

public class Point {
    private int x,y;

    public Point(){
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "dataTypes.Point {" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public int[] getXY() {
        int[] result = new int[2];
        result[0] = this.x;
        result[1] = this.y;
        return result;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(){
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }

    public double distance(@NotNull Point point){
        int xDiff = this.x - point.getX();
        int yDiff = this.y - point.getY();
        return Math.sqrt(xDiff * xDiff + yDiff*yDiff);
    }

    public double distance(int x, int y){
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }
}
