package br.com.fiap.doamin.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.GeneratedColumn;

import javax.annotation.processing.Generated;

@Entity
@Table(name = "TB_AREA", uniqueConstraints ={
    @UniqueConstraint(name = "UK_NM_AREA", columnNames = {"NM_AREA"})
})

public class Area {
    @Id()
    @Column( name = "ID_AREA")
    @GeneratedValue()
    @SequenceGenerator()
    public Area(Long id, String nome, String descricao) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    Long id;

    String nome;

    String descricao;

    @Override
    public String toString() {
        return "Area{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
