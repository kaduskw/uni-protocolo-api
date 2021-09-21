package br.com.unipac.uniprotocoloapi.model.repository;

import br.com.unipac.uniprotocoloapi.model.domain.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface AlunoRepositorio extends JpaRepository<Aluno, Long> {
}
