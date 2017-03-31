
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


public class Artscrafts {







   private static final long serialVersionUID = 1L;







   public enum Artscrafts {


       Knitting,


       Crocheting,


       Pottery,


       Sewing,
       
       Other


   }







   @Id


   @GeneratedValue(strategy = GenerationType.AUTO)


   protected Long id;


   protected String title;


   protected ArtscraftsType artscraftsType;







   public Artscrafts() {


       this.id = Long.MAX_VALUE;


       this.title = null;


       this.artscraftsType = ArtscraftsType.Other;


   }







   public Artscrafts(Long id, String name, ArtscraftsType artscraftsType) {


       this.id = id;


       this.title = name;


       this.artscraftsType = artscraftsType;


   }







   @Override


   public String toString() {


       return "[ id=" + this.id + ", title=" + this.title + ", artscraftsType=" + this.artscraftsType + " ]";


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


    * @return the artscraftsType


    */


   public ArtscraftsType getArtscraftsType() {


       return artscraftsType;


   }







   /**


    * @param artscraftsType the artscraftsType to set


    */


   public void setArtscraftsType(ArtscraftsType artscraftsType) {


       this.artscraftsType = artscraftsType;


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

