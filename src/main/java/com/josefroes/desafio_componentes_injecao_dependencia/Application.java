package com.josefroes.desafio_componentes_injecao_dependencia;

import com.josefroes.desafio_componentes_injecao_dependencia.entities.Order;
import com.josefroes.desafio_componentes_injecao_dependencia.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

	}


	@Override
	public void run(String... args) throws Exception {
		Locale.setDefault(Locale.US);
		List<Order> orders = new ArrayList<>();

		orders.add(new Order(1034, 150.0, 20.0));
		orders.add(new Order(2282, 800.0, 10.0));
		orders.add(new Order(1309, 95.90, 0.0));

		for (Order order : orders) {
			System.out.println("\nPedido código: " + order.getCode());
			System.out.printf("Valor total: %.2f%n ", orderService.total(order));
		}
	}
}
