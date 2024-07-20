package com.utp.servidor.entidad;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class Cliente {
	
    private Long codigo;

    
    private String nombre;

  
    private String paterno;

  
    private String materno;

  
    private String dni;


    private String sexo;

    private String departamento;

	public Cliente(Long codigo, String nombre, String paterno, String materno, String dni, String sexo,
			String departamento) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.paterno = paterno;
		this.materno = materno;
		this.dni = dni;
		this.sexo = sexo;
		this.departamento = departamento;
	}
    
    
	
}
