package com.adcorreajr.springboot_green_dog_delivery.model.repository;

import com.adcorreajr.springboot_green_dog_delivery.model.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
