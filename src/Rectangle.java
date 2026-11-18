/*
Készítette: Más
Refaktorálta: Erős István, 2026-11-18, II-N
Forkolva: rearea projektből https://github.com/oktat/rearea
*/

public class Rectangle implements Shape {
    double aSide;
    double bSide;
    Double area;
    public void calcArea() {
        this.area = aSide * bSide;
    }
    public Double getArea() {
        return this.area;
    }
}
