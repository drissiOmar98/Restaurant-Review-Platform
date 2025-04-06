package com.omar.restaurant_review_platform.controllers;

import com.omar.restaurant_review_platform.domain.RestaurantCreateUpdateRequest;
import com.omar.restaurant_review_platform.domain.dtos.RestaurantCreateUpdateRequestDto;
import com.omar.restaurant_review_platform.domain.dtos.RestaurantDto;
import com.omar.restaurant_review_platform.domain.dtos.RestaurantSummaryDto;
import com.omar.restaurant_review_platform.domain.entities.Restaurant;
import com.omar.restaurant_review_platform.mappers.RestaurantMapper;
import com.omar.restaurant_review_platform.services.RestaurantService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/restaurants")
@RequiredArgsConstructor
public class RestaurantController {

    private final RestaurantService restaurantService;
    private final RestaurantMapper restaurantMapper;

    @PostMapping
    public ResponseEntity<RestaurantDto> createRestaurant(
            @Valid @RequestBody RestaurantCreateUpdateRequestDto request
    ) {
        RestaurantCreateUpdateRequest restaurantCreateUpdateRequest = restaurantMapper
                .toRestaurantCreateUpdateRequest(request);

        Restaurant restaurant = restaurantService.createRestaurant(restaurantCreateUpdateRequest);
        RestaurantDto createdRestaurantDto = restaurantMapper.toRestaurantDto(restaurant);
        return ResponseEntity.ok(createdRestaurantDto);
    }




}
