package oop1; //[Exercicios]: OOP[construtor, encapsulamento & invariante]

public class Point {
    private int x, y;

    public Point(int x, int y) {
        validate(x, y);
        this.x = x;
        this.y = y;
    }

    public int getX() { return x; }
    public int getY() { return y; }

    public void setX(int x) {
        validate(this.x, y);
        this.x = x;
    }
    public void setY(int y) {
        validate(x, this.y);
        this.y = y;
    }

    public void moveBy(int dx, int dy) {
        validate(dx, dy);
        setX(getX() + dx);
        setY(getY() + dy);
    }

    // Método de validação do invariante de Point
    private void validate(int x, int y) {
        if (!((x >= 0 && x <= 400) && (y >=0 && y <= 400))) {
            throw new IllegalArgumentException("Coordenadas devem ser positivas, e menores ou iguais a 400.");
        }
    }
}
