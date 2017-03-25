
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


public class Music {







   private static final long serialVersionUID = 1L;







   public enum MusicType {


       Other,
       Jazz,
       Blues,
       Folk,
       Rap,
       RnB,
       Country,
       Soul




   }







   @Id


   @GeneratedValue(strategy = GenerationType.AUTO)


   protected Long id;


   protected String title;


   protected MusicType musicType;







   public Music() {


       this.id = Long.MAX_VALUE;


       this.title = null;


       this.musicType = MusicType.Other;


   }







   public Music(Long id, String name, MusicType musicType) {


       this.id = id;


       this.title = name;


       this.musicType = musicType;


   }







   @Override


   public String toString() {


       return "[ id=" + this.id + ", title=" + this.title + ", musicType=" + this.musicType + " ]";


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


    * @return the musicType


    */


   public MusicType getMusicType() {


       return musicType;


   }







   /**


    * @param musicType the musicType to set


    */


   public void setMusicType(MusicType musicType) {


       this.musicType = musicType;


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

