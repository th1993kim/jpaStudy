package domain;

import javax.persistence.*;

@Entity
@Table(name = "Address")
public class AddressEntity {
    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "address_id")
    private Long id;
    private String city;
    private String street;
    private String state;

}
