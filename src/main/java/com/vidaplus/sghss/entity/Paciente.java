package com.vidaplus.sghss.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "pacientes")
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String cpf;

    private String telefone;

    private String email;
}