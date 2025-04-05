package com.omar.restaurant_review_platform.mappers;

import com.omar.restaurant_review_platform.domain.dtos.PhotoDto;
import com.omar.restaurant_review_platform.domain.entities.Photo;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface PhotoMapper {


    PhotoDto toDto(Photo photo);

}
