public class Point {
    private int x;
    private int y;
    private String namePoint;

    Point(int x, int y, String namePoint) {
        this.x = x;
        this.y = y;
        this.namePoint = namePoint;
    }

    void setX(int x) {
        this.x = x;
    }

    void setY(int y) {
        this.y = y;
    }

    void setNamePoint(String namePoint) {
        this.namePoint = namePoint;
    }

    int getX() {
        return x;
    }

    int getY() {
        return y;
    }

    String getNamePoint() {
        return namePoint;
    }
}
