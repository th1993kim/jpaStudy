package domain;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "CAR")
public class Car extends BaseEntity{

    private int price;
}
