package icebergs.model;

import java.util.Date;

public interface IcebergEvent {
    Date getDate();
    Iceberg getIceberg();
}
