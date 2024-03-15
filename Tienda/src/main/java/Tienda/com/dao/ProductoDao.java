package Tienda.com.dao;

import Tienda.com.domain.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoDao extends JpaRepository <Producto, Long> {
    
}
