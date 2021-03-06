
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


public class Cooking {







   private static final long serialVersionUID = 1L;







   public enum CookingType {


       Other,


       American,


       Chinese,


       Indian,
       Japanese,
       Spanish,
       SoulFood,
       Deserts




   }







   @Id


   @GeneratedValue(strategy = GenerationType.AUTO)


   protected Long id;


   protected String title;


   protected CookingType cookingType;







   public Cooking() {


       this.id = Long.MAX_VALUE;


       this.title = null;


       this.cookingType = CookingType.Other;


   }







   public Cooking(Long id, String name, CookingType cookingType) {


       this.id = id;


       this.title = name;


       this.cookingType = cookingType;


   }







   @Override


   public String toString() {


       return "[ id=" + this.id + ", title=" + this.title + ", cookingType=" + this.cookingType + " ]";


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


    * @return the cookingType


    */


   public CookingType getCookingType() {


       return cookingType;


   }







   /**


    * @param cookingType the cookingType to set


    */


   public void setCookingType(CookingType cookingType) {


       this.cookingType = cookingType;


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

