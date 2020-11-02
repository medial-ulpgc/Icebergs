package icebergs.model;

import java.util.Date;

public class IcebergVolume implements IcebergEvent{

    private final Date date;
    
    private final Iceberg iceberg;
    
    private final double volume;

    public double getVolume() {
        return volume;
    }

    @Override
    public Iceberg getIceberg() {
        return iceberg;
    }

    @Override
    public Date getDate() {
        return date;
    }

    public IcebergVolume(Date date, Iceberg iceberg, double volume) {
        this.date = date;
        this.iceberg = iceberg;
        this.volume = volume;
    }

    
    
}
