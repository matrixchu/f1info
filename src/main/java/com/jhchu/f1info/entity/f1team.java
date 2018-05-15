package com.jhchu.f1info.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "f1_team")
public class f1team implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "team_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long team_id;

    @Column(name = "team_name")
    private String team_name;

    @Column(name = "team_shortname")
    private String team_shortname;

    @Column(name = "team_country")
    private String team_country;

    @Column(name = "team_location")
    private String team_location;

    @Column(name = "team_time")
    private String team_time;

    @Column(name = "team_sponsors")
    private String team_sponsors;

    @Column(name = "team_powerunit")
    private String team_powerunit;

    @Column(name = "team_constructor")
    private String team_constructor;

    @Column(name = "is_current")
    private String is_current;

    @Column(name = "team_desc")
    private String team_desc;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getTeam_id() {
        return team_id;
    }

    public void setTeam_id(Long team_id) {
        this.team_id = team_id;
    }

    public String getTeam_name() {
        return team_name;
    }

    public void setTeam_name(String team_name) {
        this.team_name = team_name;
    }

    public String getTeam_shortname() {
        return team_shortname;
    }

    public void setTeam_shortname(String team_shortname) {
        this.team_shortname = team_shortname;
    }

    public String getTeam_country() {
        return team_country;
    }

    public void setTeam_country(String team_country) {
        this.team_country = team_country;
    }

    public String getTeam_location() {
        return team_location;
    }

    public void setTeam_location(String team_location) {
        this.team_location = team_location;
    }

    public String getTeam_time() {
        return team_time;
    }

    public void setTeam_time(String team_time) {
        this.team_time = team_time;
    }

    public String getTeam_sponsors() {
        return team_sponsors;
    }

    public void setTeam_sponsors(String team_sponsors) {
        this.team_sponsors = team_sponsors;
    }

    public String getTeam_powerunit() {
        return team_powerunit;
    }

    public void setTeam_powerunit(String team_powerunit) {
        this.team_powerunit = team_powerunit;
    }

    public String getTeam_constructor() {
        return team_constructor;
    }

    public void setTeam_constructor(String team_constructor) {
        this.team_constructor = team_constructor;
    }

    public String getIs_current() {
        return is_current;
    }

    public void setIs_current(String is_current) {
        this.is_current = is_current;
    }

    public String getTeam_desc() {
        return team_desc;
    }

    public void setTeam_desc(String team_desc) {
        this.team_desc = team_desc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof f1team)) return false;
        f1team f1team = (f1team) o;
        return Objects.equals(getTeam_id(), f1team.getTeam_id()) &&
                Objects.equals(getTeam_name(), f1team.getTeam_name()) &&
                Objects.equals(getTeam_shortname(), f1team.getTeam_shortname()) &&
                Objects.equals(getTeam_country(), f1team.getTeam_country()) &&
                Objects.equals(getTeam_location(), f1team.getTeam_location()) &&
                Objects.equals(getTeam_time(), f1team.getTeam_time()) &&
                Objects.equals(getTeam_sponsors(), f1team.getTeam_sponsors()) &&
                Objects.equals(getTeam_powerunit(), f1team.getTeam_powerunit()) &&
                Objects.equals(getTeam_constructor(), f1team.getTeam_constructor()) &&
                Objects.equals(getIs_current(), f1team.getIs_current()) &&
                Objects.equals(getTeam_desc(), f1team.getTeam_desc());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getTeam_id(), getTeam_name(), getTeam_shortname(), getTeam_country(), getTeam_location(), getTeam_time(), getTeam_sponsors(), getTeam_powerunit(), getTeam_constructor(), getIs_current(), getTeam_desc());
    }

    @Override
    public String toString() {
        return "f1team{" +
                "team_id='" + team_id + '\'' +
                ", team_name='" + team_name + '\'' +
                ", team_shortname='" + team_shortname + '\'' +
                ", team_country='" + team_country + '\'' +
                ", team_location='" + team_location + '\'' +
                ", team_time='" + team_time + '\'' +
                ", team_sponsors='" + team_sponsors + '\'' +
                ", team_powerunit='" + team_powerunit + '\'' +
                ", team_constructor='" + team_constructor + '\'' +
                ", is_current='" + is_current + '\'' +
                ", team_desc='" + team_desc + '\'' +
                '}';
    }
}
