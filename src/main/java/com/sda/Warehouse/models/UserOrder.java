package com.sda.Warehouse.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by RENT on 2017-09-09.
 */

@Setter
@Getter
@EqualsAndHashCode
@NoArgsConstructor
@Entity(name = "user_order")
public class UserOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "owner_id")
    private User owner;

    @OneToMany(mappedBy = "parentOrder", cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    private List<OrderDetails> orderDetailsList = new ArrayList<>();

    @Column
    private String orderNumber;

    @Column
    private LocalDate date;

    @Column
    private Double orderSum;

    @Column
    private Boolean isApproved;
}