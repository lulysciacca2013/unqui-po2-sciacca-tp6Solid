package ar.edu.unq.poo.Banco;

public class SolicitudCreditoPersonal extends SolicitudCredito {

	public SolicitudCreditoPersonal(Cliente cliente) { //solicitud
		super(cliente);
		
	
	}
	
	@Override
	public boolean verificarCuota() {
		
		return this.valorCuota() < (cliente.getSueldoNetoMensual() * 0.70);
	}
	
   public boolean verificarSueldoAnual() {
		
		return cliente.sueldoNetoAnual() >= 15000;
	}
	
	
	
	@Override
	public boolean esAceptable() {
		return this.verificarCuota() && this.verificarSueldoAnual();
	}

}
