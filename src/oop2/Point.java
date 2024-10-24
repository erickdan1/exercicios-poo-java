package oop2; //[Exercicios]: OOP [equals, toString e herança]

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
        validate(x, this.y);
        this.x = x;
    }
    public void setY(int y) {
        validate(this.x, y);
        this.y = y;
    }

    public void moveBy(int dx, int dy) {
        validate(dx, dy);
        setX(getX() + dx);
        setY(getY() + dy);
    }

    // (1)
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {  // Verifica se é nulo ou de classes diferentes
            return false;
        }
        Point point = (Point) o;  // Casting
        return x == point.x && y == point.y;
    }

    // (2)
    @Override
    public String toString() {
        if (getClass() == oop2.ScreenPoint.class) {
            return "ScreenPoint(" + x + ", " + y + ")";
        }
        return "Point(" + x + ", " + y + ")";
    }

    // Método de validação do invariante de Point
    private void validate(int x, int y) {
        if (getClass() == oop2.ScreenPoint.class) {
            if (!(x >= 0 && x <= 300) && (y >= 0 && y <= 300)) {
                throw new IllegalArgumentException("Coordenadas devem ser positivas, e menores ou iguais a 300.");
            }
        }
        if (!((x >= 0 && x <= 400) && (y >=0 && y <= 400))) {
            throw new IllegalArgumentException("Coordenadas devem ser positivas, e menores ou iguais a 400.");
        }
    }
}

