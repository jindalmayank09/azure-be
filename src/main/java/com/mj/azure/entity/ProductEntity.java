package com.mj.azure.entity;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "product",
  uniqueConstraints = @UniqueConstraint(columnNames = "product_name"))
@Setter
@Getter
public class ProductEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY) // auto increment
  @Column(name = "product_id")
  private Long productId;

  @Column(name = "product_name", nullable = false, unique = true)
  private String productName;

  @Column(name = "product_code")
  private String productCode;

  @Column(name = "release_date")
  private LocalDate releaseDate;

  @Column(name = "description")
  private String description;

  @Column(name = "price")
  private BigDecimal price;

  @Column(name = "star_rating")
  private Double starRating;

  @Column(name = "image_url")
  private String imageUrl;

}

