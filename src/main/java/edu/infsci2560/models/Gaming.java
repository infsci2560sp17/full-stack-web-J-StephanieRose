
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


public class Gaming {







   private static final long serialVersionUID = 1L;







   public enum GamingType {


       Other,
       Nintendo,
       SegaGenesis,
       Atari,
       Xbox,
       Playstation,
       Gameboy




   }







   @Id


   @GeneratedValue(strategy = GenerationType.AUTO)


   protected Long id;


   protected String title;


   protected GamingType gamingType;







   public Gaming() {


       this.id = Long.MAX_VALUE;


       this.title = null;


       this.gamingType = GamingType.Other;


   }







   public Gaming(Long id, String name, GamingType gamingType) {


       this.id = id;


       this.title = name;


       this.gamingType = gamingType;


   }







   @Override


   public String toString() {


       return "[ id=" + this.id + ", title=" + this.title + ", gamingType=" + this.gamingType + " ]";


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


    * @return the gamingType


    */


   public GamingType getGamingType() {


       return gamingType;


   }







   /**


    * @param gamingType the gamingType to set


    */


   public void setGamingType(GamingType gamingType) {


       this.gamingType = gamingType;


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

