package com.example.AWTrestAPI.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.AWTrestAPI.models.Produto;
import com.example.AWTrestAPI.services.ProdutoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class ProdutoController {
    @Autowired
    private ProdutoService produtoService;

    @GetMapping("/produtos")
    public List<Produto> listar() {
        return produtoService.listar();
    }

    @PostMapping("/produtos")
    public Produto salvar(@RequestBody Produto produto) {
        //TODO: process POST request
        
        return produtoService.salvar(produto);
    }
    
    
}
