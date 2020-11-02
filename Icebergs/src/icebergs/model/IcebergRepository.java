package icebergs.model;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class IcebergRepository {
    private final List<Iceberg> icebergs = new ArrayList<>(); //originally iceberg in the UML scheme
    private final List<IcebergEvent> icebergEvents = new ArrayList<>();

    public IcebergRepository() {
    }

    public boolean addIcebergEvent(IcebergEvent e) {
        return icebergEvents.add(e);
    }

    public boolean addIceberg(Iceberg e) {
        return icebergs.add(e);
    }
    
    public Stream<Iceberg> getIcebergs(Predicate<Iceberg> filter){
        if(filter == null){
            return getIcebergs();
        }
        return icebergs.stream().filter(filter);
    }
    public Stream<Iceberg> getIcebergs(){
        return icebergs.stream();
    }
    
    public Stream<IcebergEvent> getIcebergEvents(Predicate<IcebergEvent> filter){
        if(filter == null){
            return getIcebergEvents();
        }
        return icebergEvents.stream().filter(filter);
    }
    public Stream<IcebergEvent> getIcebergEvents(){
        return icebergEvents.stream();
    }

}
