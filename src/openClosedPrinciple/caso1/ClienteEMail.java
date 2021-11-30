package openClosedPrinciple.caso1;

import java.util.ArrayList;

public class ClienteEMail {
	
	private ServidorPop servidor;       //variable no es privada
	private String nombreUsuario;		//variable no es privada
	private String passusuario;		    //variable no es privada
	private ArrayList<Correo> inbox;	//variable no es privada
	private ArrayList<Correo> borrados;
	
	public ClienteEMail(ServidorPop servidor, String nombreUsuario, String pass){
		this.servidor=servidor;
		this.nombreUsuario=nombreUsuario;
		this.passusuario=pass;
		this.inbox = new ArrayList<Correo>();
		this.borrados = new ArrayList<Correo>();
		this.conectar();
	}
	
	public void conectar(){
		this.servidor.conectar(this.nombreUsuario,this.passusuario);
	}
	
	public void borrarCorreo(Correo correo){
		this.inbox.remove(correo);
		//this.borrados.remove(correo); codigo repetido- los borrados se borran en eliminarBorrado
		this.borrados.add(correo);  //lo borra del inbox y lo ingresa a borrados
	}
	
	public int contarBorrados(){
		return this.borrados.size();
	}
	
	public int contarInbox(){
		return this.inbox.size();
	}
	
	public void eliminarBorrado(Correo correo){
		this.borrados.remove(correo);
	}
	
	public void recibirNuevos(){
		this.servidor.recibirNuevos(this.nombreUsuario, this.passusuario);
	}
	
	public void enviarCorreo(String asunto, String destinatario, String cuerpo){
		Correo correo = new Correo(asunto, destinatario, cuerpo);
		this.servidor.enviar(correo);
	}

	public ServidorPop getServidor() {
		return servidor;
	}

	public void setServidor(ServidorPop servidor) {
		this.servidor = servidor;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getPassusuario() {
		return passusuario;
	}

	public void setPassusuario(String passusuario) {
		this.passusuario = passusuario;
	}

	public ArrayList<Correo> getInbox() {
		return inbox;
	}

	public void setInbox(ArrayList<Correo> inbox) {
		this.inbox = inbox;
	}

	public ArrayList<Correo> getBorrados() {
		return borrados;
	}

	public void setBorrados(ArrayList<Correo> borrados) {
		this.borrados = borrados;
	}
	
	

}
