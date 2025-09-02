package com.applestore.apple_ventas_app;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppleVentasAppApplication {

	public static void main(String[] args) {


		SpringApplication.run(AppleVentasAppApplication.class, args);

		abrirNavegador("http://localhost:" + "3000");
	}

	// Abre el navegador en la URL de la aplicación
	private static void abrirNavegador(String url) {
		String os = System.getProperty("os.name").toLowerCase();
		try {
			if (os.contains("win")) {
				Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + url);
			} else if (os.contains("mac")) {
				Runtime.getRuntime().exec("open " + url);
			} else if (os.contains("nix") || os.contains("nux")) {
				Runtime.getRuntime().exec("xdg-open " + url);
			} else {
				System.out.println("No se pudo detectar el sistema operativo para abrir el navegador.");
			}
		} catch (IOException e) {
			System.out.println("Error al intentar abrir el navegador: " + e.getMessage());
		}
	}
}
