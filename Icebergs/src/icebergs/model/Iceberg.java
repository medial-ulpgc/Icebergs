
package icebergs.model;

import java.util.Date;
import java.util.Objects;

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

    @Override
    public String toString() {
        return "Iceberg{" + "id=" + id + ", spawnDate=" + spawnDate + ", origin=" + origin + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if( !this.getClass().equals(obj.getClass()) ){
            return false;
        }
        return this.id.equals(((Iceberg)obj).getId());
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.id);
        return hash;
    }
    
    

}
