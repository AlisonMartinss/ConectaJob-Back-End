package com.grupo6.ConectaJob.Service;

import com.grupo6.ConectaJob.Model.usuario.repositoryUserTrabalhador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import com.grupo6.ConectaJob.Model.usuario.userTrabalhador;
import com.grupo6.ConectaJob.Model.DTO.createTrabalhadorUserDTO;

@Service
public class UsuarioService{
    @Autowired
    private final repositoryUserTrabalhador usurepositorio;

    public UsuarioService(repositoryUserTrabalhador usurepositorio){this.usurepositorio = usurepositorio;}

    public UserDetails findbycpf(String cpf){
        return usurepositorio.findByCpf(cpf);
    }

    public boolean deletarUsuario (String cpf){
        long removidos = usurepositorio.deleteByCpf(cpf);
        return removidos > 0;

    }

    public UserDetails atualizartrabalhadorporcpf(String cpf, userTrabalhador trabalhador){
        userTrabalhador perfilantigo = usurepositorio.findEntityByCpf(cpf);
        userTrabalhador perfilatualizado = userTrabalhador.builder()
                .idade(trabalhador.getidade() != null ? trabalhador.getidade() : perfilantigo.getidade())
                .cpf(trabalhador.getCpf() != null ? trabalhador.getCpf() : perfilantigo.getCpf())
                .senha(trabalhador.getSenha() != null ? trabalhador.getSenha() : perfilantigo.getSenha())
                .nome(trabalhador.getNome() != null ? trabalhador.getNome() : perfilantigo.getNome())
                .id(perfilantigo.getId())
                .build();
        usurepositorio.saveAndFlush(perfilatualizado);

        Object createTrabalhadorUserDTO = null;
        Object TrabalhadorUserDTO1 = createTrabalhadorUserDTO;
        return (UserDetails) TrabalhadorUserDTO1;
    }




}
