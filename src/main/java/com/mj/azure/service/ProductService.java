package com.mj.azure.service;

import com.mj.azure.record.ProductRecord;
import java.util.List;

public interface ProductService {

  List<ProductRecord> getAllProducts();

}
