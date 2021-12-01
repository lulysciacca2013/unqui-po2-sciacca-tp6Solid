package ar.edu.unq.poo.Banco;

public class SolicitudCreditoHipotecario extends SolicitudCredito {
	private Propiedad garantia;

	public SolicitudCreditoHipotecario(Cliente cliente,  Propiedad garantia) { //solicitud
		super(cliente);
		this.garantia= garantia;
	}

	public Propiedad getGarantia() {
		return garantia;
	}

	public void setGarantia(Propiedad garantia) {
		this.garantia = garantia;
	}
	
	
	@Override
	public boolean verificarCuota() {
		
		return this.valorCuota() < (cliente.getSueldoNetoMensual() * 0.5);
	}
	
	public boolean verificarGarantia() {
		return this.getMonto() < (garantia.getValorFiscal() * 0.70);
	}
	
	public boolean verificarEdad() {
		return cliente.getEdad()< 65;
	}
	
	@Override
	public boolean esAceptable() {
		return this.verificarCuota() && this.verificarGarantia() && this.verificarEdad();
	}

}
