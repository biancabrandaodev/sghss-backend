package com.vidaplus.sghss.service;

import com.vidaplus.sghss.entity.Paciente;
import com.vidaplus.sghss.repository.PacienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PacienteService {

    private final PacienteRepository repository;

    public Paciente salvar(Paciente paciente) {
        return repository.save(paciente);
    }

    public List<Paciente> listar() {
        return repository.findAll();
    }

    public Paciente buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Paciente não encontrado"));
    }

    public Paciente atualizar(Long id, Paciente dados){

        Paciente paciente = buscarPorId(id);

        paciente.setNome(dados.getNome());
        paciente.setCpf(dados.getCpf());
        paciente.setTelefone(dados.getTelefone());
        paciente.setEmail(dados.getEmail());

        return repository.save(paciente);
    }

    public void excluir(Long id){
        Paciente paciente = buscarPorId(id);
        repository.delete(paciente);
    }
}