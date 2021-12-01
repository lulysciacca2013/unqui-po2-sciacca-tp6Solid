package ar.edu.unq.poo.Banco;

public class Cliente {
	private String nombre;
	private String apellido;
	private String direccion;
	private int edad;
	private double sueldoNetoMensual;
	

	public Cliente(String nombre,String ape,String dire, int edad, double sueldo ) {
		this.nombre=nombre;
		this.apellido= ape;
		this.direccion= dire;
		this.edad= edad;
		this.sueldoNetoMensual= sueldo;
	}

	public double sueldoNetoAnual() {
		return this.sueldoNetoMensual * 12;
	}
	
	public void solicitarCreditoPersonal(Banco banco) {
		banco.agregarSolicitudCreditoPersonal(this);
	}
	
	public void solicitarCreditoHipotecario(Banco banco, Propiedad garantia) {
		banco.agregarSolicitudCreditoHipotecario(this, garantia);
	}
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public double getSueldoNetoMensual() {
		return sueldoNetoMensual;
	}


	public void setSueldoNetoMensual(double sueldoNetoMensual) {
		this.sueldoNetoMensual = sueldoNetoMensual;
	}
	
	

}
