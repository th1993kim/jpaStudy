package domain;

import javax.persistence.*;

@Entity
@Table(name="PRODUCT")
public class Product {
    @Id @GeneratedValue
    @Column(name = "PRODUCT_ID")
    private Long id;
    private String name;

}
