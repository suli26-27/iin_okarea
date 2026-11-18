/*
Készítette: Más
Refaktorálta: Erős István, 2026-11-18, II-N
Forkolva: rearea projektből https://github.com/oktat/rearea
*/

public class Triangle implements Shape {
    double base;
    double height;
    Double area;
    public void calcArea(){
        this.area = this.base * this.height / 2;
    }
    public Double getArea() {
        return area;
    }

}
