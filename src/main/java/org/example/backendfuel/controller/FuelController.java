package org.example.backendfuel.controller;

import org.example.backendfuel.model.Usuario;
import org.example.backendfuel.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calcular-combustivel")
public class FuelController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping
    public String calcularCombustivel(@RequestBody Usuario usuario) {
        // Salva os dados do usuário no banco de dados
        usuarioRepository.save(usuario);

        // Valores da gasolina e etanol fornecidos pelo usuário
        double gasolina = usuario.getValorGasolina();
        double etanol = usuario.getValorEtanol();

        // Lógica para calcular o que compensa mais
        String compensaMais = (etanol <= gasolina * 0.7) ? "Etanol" : "Gasolina";

        // Retorna o resultado em formato JSON
        return String.format("{\"gasolina\": %.2f, \"etanol\": %.2f, \"compensaMais\": \"%s\"}",
                gasolina, etanol, compensaMais);
    }
}