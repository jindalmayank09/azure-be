package com.mj.azure.service.impl;

import com.mj.azure.mapper.GenericMapper;
import com.mj.azure.record.ProductRecord;
import com.mj.azure.repository.ProductRepository;
import com.mj.azure.service.ProductService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

  private final ProductRepository productRepository;
  private final GenericMapper mapper;

  @Override
  public List<ProductRecord> getAllProducts() {
    return productRepository.findAll().stream().map(mapper::toRecord).toList();
  }
}
