public class Main {

    public static void main(String[] args) {

        Figure figure = new Figure(new Point(0, 0, "A"),
                new Point(4, 8, "B"),
                new Point(3, 7, "C"));

        double LengthSide_1 = figure.LengthSide(figure.getPoint_1(), figure.getPoint_2());
        double LengthSide_2 = figure.LengthSide(figure.getPoint_2(), figure.getPoint_3());
        double LengthSide_3 = figure.LengthSide(figure.getPoint_3(), figure.getPoint_1());


        System.out.println("Длина стороны многоугольника 1: " +LengthSide_1);
        System.out.println("Длина стороны многоугольника 2: " +LengthSide_2);
        System.out.println("Длина стороны многоугольника 3: " +LengthSide_3);

        System.out.print("\n  Периметр многоугольника : ");
        figure.PerimeterCalculator(figure);
    }
}
