package com.sistema.blog.service;

import org.springframework.stereotype.Service;

@Service
public class PalindromoService {
    public static boolean palindromoValidation(String word) {
        String cadena = word;
        String cadenaInvertida = new StringBuilder(cadena).reverse().toString();
        return cadenaInvertida.equals(cadena);
    }

    public String palindromaMasLargo(String word) {
        String palindromoMasLargo = "";
        int n = 0;
        while (n < word.length()) {
            for (int i = n; i < word.length(); i++) {
                String palabraDeTurno = word.substring(n, i + 1);
                if (palindromoValidation(palabraDeTurno) && palindromoMasLargo.length() < palabraDeTurno.length())
                    palindromoMasLargo = palabraDeTurno;
            }
            n++;
        }
        return palindromoMasLargo;
    }
}
