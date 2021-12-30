package jpabook.jpashop.domain;

import javax.persistence.*;

@Entity
public class Delivery {

    @Id
    @GeneratedValue
    private Long id;

    private String city;

    private String street;

    private String zip;

    private DeliveryStatus status;

    @OneToOne(mappedBy = "delivery")
    private Order order;

}