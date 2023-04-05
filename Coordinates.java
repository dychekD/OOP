package OOP;

public class Coordinates {
    protected int x, y;

    public Coordinates (int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean isEquals (Coordinates target) {
        if (target.x == x && target.y == y) return true;
        return false;
    }
}


