public class Figure {
    private Point point_1;
    private Point point_2;
    private Point point_3;
    private Point point_4;
    private Point point_5;

    Figure(Point point_1, Point point_2, Point point_3) {
        this.point_1 = point_1;
        this.point_2 = point_2;
        this.point_3 = point_3;
    }

    Figure(Point point_1, Point point_2, Point point_3, Point point_4) {
        this.point_1 = point_1;
        this.point_2 = point_2;
        this.point_3 = point_3;
        this.point_4 = point_4;
    }

    Figure(Point point_1, Point point_2, Point point_3, Point point_4, Point point_5) {
        this.point_1 = point_1;
        this.point_2 = point_2;
        this.point_3 = point_3;
        this.point_4 = point_4;
        this.point_5 = point_5;
    }

    public Point getPoint_1() {
        return point_1;
    }

    public Point getPoint_2() {
        return point_2;
    }

    public Point getPoint_3() {
        return point_3;
    }

    public Point getPoint_4() {
        return point_4;
    }

    public Point getPoint_5() {
        return point_5;
    }

    double LengthSide(Point A, Point B){

        double LengthX;
        double LengthY;
        double Side;

        LengthX = (B.getX() - A.getX()) * (B.getX() - A.getX());
        LengthY = (B.getY() - A.getY()) * (B.getY() - A.getY());

        Side = LengthY + LengthX;

        return Math.sqrt(Side);
    }


    void PerimeterCalculator(Figure figure){
        double AB = LengthSide(figure.getPoint_1(), figure.getPoint_2());
        double BC = LengthSide(figure.getPoint_2(), figure.getPoint_3());
        double CA = LengthSide(figure.getPoint_3(), figure.getPoint_1());

        System.out.println(AB + BC + CA);
    }


}
