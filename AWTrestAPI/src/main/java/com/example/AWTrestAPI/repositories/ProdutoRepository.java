package com.example.AWTrestAPI.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.AWTrestAPI.models.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto,Long> {

    
}
