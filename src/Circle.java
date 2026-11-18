/*
Készítette: Más
Refaktorálta: Erős István, 2026-11-18, II-N
Forkolva: rearea projektből https://github.com/oktat/rearea
*/

public class Circle implements Shape {
    double radius;
    Double area;
    public void calcArea() {
        this.area = Math.pow(radius, 2) * Math.PI;
    }    
    public Double getArea() {
        return this.area;
    }
}
