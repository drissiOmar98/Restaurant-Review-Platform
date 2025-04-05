package com.omar.restaurant_review_platform.services.Impl;

import com.omar.restaurant_review_platform.domain.GeoLocation;
import com.omar.restaurant_review_platform.domain.entities.Address;
import com.omar.restaurant_review_platform.services.GeoLocationService;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class RandomLondonGeoLocationService implements GeoLocationService {

    private static final float MIN_LATITUDE = 51.28f;
    private static final float MAX_LATITUDE = 51.686f;
    private static final float MIN_LONGITUDE = -0.489f;
    private static final float MAX_LONGITUDE = 0.236f;

    @Override
    public GeoLocation geoLocate(Address address) {
        Random random = new Random();
        double latitude = MIN_LATITUDE + random.nextDouble() * (MAX_LATITUDE - MIN_LATITUDE);
        double longitude = MIN_LONGITUDE + random.nextDouble() * (MAX_LONGITUDE - MIN_LONGITUDE);

        return GeoLocation.builder()
                .latitude(latitude)
                .longitude(longitude)
                .build();
    }
}
