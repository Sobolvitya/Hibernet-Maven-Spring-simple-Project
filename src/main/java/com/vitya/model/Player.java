package com.vitya.model;

import javax.persistence.*;
import javax.validation.constraints.Size;

/**
 * Created by Vitya on 29.05.2016.
 */
@Entity
@Table(name= "player")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Size(min = 3, max = 50)
    @Column(name = "name", nullable = false)
    private String name;


    @ManyToOne
    @JoinColumn (name = "clubID")
    private Team team;

    @ManyToOne
    @JoinColumn (name = "countryName")
    private Country country;

    @ManyToOne
    @JoinColumn (name = "agentID")
    private Agent agent;

    public Agent getAgent() {
        return agent;
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    @Override
    public String toString() {
        return "Player{" +
                "agent=" + agent +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", team=" + team +
                ", country=" + country +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Player player = (Player) o;

        if (id != player.id) return false;
        if (agent != null ? !agent.equals(player.agent) : player.agent != null) return false;
        if (country != null ? !country.equals(player.country) : player.country != null) return false;
        if (name != null ? !name.equals(player.name) : player.name != null) return false;
        if (team != null ? !team.equals(player.team) : player.team != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (team != null ? team.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (agent != null ? agent.hashCode() : 0);
        return result;
    }



}
