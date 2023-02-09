package com.codingdojo.cynthia;

public class Auto extends Vehiculo {
	
	private String placas;
	
	
	public Auto(String modelo, String marca, int anio, String color, int ruedas, String placas) {
		super(modelo, marca, anio, color, ruedas);
		this.placas = placas;
	}

	public String getPlacas() {
		return placas;
	}

	public void setPlacas(String placas) {
		this.placas = placas;
	}
	
	//Polimorfismo: el tener el mismo método a través de clases PERO con distintos comportamientos
	public void imprimir() {
		//System.out.println("Año: "+this.getAnio()+" Marca:"+this.marca+" Modelo:"+this.modelo+" Placas:"+this.placas);
		super.imprimir();
		System.out.println("Placas:"+this.placas);
	}
	
}
