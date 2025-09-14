package com.grupo6.ConectaJob.Model.usuario;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.print.DocFlavor;

@Table
@Entity(name = "avaliacoes")
@NoArgsConstructor
public class userAvaliacoes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    private int nota;
    private String comentario;
    private String CNPJ;
    private String Avaliador;

    public int getNota() {
        return nota;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getComentario() {
        return comentario;
    }

    public void setcomentario(String comentario) {
        this.comentario = comentario;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public void setAvaliador(String avaliador) {
        Avaliador = avaliador;
    }

    public String getAvaliador(){
        return Avaliador;
    }

    public String getCNPJ(){
        return CNPJ;
    }

}

