package com.codingdojo.cynthia;

public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehiculo barco = new Vehiculo("Modelo1", "Barca", 2015, "Rojo", 0);
		barco.imprimir();
		
		Auto auto1 = new Auto("Civic", "Honda", 2020, "Azul", 4, "ABC123");
		auto1.imprimir();
		
		auto1.acelerar();
		auto1.acelerar();
		auto1.desacelerar();
		System.out.println("-----");
		
		Bicicleta bici = new Bicicleta();
		bici.acelerar();
		bici.acelerar();
		bici.desacelerar();
		
		bici.checkEngines();
		
		
		ManejarVehiculo bici1 = new Bicicleta();
	}

}
