package Ejercicio3;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Factura {

	private String DNIcliente;
	private double baseImponible;
	private static double IVA;
	private double descuento;
	private LocalDate fechaFactura;
	private int diasVencimiento;
	
	public Factura(String DNIcliente, double baseImponible, double descuento, LocalDate fechaFactura, int diasVencimiento) {
		
		this.DNIcliente=DNIcliente;
		this.baseImponible=baseImponible;
		this.descuento=descuento;
		this.fechaFactura=fechaFactura;
		this.diasVencimiento=diasVencimiento;
		IVA=0.21;
	}
	
	
	
	
	
	public String getDNIcliente() {
		return DNIcliente;
	}





	public void setDNIcliente(String dNIcliente) {
		DNIcliente = dNIcliente;
	}





	public double getBaseImponible() {
		return baseImponible;
	}





	public void setBaseImponible(double baseImponible) {
		this.baseImponible = baseImponible;
	}





	public double getDescuento() {
		return descuento;
	}





	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}





	public LocalDate getFechaFactura() {
		return fechaFactura;
	}





	public void setFechaFactura(LocalDate fechaFactura) {
		this.fechaFactura = fechaFactura;
	}





	public int getDiasVencimiento() {
		return diasVencimiento;
	}





	public void setDiasVencimiento(int diasVencimiento) {
		this.diasVencimiento = diasVencimiento;
	}





	public double getIVA() {
		return IVA;
	}





	public LocalDate FechaVencimiento() {
		
		LocalDate FechaVencimiento=fechaFactura.plusDays(diasVencimiento);
		
		return FechaVencimiento;
		
	}
	
	public int DiasPago() {
		
		int dias=(int) ChronoUnit.DAYS.between(LocalDate.now(), fechaFactura.plusDays(diasVencimiento));
		
		if(dias>0) {
		
		return dias;
		}else {
			
			return -1;
			
		}
	}
	
	public double Total() {
		
		double Total=baseImponible-(baseImponible*descuento);
		Total=Total+(Total*0.21);
		return Total;
		
	}





	@Override
	public String toString() {
		return "Factura [DNIcliente=" + DNIcliente + ", baseImponible=" + baseImponible + ", descuento=" + descuento
				+ ", fechaFactura=" + fechaFactura + ", diasVencimiento=" + diasVencimiento + "]" + "\n";
	}
	
	
}
