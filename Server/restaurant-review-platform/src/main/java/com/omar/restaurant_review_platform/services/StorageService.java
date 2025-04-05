package com.omar.restaurant_review_platform.services;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.util.Optional;

public interface StorageService {
    String store(MultipartFile file, String filename);
    Optional<Resource> loadAsResource(String id);
}
