package com.vidaplus.sghss.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "consultas")
public class Consulta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime dataHora;

    private String especialidade;

    private String status;

    private String observacoes;

    @ManyToOne
    @JoinColumn(name = "paciente_id")
    private Paciente paciente;
}