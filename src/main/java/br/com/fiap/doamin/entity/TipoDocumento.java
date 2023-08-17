package br.com.fiap.doamin.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "TB_TP_DOCUMENTO", uniqueConstraints = {
        @UniqueConstraint(name = "UK_NM_TP_DOCUMENTO", columnNames ={"NM_TP_DOCUMENTO"})
})
public class TipoDocumento {

    @Id
    @GeneratedValue
    @SequenceGenerator()
    @Column(name = "ID_TIPO_DOCUMENTO")
    private Long id;

    private String Nome;

    public TipoDocumento(Long id, String nome) {
        this.setId(id);
        setNome(nome);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }
}
