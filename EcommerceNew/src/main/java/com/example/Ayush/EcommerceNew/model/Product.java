package com.example.Ayush.EcommerceNew.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import java.math.BigDecimal;
import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String desc;
    private String brand;
    private BigDecimal price;
    private String category;
   // @JsonFormat(shape=JsonFormat.Shape.STRING,pattern="dd-MM-yyyy")
    private  Date releaseDate;
    private boolean available;
    private  int stockQuantity;
    private String imageName;
    private String imageType;
    @Lob
    private byte[] imageData;
}
