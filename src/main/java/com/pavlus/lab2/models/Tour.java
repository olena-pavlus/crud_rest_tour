package com.pavlus.lab2.models;

import java.io.Serializable;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain=true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table//(name = "tour")

public class Tour implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int tourCode;

    @ManyToOne
    @JoinColumn(name="tourist_id")
    private Tourist tourist;

    @ManyToOne
    @JoinColumn(name="city_code")
    private City city;

    @Column
    private String tourName;
    @Column
    private int duration;
    @Column
    private int price;
    @Column
    private String description;

}

