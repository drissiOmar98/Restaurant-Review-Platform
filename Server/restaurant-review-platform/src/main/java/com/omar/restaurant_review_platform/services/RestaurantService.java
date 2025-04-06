package com.omar.restaurant_review_platform.services;

import com.omar.restaurant_review_platform.domain.RestaurantCreateUpdateRequest;
import com.omar.restaurant_review_platform.domain.entities.Restaurant;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface RestaurantService {
    Restaurant createRestaurant(RestaurantCreateUpdateRequest request);

    Page<Restaurant> searchRestaurants(
            String query,
            Float minRating,
            Float latitude,
            Float longitude,
            Float radius,
            Pageable pageable
    );


}
