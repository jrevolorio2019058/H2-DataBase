package org.jrevolorio.api.h2Database.repository;

import org.jrevolorio.api.h2Database.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

}
