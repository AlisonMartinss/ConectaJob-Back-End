package com.grupo6.ConectaJob.Controller;

import com.grupo6.ConectaJob.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.grupo6.ConectaJob.Model.usuario.userTrabalhador; //import de usertrabalhador


@RestController
@RequestMapping("/Usuario")
public class usuarioController {
    @Autowired
    private UsuarioService usuarioservice;

    @DeleteMapping
    public String deletar(@RequestParam String cpf){
        usuarioservice.deletarUsuario(cpf);
        return "usuario deletado";}

    @PutMapping
    public ResponseEntity<Void> atualizartrabalhadorporcpf(@RequestParam String cpf, @RequestBody userTrabalhador trabalhador){
        usuarioservice.atualizartrabalhadorporcpf(cpf, trabalhador);
        return ResponseEntity.ok().build();
    }

}
