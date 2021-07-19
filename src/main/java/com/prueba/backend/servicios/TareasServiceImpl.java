package com.prueba.backend.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.prueba.backend.entidades.GccobranzasGestor;

@Service
public class TareasServiceImpl implements ITareaService {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<GccobranzasGestor> findAll2() {
		String sql = "SELECT CONCAT(PRIMER_NOMBRE, ' ', SEGUNDO_NOMBRE, ' ',PRIMER_APELLIDO, ' ',SEGUNDO_APELLIDO) NOMBRE_COMPLETO FROM GCCOBRANZAS.COB_GESTOR";
		List<GccobranzasGestor> Gccobranzas_gestor = jdbcTemplate.query(sql,
				BeanPropertyRowMapper.newInstance(GccobranzasGestor.class));
		return Gccobranzas_gestor;
	}

}
