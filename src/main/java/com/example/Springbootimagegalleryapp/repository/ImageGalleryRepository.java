package com.example.Springbootimagegalleryapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Springbootimagegalleryapp.entity.ImageGallery;


@Repository
public interface ImageGalleryRepository extends JpaRepository<ImageGallery, Long>{

}
