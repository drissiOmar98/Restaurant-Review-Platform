package com.omar.restaurant_review_platform.mappers;


import com.omar.restaurant_review_platform.domain.ReviewCreateUpdateRequest;
import com.omar.restaurant_review_platform.domain.dtos.ReviewCreateUpdateRequestDto;
import com.omar.restaurant_review_platform.domain.dtos.ReviewDto;
import com.omar.restaurant_review_platform.domain.entities.Review;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ReviewMapper {


    ReviewCreateUpdateRequest toReviewCreateUpdateRequest(ReviewCreateUpdateRequestDto dto);

    ReviewDto toDto(Review review);
}
