package com.distribuida.entities;

import java.util.Date;

public class Factura {
	
	private int idFactura;
	private String numFactura;
	private Date fecha;
	private Double totalNeto;
	private Double iva;
	//private int idCliente;
	private Cliente cliente;
	
	
	public Factura() {}


	public Factura(int idFactura, String numFactura, Date fecha, Double totalNeto, Double iva, Cliente cliente) {
		this.idFactura = idFactura;
		this.numFactura = numFactura;
		this.fecha = fecha;
		this.totalNeto = totalNeto;
		this.iva = iva;
		this.cliente = cliente;
	}


	public int getIdFactura() {
		return idFactura;
	}


	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}


	public String getNumFactura() {
		return numFactura;
	}


	public void setNumFactura(String numFactura) {
		this.numFactura = numFactura;
	}


	public Date getFecha() {
		return fecha;
	}


	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}


	public Double getTotalNeto() {
		return totalNeto;
	}


	public void setTotalNeto(Double totalNeto) {
		this.totalNeto = totalNeto;
	}


	public Double getIva() {
		return iva;
	}


	public void setIva(Double iva) {
		this.iva = iva;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	@Override
	public String toString() {
		return "Factura [idFactura=" + idFactura + ", numFactura=" + numFactura + ", fecha=" + fecha + ", totalNeto="
				+ totalNeto + ", iva=" + iva + ", cliente=" + cliente + "]";
	}
	

}
