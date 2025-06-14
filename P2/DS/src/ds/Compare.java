package ds;
 class Point implements Comparable<Point> {

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.x;
        hash = 29 * hash + this.y;
        return hash;
    }
    private int x;
    private int y;

 

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Point point = (Point) obj;
        return this.x == point.x && this.y == point.y;
    }

    @Override
    public int compareTo(Point point) {
        if (point == null) return 1;

        if (this.x != point.x) {
            return Integer.compare(this.x, point.x);
        } else {
            return Integer.compare(this.y, point.y);
        }
    }

    public static void main(String[] args) {
        Point p1 = new Point(2, 3);
        Point p2 = new Point(2, 3);
        Point p3 = new Point(100, 27);

        System.out.println(p1.equals(p2)); // true
        System.out.println(p1.compareTo(p2)); // 0
        System.out.println(p1.compareTo(p3)); // > 0
    }
}
