
package icebergs.model;

import java.util.Date;

public class Iceberg {
    
    private final String id ;
    private final Date spawnDate ;
    private final Origin origin;

    
    public String getId() {
        return id;
    }

    public Date getSpawnDate() {
        return spawnDate;
    }
    public Origin getOrigin() {
        return origin;
    }

    public Iceberg(String id, Date spawnDate, Origin origin) {
        this.id = id;
        this.spawnDate = spawnDate;
        this.origin = origin;
    }

}
