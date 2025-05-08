package com.example.backend_processa_pagamento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendProcessaPagamentoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendProcessaPagamentoApplication.class, args);
		System.out.println("Rodando API Backend - Processo de Pagamentos");
	}

}
