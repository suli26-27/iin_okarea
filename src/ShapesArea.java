/*
Készítette: Más
Refaktorálta: Erős István, 2026-11-18, II-N
Forkolva: rearea projektből https://github.com/oktat/rearea
*/

public class ShapesArea {
    public void startTriangle() {
        System.out.println("Háromszög területe");

        String baseStr = Console.input("Alap: ");
        String heightStr = Console.input("Magasság: ");
    
        if (validateTriangle(baseStr, heightStr)) {
            startTriangleCalc(baseStr, heightStr);
        }
    }

    private boolean validateTriangle(String baseStr, String heightStr) {
        boolean validTriangle = true;
        validTriangle = Validator.isValidInput(baseStr);
        validTriangle = Validator.isValidInput(heightStr);
        return validTriangle;
    }

    private void startTriangleCalc(String baseStr, String heightStr) {
        Triangle triangle = new Triangle();
        triangle.base = Double.parseDouble(baseStr);
        triangle.height = Double.parseDouble(heightStr);
        triangle.calcArea();
        String format = "Háromszög területe: %f\n";
        System.out.printf(format, triangle.getArea());
    }

    public void startCircle() {
        System.out.println("Kör területe");

        String radiusStr = Console.input("Sugár: ");

        if (validatorCircle(radiusStr)) {
            startCircleCalc(radiusStr);
        }
    }

    private boolean validatorCircle(String radiusStr){
        boolean validCircle = true;
        validCircle = Validator.isValidInput(radiusStr);
        return validCircle;
    }

    private void startCircleCalc(String radiusStr){
            Circle circle = new Circle();
            circle.radius = Double.parseDouble(radiusStr);
            circle.calcArea();
            String format = "Kör területe: %f\n";
            System.out.printf(format, circle.getArea());
    }

    public void startRectangle() {
        System.out.println("Téglalap területe");

        String aSideStr = Console.input("a oldal: ");
        String bSideStr = Console.input("b oldal: ");

        if (validatorRectangle(aSideStr, bSideStr)) {
            startRectangleCalc(aSideStr, bSideStr);
        }
    }
    private boolean validatorRectangle(String aSideStr, String bSideStr){
        boolean validRectangle = true;
        validRectangle = Validator.isValidInput(aSideStr);
        validRectangle = Validator.isValidInput(bSideStr);
        return validRectangle;
    }
    private void startRectangleCalc(String aSideStr, String bSideStr){
          Rectangle rectangle = new Rectangle();
            rectangle.aSide = Double.parseDouble(aSideStr);
            rectangle.bSide = Double.parseDouble(bSideStr);
            rectangle.calcArea();
            String format = "Téglalap területe: %f\n";
            System.out.printf(format, rectangle.getArea());
    }    
}
