package com.pavlus.lab2.models;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
@Table(name = "tour_tb")

public class Tour implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int tourCode;

//    @ManyToOne
//    @JoinColumn(name="tourist_id")
//    private Tourist tourist;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(foreignKey = @ForeignKey(name = "tourist_id"), name = "tourist_id")
    @JsonIgnoreProperties(value = {"tour_tb", "hibernateLazyInitializer"})
    private Tourist tourist;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(foreignKey = @ForeignKey(name = "city_code"), name = "city_code")
    @JsonIgnoreProperties(value = {"tour_tb", "hibernateLazyInitializer"})
    private City city;

    private String tourName;
    private int duration;
    private int price;
    private String description;

}

