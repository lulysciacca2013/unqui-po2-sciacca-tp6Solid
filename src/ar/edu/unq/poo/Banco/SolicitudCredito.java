package ar.edu.unq.poo.Banco;

public abstract class SolicitudCredito {
	
	protected Cliente cliente;
	protected double monto;
	protected int plazoMeses;
	
	public SolicitudCredito(Cliente cliente) {
		this.cliente=cliente;
		
	}
	
	public abstract boolean esAceptable();
	public abstract boolean verificarCuota();
		
	
	public double valorCuota() {
		return this.getMonto()/this.getPlazoMeses();
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public int getPlazoMeses() {
		return plazoMeses;
	}

	public void setPlazoMeses(int plazoMeses) {
		this.plazoMeses = plazoMeses;
	}
	
}
