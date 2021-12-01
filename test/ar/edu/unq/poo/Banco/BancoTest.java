package ar.edu.unq.poo.Banco;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BancoTest {
	private Banco banco; // banco
	private ArrayList<Cliente> clientes;
	private ArrayList<SolicitudCredito> solicitud;
	private Cliente cliente1;
	private Cliente cliente2;
	private SolicitudCreditoPersonal personal;
	private SolicitudCreditoHipotecario hipote;
	private Propiedad garantia;

	@BeforeEach
	void setUp() throws Exception {
		cliente1= new Cliente("Juan","Perez","Corrientes 2014", 52,25000);
		cliente2= new Cliente("Laura","Gomez","Corrientes 5000", 45,35000);
		solicitud= new ArrayList <SolicitudCredito>();
		personal= new SolicitudCreditoPersonal(cliente1);
		garantia= new Propiedad ("departamento", "Olazabal 5555", 1500000);
		hipote= new SolicitudCreditoHipotecario(cliente2, garantia);
		
		
		
	}

	@Test
	void test() {
		
		banco.agregarSolicitudCreditoPersonal(cliente1);
		
		
	}

	
}
