package icebergs.model;

import java.util.Date;

public class IcebergLocation implements IcebergEvent{

    private final Date date;
    
    private final Iceberg iceberg;
    
    private final double x;
    private final double y;

    @Override
    public Iceberg getIceberg() {
        return iceberg;
    }

    @Override
    public Date getDate() {
        return date;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public IcebergLocation(Date date, Iceberg iceberg, double x, double y) {
        this.date = date;
        this.iceberg = iceberg;
        this.x = x;
        this.y = y;
    }
}
