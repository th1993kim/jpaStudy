package domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "MART")
public class Mart extends BaseEntity{
    private String address;
}
