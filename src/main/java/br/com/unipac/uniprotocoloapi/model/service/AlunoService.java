package br.com.unipac.uniprotocoloapi.model.service;

import br.com.unipac.uniprotocoloapi.model.domain.Aluno;

import java.util.List;

public interface AlunoService {
    Aluno salvar(Aluno aluno);
    Aluno editar(Long id, Aluno aluno);
    List<Aluno> listaTodos();
    Aluno buscarPorId(Long id);
    void deletraPorId(Long id);
}
