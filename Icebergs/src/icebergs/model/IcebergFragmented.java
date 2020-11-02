package icebergs.model;

import java.util.Arrays;
import java.util.Date;

public class IcebergFragmented implements IcebergEvent{

    private final Date date;
    private final Iceberg iceberg;
    private final Iceberg[] icebergsSpawned;//originally icebergs in UML scheme 

    public Iceberg[] getIcebergsSpawned() {
        return icebergsSpawned;
    }

    @Override
    public Iceberg getIceberg() {
        return iceberg;
    }

    @Override
    public Date getDate() {
        return date;
    }

    public IcebergFragmented(Date date, Iceberg iceberg, Iceberg[] icebergsSpawned) {
        assert(icebergsSpawned !=null && icebergsSpawned.length > 0 ); 
        this.date = date;
        this.iceberg = iceberg;
        this.icebergsSpawned = icebergsSpawned;
    }

    @Override
    public String toString() {
        return "IcebergFragmented{" + "date=" + date + ", iceberg=" + iceberg + ", icebergsSpawned=" + Arrays.toString(icebergsSpawned) + '}';
    }
    
    
}
