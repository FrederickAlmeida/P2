public class Point {
    private int x = 0, y = 0;

    public int getX() { return x; }
    public int getY() { return y; }

    public void setX(int x) {
        if (areCoordsValid(x, x)){
            this.x = x; 
        } else {
            throw new IllegalArgumentException("As coordenadas devem ser inteiros positivos, menores ou igual a 400.");
        }
    }

    public void setY(int y) { 
        if (areCoordsValid(y, y)){
            this.y = y; 
        } else {
            throw new IllegalArgumentException("As coordenadas devem ser inteiros positivos, menores ou igual a 400.");
        }
    }

    public void moveBy(int dx, int dy) {
        if (areCoordsValid(dx + getX(), dy + getY())) {
            setX(getX() + dx);
            setY(getY() + dy);
        } else {
            throw new IllegalArgumentException("As coordenadas devem ser inteiros positivos, menores ou igual a 400.");
        }
    }

    public Point(int x, int y) {
        if (areCoordsValid(x, y)) {
            this.x = x;
            this.y = y;
        } else {
            throw new IllegalArgumentException("As coordenadas devem ser inteiros positivos, menores ou igual a 400.");
        }
    }

    private boolean areCoordsValid(int x, int y) {
        if (x < 0 || x > 400 || y < 0 || y > 400) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        try {
            Point teste = new Point(15, 12);
            System.out.println(teste.getX() + "," + teste.getY());
            teste.setX(90);
            teste.setY(400);
            System.out.println(teste.getX() + "," + teste.getY());

            //Point teste2 = new Point(-2, 12);
            //System.out.println(teste2.getX() + "," + teste2.getY());

            Point teste3 = new Point(15, 12);
            teste3.moveBy(50, 400);
            System.out.println(teste3.getX() + "," + teste3.getY());
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
    }
}