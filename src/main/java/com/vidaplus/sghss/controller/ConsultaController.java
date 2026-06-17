package com.vidaplus.sghss.controller;

import com.vidaplus.sghss.entity.Consulta;
import com.vidaplus.sghss.service.ConsultaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/consultas")
@RequiredArgsConstructor
public class ConsultaController {

    private final ConsultaService service;

    @PostMapping
    public Consulta salvar(@RequestBody Consulta consulta) {
        return service.salvar(consulta);
    }

    @GetMapping
    public List<Consulta> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Consulta buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public Consulta atualizar(@PathVariable Long id,
                              @RequestBody Consulta consulta) {
        return service.atualizar(id, consulta);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        service.excluir(id);
    }
}