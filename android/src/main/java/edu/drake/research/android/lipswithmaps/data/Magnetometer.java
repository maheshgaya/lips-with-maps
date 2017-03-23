package edu.drake.research.android.lipswithmaps.data;

/**
 * Created by Mahesh Gaya on 3/22/17.
 */

public class Magnetometer {
    public static final String TABLE_NAME = "magnetic";
    private double x;
    private double y;
    private double z;

    public Magnetometer(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }


    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

}
