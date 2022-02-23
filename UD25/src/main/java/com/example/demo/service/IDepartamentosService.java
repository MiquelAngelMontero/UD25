package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Departamentos;

public interface IDepartamentosService {
public List<Departamentos> listarDepartamentos();
	
	public Departamentos guardarDepartamentos(Departamentos empleados);
	
	public Departamentos departamentoXID(Long id);
	
	public Departamentos actualizarDepartamento(Departamentos empleados);
	
	public void eliminarDepartamento(Long id);
}
