package com.adcorreajr.springboot_green_dog_delivery.model.repository;

import com.adcorreajr.springboot_green_dog_delivery.model.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
