package com.example.product_service_12052024.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter

@MappedSuperclass
public class BaseModel implements Serializable {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)

   private Long id;
   @CreationTimestamp
   private Date createdAt;
   @UpdateTimestamp
   private Date updatedAt;
   private Boolean isDeleted = false;

}
