/*
Készítette: Más
Refaktorálta: Erős István, 2026-11-18, II-N
Forkolva: rearea projektből https://github.com/oktat/rearea
*/

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Alakzatok területe");
        startCalc();
    }

    private static void startCalc() {
        ShapesArea shapesArea = new ShapesArea();
        shapesArea.startTriangle();
        shapesArea.startCircle();
        shapesArea.startRectangle();
    }
}
