package ar.edu.unq.poo.Banco;

import java.util.ArrayList;

public abstract class Banco {

	private ArrayList<Cliente> cliente;
	private ArrayList<SolicitudCredito> solicitud;
	
	
	public Banco() {
		// TODO Auto-generated constructor stub
	}

	public void agregarSolicitudCreditoPersonal(Cliente cliente) {
		
		this.getSolicitud().add(new SolicitudCreditoPersonal(cliente));
	}
	
    public void agregarSolicitudCreditoHipotecario(Cliente cliente, Propiedad garantia) {
    	
    	this.getSolicitud().add(new SolicitudCreditoHipotecario(cliente,garantia));
	}
	
	
	public ArrayList<Cliente> getCliente() {
		return cliente;
	}


	public void setCliente(ArrayList<Cliente> cliente) {
		this.cliente = cliente;
	}


	public ArrayList<SolicitudCredito> getSolicitud() {
		return solicitud;
	}


	public void setSolicitud(ArrayList<SolicitudCredito> solicitud) {
		this.solicitud = solicitud;
	}
	
	public double montoTotalADesembolsar() {
		double total=0;
		for(int i=0; i< solicitud.size(); i++){
			if (solicitud.get(i).esAceptable()) {
				total= total + solicitud.get(i).getMonto(); 
			}
		}
		return total;
	}
	
}
