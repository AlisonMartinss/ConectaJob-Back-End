package com.grupo6.ConectaJob.Service;

import com.grupo6.ConectaJob.Model.usuario.repositoryUserTrabalhador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import com.grupo6.ConectaJob.Model.usuario.userTrabalhador;
import com.grupo6.ConectaJob.Model.usuario.userAvaliaçoes;
import java.util.ArrayList;

public class AvaliacoesService {
    private ArrayList<userAvaliaçoes> avaliaçoes;

    public AvaliacoesService(){
        avaliaçoes = new ArrayList<userAvaliaçoes>();
    }


}
