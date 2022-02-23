package com.example.demo.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Empleados")//Nombre de la tabla
public class Empleados {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id; 
	@Column(name="nombre")
	private String nombre;
	@Column(name="apellidos")
	private String apellidos;
	
	@ManyToOne
	@JoinColumn(name="dept_cod")
	private Departamentos departamentos;
	
	//Constructores
	/**
	 * @param id
	 * @param nombre
	 * @param apellidos
	 * @param departamentos
	 */
	public Empleados() {
		
	}
	
	public Empleados(String id, String nombre, String apellidos, Departamentos departamentos) {
		this.id=id;
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.departamentos=departamentos;
	}
	
	//Getters y setters
	/**
	 * @return the id
	 */
	public String getid() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setid(String id) {
		this.id = id;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}
	
	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * @return the departamentos
	 */
	public Departamentos getDepartamentos() {
		return departamentos;
	}

	/**
	 * @param departamentos the departamentos to set
	 */
	public void setDepartamentos(Departamentos departamentos) {
		this.departamentos = departamentos;
	}

	@Override
	public String toString() {
		return "Empleados [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", departamentos="
				+ departamentos + "]";
	}
}
