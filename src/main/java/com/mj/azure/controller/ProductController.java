package com.mj.azure.controller;

import com.mj.azure.record.ProductRecord;
import com.mj.azure.service.ProductService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
@Slf4j
public class ProductController {

  private final ProductService productService;

  @CrossOrigin("*")
  @GetMapping("/get-products")
  public ResponseEntity<List<ProductRecord>> getAllProducts(){
    log.info("Calling get-products");
    return ResponseEntity.ok(productService.getAllProducts());

  }

}
