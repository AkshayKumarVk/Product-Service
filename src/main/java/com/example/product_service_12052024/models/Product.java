package com.example.product_service_12052024.models;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity

public class Product extends BaseModel {

   private String title;
   private String description;
   private Double price;
   private String imageUrl;
   @ManyToOne(cascade = {CascadeType.PERSIST})
//   @ManyToOne
   private Category category;

}
