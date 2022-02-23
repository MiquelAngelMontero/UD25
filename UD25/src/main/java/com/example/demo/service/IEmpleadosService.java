package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Empleados;

public interface IEmpleadosService {
	
	public List<Empleados> listarEmpleados();
	
	public Empleados guardarEmpleados(Empleados empleados);
	
	public Empleados empleadoXID(String id);
	
	public Empleados actualizarEmpleado(Empleados empleados);
	
	public void eliminarEmpleados(String id);

}
