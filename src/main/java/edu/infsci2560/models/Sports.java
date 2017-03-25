
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


public class Sports {







   private static final long serialVersionUID = 1L;







   public enum SportsType {


       Other,


       Basketball,


       Baseball,


       Bowling,
       Gymnastics,
       Hockey,
       Paintball,
       Snowboarding,
       Wrestling




   }







   @Id


   @GeneratedValue(strategy = GenerationType.AUTO)


   protected Long id;


   protected String title;


   protected SportsType sportsType;







   public Sports() {


       this.id = Long.MAX_VALUE;


       this.title = null;


       this.sportsType = SportsType.Other;


   }







   public Sports(Long id, String name, SportsType sportsType) {


       this.id = id;


       this.title = name;


       this.sportsType = sportsType;


   }







   @Override


   public String toString() {


       return "[ id=" + this.id + ", title=" + this.title + ", sportsType=" + this.sportsType + " ]";


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


    * @return the sportsType


    */


   public SportsType getSportsType() {


       return sportsType;


   }







   /**


    * @param sportsType the sportsType to set


    */


   public void setSportsType(SportsType sportsType) {


       this.sportsType = sportsType;


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

