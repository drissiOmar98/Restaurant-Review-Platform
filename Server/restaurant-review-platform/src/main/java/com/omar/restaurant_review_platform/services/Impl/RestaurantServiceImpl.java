package com.omar.restaurant_review_platform.services.Impl;

import com.omar.restaurant_review_platform.domain.GeoLocation;
import com.omar.restaurant_review_platform.domain.RestaurantCreateUpdateRequest;
import com.omar.restaurant_review_platform.domain.entities.Address;
import com.omar.restaurant_review_platform.domain.entities.Photo;
import com.omar.restaurant_review_platform.domain.entities.Restaurant;
import com.omar.restaurant_review_platform.exceptions.RestaurantNotFoundException;
import com.omar.restaurant_review_platform.repositories.RestaurantRepository;
import com.omar.restaurant_review_platform.services.GeoLocationService;
import com.omar.restaurant_review_platform.services.RestaurantService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.core.geo.GeoPoint;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class RestaurantServiceImpl implements RestaurantService {


    private final RestaurantRepository restaurantRepository;
    private final GeoLocationService geoLocationService;

    @Override
    public Restaurant createRestaurant(RestaurantCreateUpdateRequest request) {
        Address address = request.getAddress();
        GeoLocation geoLocation = geoLocationService.geoLocate(address);
        GeoPoint geoPoint = new GeoPoint(geoLocation.getLatitude(), geoLocation.getLongitude());

        List<String> photoIds = request.getPhotoIds();
        List<Photo> photos = photoIds.stream().map(photoUrl -> Photo.builder()
                .url(photoUrl)
                .uploadDate(LocalDateTime.now())
                .build()).toList();

        Restaurant restaurant = Restaurant.builder()
                .name(request.getName())
                .cuisineType(request.getCuisineType())
                .contactInformation(request.getContactInformation())
                .address(address)
                .geoLocation(geoPoint)
                .operatingHours(request.getOperatingHours())
                .averageRating(0f)
                .photos(photos)
                .build();

        return restaurantRepository.save(restaurant);
    }




}
