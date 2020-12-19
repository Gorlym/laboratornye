package com.company;

public class Point3d extends Point2d {
    private double zCoord;

    public Point3d(double x, double y, double z) {
        super(x, y);
        zCoord = z;
    }

    public Point3d() {
        super();
        zCoord = 0;
    }

    public double getz() {
        return zCoord;
    }

    public void setz(double z) {
        zCoord = z;
    }

    public boolean equals(Point3d point) {
        return getx() == point.getx() && gety() == point.gety() && zCoord == point.zCoord;
    }

    public double distanceTo(Point3d point) {
        return Math.round(Math.sqrt(Math.pow(point.getx() - getx(), 2) + Math.pow(point.gety() - gety(), 2) + Math.pow(point.zCoord - zCoord, 2)) * 100.0) / 100.0;
    }
}
