package com.codingdojo.cynthia;

public interface ManejarVehiculo {
	
	int aumento = 2;
	
	/*
	 3 tipos de métodos distintos
	 Método Abstracto: Obliga a la clase a que se implemente el método. OJO no tiene acción
	 Método Default: Ese no necesita ser implementado, ese ya se declara en la interface
	 Métodos Estáticos: Método que pertenece a la interface y solo se utiliza aquí
	 */
	
	abstract void acelerar();
	abstract void desacelerar();
	
	default void checkEngines() {
		System.out.println(texto());
	}
	
	static String texto() {
		return "Revisnado vehiculo";
	}
	
}
