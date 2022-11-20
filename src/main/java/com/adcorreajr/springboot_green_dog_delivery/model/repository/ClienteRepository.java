package com.adcorreajr.springboot_green_dog_delivery.model.repository;

import com.adcorreajr.springboot_green_dog_delivery.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
