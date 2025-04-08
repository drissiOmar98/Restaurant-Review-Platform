package com.omar.restaurant_review_platform.services;

import com.omar.restaurant_review_platform.domain.ReviewCreateUpdateRequest;
import com.omar.restaurant_review_platform.domain.entities.Review;
import com.omar.restaurant_review_platform.domain.entities.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface ReviewService {

    Review createReview(User author, String restaurantId, ReviewCreateUpdateRequest review);

    Page<Review> listReviews(String restaurantId, Pageable pageable);

    Optional<Review> getReview(String restaurantId, String reviewId);


}
