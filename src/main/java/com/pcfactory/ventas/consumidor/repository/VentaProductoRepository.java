package com.pcfactory.ventas.consumidor.repository;

import com.pcfactory.ventas.consumidor.entity.VentaProducto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VentaProductoRepository extends JpaRepository<VentaProducto, Long> {
}