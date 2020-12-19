package com.company;

public class Main {

    public static double computeArea(Point3d a, Point3d b, Point3d c) throws Exception {
        if (a.equals(b) || b.equals(c) || c.equals(a)) {
            throw new Exception("Some points are equal");
        }

        double sideA = a.distanceTo(b);
        double sideB = b.distanceTo(c);
        double sideC = c.distanceTo(a);
        double P2 = (sideA + sideB + sideC) / 2;

        return Math.round(Math.sqrt(P2 * (P2 - sideA) * (P2 - sideB) * (P2 - sideC)) * 100.0) / 100.0;
    }

    public static void main(String[] args) {
        Point3d a = new Point3d();
        Point3d b = new Point3d(2, 3, 4);
        Point3d c = new Point3d(4, 5, 6);

        try {
            System.out.println(computeArea(a, b, c));
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

