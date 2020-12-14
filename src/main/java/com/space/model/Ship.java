package com.space.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 * @author Vlad100 {@literal <fuuler10@mail.ru>}
 */

@Entity
@Table(name = "ship")

public class Ship implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "planet")
    private String planet;
    @Column(name = "shipType")
    private String shipType;
    @Column(name = "prodDate")
    private Date prodDate;
    @Column(name = "isUsed", nullable = false, columnDefinition = "boolean default false")
    private Boolean isUsed;
    @Column(name = "speed")
    private Double speed;
    @Column(name = "crewSize")
    private Integer crewSize;
    @Column(name = "rating")
    private double rating;

    public Ship() {
    }

    public Ship(Long id, String name, String planet, String shipType, Date prodDate, Boolean isUsed, Double speed, Integer crewSize, double rating) {
        this.id = id;
        this.name = name;
        this.planet = planet;
        this.shipType = ShipType.valueOf(shipType).toString();
        this.prodDate = prodDate;
        this.isUsed = isUsed;
        this.speed = speed;
        this.crewSize = crewSize;
        this.rating = rating;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlanet() {
        return planet;
    }

    public void setPlanet(String planet) {
        this.planet = planet;
    }

    public String getShipType() {
        return shipType;
    }

    public void setSnipType(String shipType) {
        this.shipType = ShipType.valueOf(shipType).toString();
    }

    public Date getProdDate() {
        return prodDate;
    }

    public void setProdDate(Date prodDate) {
        this.prodDate = prodDate;
    }

    public Boolean isUsed() {
        return isUsed;
    }

    public void setUsed(Boolean used) {
        isUsed = used;
    }

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    public Integer getCrewSize() {
        return crewSize;
    }

    public void setCrewSize(Integer crewSize) {
        this.crewSize = crewSize;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ship ship = (Ship) o;
        return Double.compare(ship.rating, rating) == 0 && Objects.equals(id, ship.id) && Objects.equals(name, ship.name) && Objects.equals(planet, ship.planet) && Objects.equals(shipType, ship.shipType) && Objects.equals(prodDate, ship.prodDate) && Objects.equals(isUsed, ship.isUsed) && Objects.equals(speed, ship.speed) && Objects.equals(crewSize, ship.crewSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, planet, shipType, prodDate, isUsed, speed, crewSize, rating);
    }
}
