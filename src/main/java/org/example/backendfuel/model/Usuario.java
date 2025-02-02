package org.example.backendfuel.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nome;
	private String email;
	private String telefone;
	private String modeloCarro;
	private double valorGasolina;
	private double valorEtanol;
}