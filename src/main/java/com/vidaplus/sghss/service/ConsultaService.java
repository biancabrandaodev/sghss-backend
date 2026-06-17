package com.vidaplus.sghss.service;

import com.vidaplus.sghss.entity.Consulta;
import com.vidaplus.sghss.repository.ConsultaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ConsultaService {

    private final ConsultaRepository repository;

    public Consulta salvar(Consulta consulta) {
        return repository.save(consulta);
    }

    public List<Consulta> listar() {
        return repository.findAll();
    }

    public Consulta buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Consulta não encontrada"));
    }

    public void excluir(Long id) {
        repository.deleteById(id);
    }

    public Consulta atualizar(Long id, Consulta consulta) {

        Consulta consultaExistente = buscarPorId(id);

        consultaExistente.setDataHora(consulta.getDataHora());
        consultaExistente.setEspecialidade(consulta.getEspecialidade());
        consultaExistente.setStatus(consulta.getStatus());
        consultaExistente.setObservacoes(consulta.getObservacoes());
        consultaExistente.setPaciente(consulta.getPaciente());

        return repository.save(consultaExistente);
    }
}