
package icebergs;
import icebergs.model.*;
import java.util.Arrays;
import java.util.Date;

public class Icebergs {
    static int MAPX = 10;
    static int MAPY = 10;

    public static void main(String[] args) {

        IcebergRepository repository = new IcebergRepository();
        Arrays.stream( new Iceberg[]{ 
                    new Iceberg("A1",new Date(),Origin.Glacier),
                    new Iceberg("A2",new Date(),Origin.Glacier),
                    new Iceberg("B3",new Date(),Origin.Glacier),
                    new Iceberg("C4",new Date(),Origin.Glacier),
                    new Iceberg("D5",new Date(),Origin.Glacier),
                    new Iceberg("D6",new Date(),Origin.Glacier),
                    new Iceberg("B7",new Date(),Origin.Glacier),
                    new Iceberg("A8",new Date(),Origin.Glacier),
            }).forEach(x->{
                repository.addIceberg(x);
                repository.addIcebergEvent(new IcebergVolume(new Date(),x , Math.random()*200));
                repository.addIcebergEvent(new IcebergVolume(new Date(),x , Math.random()*200));
                repository.addIcebergEvent(new IcebergLocation(new Date(),x,Math.random()*MAPX,Math.random()*MAPY));
            });
        
        repository.getIcebergs().forEach(System.out::println);
        repository.getIcebergEvents().forEach(System.out::println);
    }
    
}
