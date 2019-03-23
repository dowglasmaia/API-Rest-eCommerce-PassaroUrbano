package org.maiati;

import org.maiati.model.Oferta;
import org.maiati.service.OfertaServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ECommercePassaroUrbanoApplication implements CommandLineRunner {

	@Autowired
	OfertaServices services;

	public static void main(String[] args) {
		SpringApplication.run(ECommercePassaroUrbanoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Oferta of1 = new Oferta(null, "restaurante", "Super Burger", "Rodízio de Mini-hambúrger com opção de entrada.",
				"Original Burger", 50.00, true, "/assets/ofertas/1/img1.jpg", null, null);

		services.save(of1);

		Oferta of2 = new Oferta(null, "restaurante", "Cozinha Mexicana", "Almoço ou Jantar com Rodízio Mexicano delicioso",
				"Original Burger", 450.00, true, "/assets/ofertas/2/img1.jpg", null, null);

		services.save(of2);

		Oferta of3 = new Oferta(null, "restaurante", "Pizzas Grandes", "Pizza Grande, Mussarela, Marguerita ou outras!",
				"Original Burger", 60.00, true, "/assets/ofertas/3/img2.jpg", null, null);

		services.save(of3);

		Oferta of4 = new Oferta(null, "diversao", "Estância das águas", "Diversão garantida com piscinas, trilhas e muito mais.",
				"Original Burger", 150.00, true, "/assets/ofertas/4/img2.jpg", null, null);

		services.save(of4);

		Oferta of5 = new Oferta(null, "diversao", "Kart", "Bateria de Kart de 30 minutos",
				"Original Burger", 105.00, true, "/assets/ofertas/5/img2.jpg", null, null);

		services.save(of5);

		Oferta of6 = new Oferta(null, "diversao", "Academia de tiro", "Sessão de tiro dinâmico com Instrutor, Estande, Alvo e Equipamentos.",
				"Original Burger", 78.90, true, "/assets/ofertas/6/img2.jpg", null, null);

		services.save(of6);

	}
}
