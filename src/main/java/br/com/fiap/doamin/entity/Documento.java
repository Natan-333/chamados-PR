package br.com.fiap.doamin.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDatee;



@Entity
@Table(name ="TB_Documento" )
public class Documento {

    @Id
    @GeneratedValue(Strategy = GenerationType.SEQUENCE)
    @SequenceGenerator()
    private long id;

    @Column(name ="NR-DOCUMENTO")
    private String numero;

    @Column(name = "DT-validade")
    private LocalDate validade;

    @Column(name = "NR-VALIDADE")
    private TipoDocumento tipo;

    @ManyToOne
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public LocalDate getValidade() {
        return validade;
    }

    public void setValidade(LocalDate validade) {
        this.validade = validade;
    }

    public TipoDocumento getTipo() {
        return tipo;
    }

    public void setTipo(TipoDocumento tipo) {
        this.tipo = tipo;
    }
}
