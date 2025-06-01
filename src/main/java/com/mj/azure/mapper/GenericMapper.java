package com.mj.azure.mapper;

import com.mj.azure.entity.ProductEntity;
import com.mj.azure.record.ProductRecord;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface GenericMapper {

  ProductRecord toRecord(ProductEntity productEntity);

  ProductEntity toEntity(ProductRecord productRecord);

}
