package br.com.unicuritiba.CadastroJogo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.unicuritiba.CadastroJogo.models.Jogo;

public interface JogoRepository 
	extends JpaRepository<Jogo, Long>{
	
}
