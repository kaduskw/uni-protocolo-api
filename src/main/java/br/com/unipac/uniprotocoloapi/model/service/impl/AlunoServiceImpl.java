package br.com.unipac.uniprotocoloapi.model.service.impl;

import br.com.unipac.uniprotocoloapi.model.domain.Aluno;
import br.com.unipac.uniprotocoloapi.model.repository.AlunoRepositorio;
import br.com.unipac.uniprotocoloapi.model.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlunoServiceImpl implements AlunoService {

    @Autowired
    private AlunoRepositorio alunoRepositorio;


    @Override
    public Aluno salvar(Aluno aluno) {
        return alunoRepositorio.save(aluno);
    }

    @Override
    public Aluno editar(Long id, Aluno aluno) {
        aluno.setId(id);
        return alunoRepositorio.save(aluno);
    }

    @Override
    public List<Aluno> listaTodos() {
        return alunoRepositorio.findAll();
    }

    @Override
    public Aluno buscarPorId(Long id) {
        return alunoRepositorio.getById(id);
    }

    @Override
    public void deletraPorId(Long id) {
        alunoRepositorio.deleteById(id);
    }
}
