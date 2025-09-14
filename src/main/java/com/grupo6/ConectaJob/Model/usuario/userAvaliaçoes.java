package com.grupo6.ConectaJob.Model.usuario;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.print.DocFlavor;

@Table
@Entity(name = "avaliaçoes")
@NoArgsConstructor
public class userAvaliaçoes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    private int nota;
    private String avaliaçao;

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getAvaliaçao() {
        return avaliaçao;
    }

    public void setAvaliaçao(String avaliaçao) {
        this.avaliaçao = avaliaçao;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }
}
