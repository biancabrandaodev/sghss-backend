package com.vidaplus.sghss.controller;

import com.vidaplus.sghss.entity.Paciente;
import com.vidaplus.sghss.service.PacienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pacientes")
@RequiredArgsConstructor
public class PacienteController {

    private final PacienteService service;

    @PostMapping
    public Paciente salvar(
            @RequestBody Paciente paciente){

        return service.salvar(paciente);
    }

    @GetMapping
    public List<Paciente> listar(){
        return service.listar();
    }

    @GetMapping("/{id}")
    public Paciente buscarPorId(@PathVariable Long id){
        return service.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public Paciente atualizar(
            @PathVariable Long id,
            @RequestBody Paciente paciente){

        return service.atualizar(id, paciente);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id){
        service.excluir(id);
    }
}
