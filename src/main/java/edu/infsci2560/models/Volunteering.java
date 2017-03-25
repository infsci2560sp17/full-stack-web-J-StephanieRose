
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


public class Volunteering {







   private static final long serialVersionUID = 1L;







   public enum VolunteeringType {


       Other,
       PittsburghCares,
       EducationPartnership,
      LoveliFoundations,
       HabitatForHumanity,
       BikePittsburgh,
       SalvationArmy




   }







   @Id


   @GeneratedValue(strategy = GenerationType.AUTO)


   protected Long id;


   protected String title;


   protected VolunteeringType volunteeringType;







   public Volunteering() {


       this.id = Long.MAX_VALUE;


       this.title = null;


       this.volunteeringType = VolunteeringType.Other;


   }







   public Volunteering(Long id, String name, VolunteeringType volunteeringType) {


       this.id = id;


       this.title = name;


       this.volunteeringType = volunteeringType;


   }







   @Override


   public String toString() {


       return "[ id=" + this.id + ", title=" + this.title + ", volunteeringType=" + this.volunteeringType + " ]";


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


    * @return the volunteeringType


    */


   public VolunteeringType getVolunteeringType() {


       return volunteeringType;


   }







   /**


    * @param volunteeringType the volunteeringType to set


    */


   public void setVolunteeringType(VolunteeringType volunteeringType) {


       this.volunteeringType = volunteeringType;


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

