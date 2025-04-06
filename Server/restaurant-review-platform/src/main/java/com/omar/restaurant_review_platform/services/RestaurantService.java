package com.omar.restaurant_review_platform.services;

import com.omar.restaurant_review_platform.domain.RestaurantCreateUpdateRequest;
import com.omar.restaurant_review_platform.domain.entities.Restaurant;


public interface RestaurantService {
    Restaurant createRestaurant(RestaurantCreateUpdateRequest request);


}
