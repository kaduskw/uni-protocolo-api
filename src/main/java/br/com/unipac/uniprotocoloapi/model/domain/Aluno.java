package br.com.unipac.uniprotocoloapi.model.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name="tb_alunos")
public class Aluno implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //->auto increment ou sequence
    private long id;

    @Column(nullable = false) //se o nome do atributo for igual o nome da coluna, não precisa declarar o nome na @column
    private String nome;

    @Column(nullable = true)
    private String matricula;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Aluno)) return false;
        Aluno aluno = (Aluno) o;
        return getId() == aluno.getId() && Objects.equals(getNome(), aluno.getNome()) && Objects.equals(getMatricula(), aluno.getMatricula());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNome(), getMatricula());
    }
}
