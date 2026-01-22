package gm.inventarios.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import gm.inventarios.modelo.Producto;

public interface IproductoRepositorio extends JpaRepository<Producto, Integer> {
    
} 
