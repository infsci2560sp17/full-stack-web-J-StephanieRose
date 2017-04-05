/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.infsci2560.models;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Embeddable;

/**
 *
 * @author kolobj
 */
@Embeddable
public class RatingPk implements Serializable {
    // http://www.thejavageek.com/2014/05/01/jpa-embeddedid-example/
    
    private Long interestId;
    private Long customerId;
    
    public RatingPk() {
        
    }
    
    public RatingPk(Long interestId, Long customerId) {
        this.interestId = interestId;
        this.customerId = customerId;   
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
                return true;
        if (obj == null)
                return false;
        if (getClass() != obj.getClass())
                return false;
        RatingPk other = (RatingPk) obj;
        if ( !Objects.equals(other.interestId, interestId) )
            return false;

        return Objects.equals(other.getCustomerId(), getCustomerId());

    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.getInterestId());
        hash = 29 * hash + Objects.hashCode(this.getCustomerId());
        return hash;
    }

    /**
     * @return the interestId
     */
    public Long getInterestId() {
        return interestId;
    }

    /**
     * @param interestId the interestId to set
     */
    public void setInterestId(Long interestId) {
        this.interestId = interestId;
    }

    /**
     * @return the customerId
     */
    public Long getCustomerId() {
        return customerId;
    }

    /**
     * @param customerId the customerId to set
     */
    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }
    
}