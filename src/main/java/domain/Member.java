package domain;

import valuetype.Address;
import valuetype.Period;
import valuetype.PhoneNumber;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "MEMBER")
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "MEMBER_ID")
    private Long id;
    @Column(name = "NAME")
    private String name;
    private Integer age;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "MEMBER_ID")
    private List<AddressEntity> addressEntityList = new ArrayList<>();

    @OneToMany(mappedBy = "member", fetch = FetchType.LAZY)
    private List<Order> orders = new ArrayList<>();

    @Embedded
    private Period period;
//
//    @Embedded
//    @AttributeOverrides(
//            @AttributeOverride(name = "city", column = @Column(name = "company_city"))
//    )
//    private Address homeAddress;

    @Embedded
    private PhoneNumber phoneNumber;

    @ManyToOne
    @JoinColumn(name = "TEAM_ID")
    private Team team;

    @ElementCollection
    @CollectionTable(name = "HOBBY", joinColumns = @JoinColumn(name = "MEMBER_ID"))
    @Column(name = "hobby_name")
    private Set<String> hobbies = new HashSet<>();

    @ElementCollection
    @CollectionTable(name = "ADDRESS_HISTORY", joinColumns = @JoinColumn(name = "MEMBER_ID"))
    private List<Address> addressHistory = new ArrayList<Address>();

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "PHONE_HISTORY", joinColumns = @JoinColumn(name = "MEMBER_ID"))
    private List<PhoneNumber> phoneHistory = new ArrayList<>();

    public void setTeam(Team team) {
        this.team = team;
    }

    public Team getTeam() {
        return team;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public void setPeriod(Period period) {
        this.period = period;
    }
//
//    public void setHomeAddress(Address homeAddress) {
//        this.homeAddress = homeAddress;
//    }

    public void setPhoneNumber(PhoneNumber phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public Period getPeriod() {
        return period;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }

    public Set<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(Set<String> hobbies) {
        this.hobbies = hobbies;
    }

    public List<Address> getAddressHistory() {
        return addressHistory;
    }

    public void setAddressHistory(List<Address> addressHistory) {
        this.addressHistory = addressHistory;
    }

    public List<PhoneNumber> getPhoneHistory() {
        return phoneHistory;
    }

    public void setPhoneHistory(List<PhoneNumber> phoneHistory) {
        this.phoneHistory = phoneHistory;
    }
}
