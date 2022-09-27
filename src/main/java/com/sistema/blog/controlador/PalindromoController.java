package com.sistema.blog.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.sistema.blog.dto.CadenaDTO;
import com.sistema.blog.service.PalindromoService;


@RestController
@RequestMapping("/palindromo")
public class PalindromoController {
    @Autowired
    PalindromoService palindromoService;

    @PostMapping()
    public ResponseEntity<String> obtenerPalindromo(@RequestBody CadenaDTO cadenaDTO){
        String palindromo = palindromoService.palindromaMasLargo(cadenaDTO.getCadena());
        return new ResponseEntity<String>("El palindromo mas largo es: "+ palindromo, HttpStatus.OK);
    }
}