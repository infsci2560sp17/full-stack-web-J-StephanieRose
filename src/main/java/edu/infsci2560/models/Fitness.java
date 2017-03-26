
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


public class Fitness {







   private static final long serialVersionUID = 1L;







   public enum FitnessType {


       Other,
       Aerobic,
       Anaerobic,
       StrengthTraining,
       Calesthenics,
       Stretching




   }







   @Id


   @GeneratedValue(strategy = GenerationType.AUTO)


   protected Long id;


   protected String title;


   protected FitnessType fitnessType;







   public Fitness() {


       this.id = Long.MAX_VALUE;


       this.title = null;


       this.fitnessType = FitnessType.Other;


   }







   public Fitness(Long id, String name, FitnessType fitnessType) {


       this.id = id;


       this.title = name;


       this.fitnessType = fitnessType;


   }







   @Override


   public String toString() {


       return "[ id=" + this.id + ", title=" + this.title + ", fitnessType=" + this.fitnessType + " ]";


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


    * @return the fitnessType


    */


   public FitnessType getFitnessType() {


       return fitnessType;


   }







   /**


    * @param fitnessType the fitnessType to set


    */


   public void setFitnessType(FitnessType fitnessType) {


       this.fitnessType = fitnessType;


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

