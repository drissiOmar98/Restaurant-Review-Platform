package com.omar.restaurant_review_platform.services;

import com.omar.restaurant_review_platform.domain.GeoLocation;
import com.omar.restaurant_review_platform.domain.entities.Address;

public interface GeoLocationService {
    GeoLocation geoLocate(Address address);
}

