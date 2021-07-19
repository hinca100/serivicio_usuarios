package com.prueba.backend.entidades;

public class GccobranzasGestor {

	private String NOMBRE_COMPLETO;

	public String getNOMBRE_COMPLETO() {
		return NOMBRE_COMPLETO;
	}

	public void setNOMBRE_COMPLETO(String nOMBRE_COMPLETO) {
		NOMBRE_COMPLETO = nOMBRE_COMPLETO;
	}

	@Override
	public String toString() {
		return "GccobranzasGestor [NOMBRE_COMPLETO=" + NOMBRE_COMPLETO + "]";
	}

}
