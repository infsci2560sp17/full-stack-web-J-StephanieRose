/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.infsci2560.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *
 * @author kolobj
 */
@Entity
public class Interest {

    private static final long serialVersionUID = 1L;

    public enum InterestType {
        Other,
        Arts_Crafts,
        Sports,
        Cooking,
        Reading,
        Volunteering,
        Gaming,
        Music,
        Fitness
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    protected String title;
    protected InterestType interestType;

    public Interest() {
        this.id = Long.MAX_VALUE;
        this.title = null;
        this.interestType = InterestType.Unknown;
    }

    public Interest(Long id, String name, InterestType interestType) {
        this.id = id;
        this.title = name;
        this.interestType = intrestType;
    }

    @Override
    public String toString() {
        return "[ id=" + this.id + ", title=" + this.title + ", interestType=" + this.interestType + " ]";
    }

    @Override
    public boolean equals(Object other) {
        return EqualsBuilder.reflectionEquals(this, other);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    /**
     * @return the name
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the name to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the interestType
     */
    public InterestType getInterestType() {
        return interestType;
    }

    /**
     * @param interestType the interestType to set
     */
    public void setInterestType(InterestType interestType) {
        this.interestType = interestType;
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

}
