package com.josefroes.desafio_componentes_injecao_dependencia;

import com.josefroes.desafio_componentes_injecao_dependencia.entities.Order;
import com.josefroes.desafio_componentes_injecao_dependencia.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

	}


	@Override
	public void run(String... args) throws Exception {
		Order  order = new Order(1034, 95.90, 0.0);

		System.out.println(orderService.total(order));
	}
}
