package com.javatechie.spring.batch.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "INFO_CLIENTE")

public class Customer {

    @Id
    @Column(name = "ID_CLIENTE")
    private int id;
    @Column(name = "NOMBRE")
    private String nombre;	
    @Column(name = "APELLIDOS")
    private String apellido;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "GENERO")
    private String genero;
    @Column(name = "TELEFONO")
    private String telefono;
    @Column(name = "PAIS")
    private String pais;
    @Column(name = "FECHA_NACIMIENTO")
    private String fechaNacimiento;
    
	public Customer(int id, String nombre, String apellido, String email, String genero, String telefono,
			String pais, String fechaNacimiento) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.genero = genero;
		this.telefono = telefono;
		this.pais = pais;
		this.fechaNacimiento = fechaNacimiento;
	}

	public Customer() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return nombre;
	}

	public void setFirstName(String nombre) {
		this.nombre = nombre;
	}

	public String getLastName() {
		return apellido;
	}

	public void setLastName(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return genero;
	}

	public void setGender(String genero) {
		this.genero = genero;
	}

	public String getContactNo() {
		return telefono;
	}

	public void setContactNo(String telefono) {
		this.telefono = telefono;
	}

	public String getCountry() {
		return pais;
	}

	public void setCountry(String pais) {
		this.pais = pais;
	}

	public String getDob() {
		return fechaNacimiento;
	}

	public void setDob(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email
				+ ", genero=" + genero + ", telefono=" + telefono + ", pais=" + pais + ", fechaNacimiento=" + fechaNacimiento + "]";
	}
	

}
