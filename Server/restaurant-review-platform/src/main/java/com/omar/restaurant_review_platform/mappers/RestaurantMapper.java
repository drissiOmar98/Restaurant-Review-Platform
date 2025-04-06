package com.omar.restaurant_review_platform.mappers;

import com.omar.restaurant_review_platform.domain.RestaurantCreateUpdateRequest;
import com.omar.restaurant_review_platform.domain.dtos.GeoPointDto;
import com.omar.restaurant_review_platform.domain.dtos.RestaurantCreateUpdateRequestDto;
import com.omar.restaurant_review_platform.domain.dtos.RestaurantDto;
import com.omar.restaurant_review_platform.domain.dtos.RestaurantSummaryDto;
import com.omar.restaurant_review_platform.domain.entities.Restaurant;
import com.omar.restaurant_review_platform.domain.entities.Review;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.ReportingPolicy;
import org.springframework.data.elasticsearch.core.geo.GeoPoint;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface RestaurantMapper {

    RestaurantCreateUpdateRequest toRestaurantCreateUpdateRequest(RestaurantCreateUpdateRequestDto dto);

    @Mapping(source = "reviews", target = "totalReviews", qualifiedByName = "populateTotalReviews")
    RestaurantDto toRestaurantDto(Restaurant restaurant);

    @Mapping(target = "latitude", expression = "java(geoPoint.getLat())")
    @Mapping(target = "longitude", expression = "java(geoPoint.getLon())")
    GeoPointDto toGeoPointDto(GeoPoint geoPoint);


    @Mapping(source = "reviews", target = "totalReviews", qualifiedByName = "populateTotalReviews")
    RestaurantSummaryDto toSummaryDto(Restaurant restaurant);

    @Named("populateTotalReviews")
    default Integer populateTotalReviews(List<Review> reviews) {
        return reviews.size();
    }
}
