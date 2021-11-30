package openClosedPrinciple.caso1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class ServidorTest {
	private ServidorPop servidor;
	private ClienteEMail cliente1;
	private ClienteEMail cliente2;
	private ArrayList<ClienteEMail> cliente;
	private ArrayList<Correo>nuevoCorreo;
	private Correo correo;

	@BeforeEach
	void setUp()  {
		servidor= new ServidorPop();
		cliente1= new ClienteEMail(servidor,"juan","1234");
		cliente2 = new ClienteEMail(servidor,"pepe","0055");
		correo= new Correo ("Renuncia","l@gmail.com", "Renuncio al empleo");
		
		nuevoCorreo= new ArrayList <Correo>();
		nuevoCorreo.add(correo);
		
		servidor.agregarCliente(cliente1);
		servidor.agregarCliente(cliente2);
		
		
	}

	@Test
	void testVerificarUsuario() {
		boolean resultado=  servidor.verificarUsuario("pepe","1234");
		assertFalse(resultado);
		boolean resultado2=  servidor.verificarUsuario("pepe","0055");
		assertTrue(resultado2);
	}
	@Test
	void testRecibirNuevos() {
		List<Correo> resultado= servidor.recibirNuevos("juan","1234");
				assertEquals(resultado, "Renuncia","l@gmail.com", "Renuncio al empleo");
		
	}

	private void assertEquals(List<Correo> resultado, String string, String string2, String string3) {
		// TODO Auto-generated method stub
		
	}
}
