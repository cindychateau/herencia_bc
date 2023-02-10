package com.codingdojo.cynthia;

public class Bicicleta extends Vehiculo implements ManejarVehiculo {
	
	public void acelerar() {
		System.out.println("Vamos a pedalear más rápido");
		velocidad += 1;
		System.out.println("Mi velocidad es de:"+velocidad);
	}
	
	public void desacelerar() {
		System.out.println("Bajo despacio mis pies para desacelerar");
		velocidad -= 1;
		System.out.println("Mi velocidad es de:"+velocidad);
	}
	
}
