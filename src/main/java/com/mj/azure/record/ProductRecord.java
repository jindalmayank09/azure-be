package com.mj.azure.record;

import java.math.BigDecimal;
import java.time.LocalDate;

public record ProductRecord(
  Long productId,
  String productName,
  String productCode,
  LocalDate releaseDate,
  String description,
  BigDecimal price,
  Double starRating,
  String imageUrl
) {}

