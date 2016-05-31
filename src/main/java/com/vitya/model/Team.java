package com.vitya.model;



/**
 * Created by Vitya on 29.05.2016.
 */

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name= "team")
public class Team {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;

    @Size (min = 3, max = 50)
    @Column(name = "name", nullable = false)
    private String name;

    @Size(min=3, max=50)
    @Column(name = "city", nullable = false)
    private String city;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Team team = (Team) o;

        if (id != team.id) return false;
        if (city != null ? !city.equals(team.city) : team.city != null) return false;
        if (name != null ? !name.equals(team.name) : team.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Team{" +
                "city='" + city + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
