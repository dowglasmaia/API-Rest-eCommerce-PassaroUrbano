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

		Oferta of1 = new Oferta(null, "restaurante", "Cozinha Mexicana", 
				"Almoço delicioso", "Original Burger",
				24.0, false, "/assets/ofertas/1/img1.jpg", "/assets/ofertas/2/img2.jpg", "/assets/ofertas/2/img3.jpg");
		services.save(of1);
		
		Oferta of2 = new Oferta(null, "restaurante", "Cozinha Mexicana", 
				"Jantar com Rodízio Mexicano", "Original Burger",
				754.0, false, "/assets/ofertas/6/img2.jpg", "/assets/ofertas/2/img2.jpg", "/assets/ofertas/2/img3.jpg");
		services.save(of2);
		
		Oferta of3 = new Oferta(null, "restaurante", "Cozinha Mexicana", 
				"Rodízio Mexicano ", "Original Burger",
				2654.0, false, "/assets/ofertas/3/img4.jpg", "/assets/ofertas/2/img2.jpg", "/assets/ofertas/2/img3.jpg");
		services.save(of3);
		
		Oferta of4 = new Oferta(null, "jogos", "Tiro", "Joi joi", "Original Burger",
				254.0, false, "/assets/ofertas/2/img1.jpg", "/assets/ofertas/2/img2.jpg", "/assets/ofertas/2/img3.jpg");
		services.save(of4);
		
		Oferta of5 = new Oferta(null, "jogos", "Gamer", "Gamer de 02 Pessoa", "Original Burger",
				2.0, false, "/assets/ofertas/3/img1.jpg", "/assets/ofertas/2/img2.jpg", "/assets/ofertas/2/img3.jpg");
		services.save(of5);
		
		Oferta of6 = new Oferta(null, "jogos", "Dança", "Dança de Salão", "Original Burger",
				7894.0, false, "/assets/ofertas/5/img1.jpg", "/assets/ofertas/2/img2.jpg", "/assets/ofertas/2/img3.jpg");
		services.save(of6);

		
	}
	
}
