package com.vitya.model;

import javax.persistence.*;
import javax.validation.constraints.Size;

/**
 * Created by Vitya on 29.05.2016.
 */
@Entity
@Table(name = "country")
public class Country {


    @Id
    @Size(min = 3, max = 50)
    @Column(name = "name",unique = true,nullable = false)
    private String name;

    @Column (name = "rate",nullable = false)
    private byte rate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getRate() {
        return rate;
    }

    public void setRate(byte rate) {
        this.rate = rate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Country country = (Country) o;

        if (rate != country.rate) return false;
        if (name != null ? !name.equals(country.name) : country.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (int) rate;
        return result;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                '}';
    }
}
