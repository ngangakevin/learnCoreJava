package dataTypes;

public class Line {
    Point begin, end;

    public Line(int x1, int y1, int x2, int y2){
        begin = new Point(x1, y1);
        end = new Point(x2,y2);
    }

    public Line(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }

    public Point getBegin() {
        return begin;
    }

    public void setBegin(Point begin) {
        this.begin = begin;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public int getBeginX(){
        return this.begin.getX();
    }

    public void setBeginX(int x) {
        this.begin.setX(x);
    }

    public int getBeginY(){
        return this.begin.getY();
    }

    public void setBeginY(int y) {
        this.begin.setY(y);
    }

    public int getEndX(){
        return this.end.getX();
    }

    public void setEndX(int x){
        this.end.setX(x);
    }

    public int getEndY(){
        return this.end.getY();
    }

    public void setEndY(int y){
        this.end.setY(y);
    }

    public double getLength() {
        return begin.distance(end);
    }

    @Override
    public String toString() {
        return "dataTypes.Line{" +
                "begin=" + begin +
                ", end=" + end +
                '}';
    }
}
