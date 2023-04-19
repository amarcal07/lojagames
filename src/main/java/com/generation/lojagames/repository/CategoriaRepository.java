package com.generation.lojagames.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import com.generation.lojagames.model.Categoria;


	public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
	List<Categoria> findAllByGeneroContainingIgnoreCase(@Param("gnero")String Genero);
	
}
