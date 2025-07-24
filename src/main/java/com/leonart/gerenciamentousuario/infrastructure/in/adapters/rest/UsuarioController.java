package com.leonart.gerenciamentousuario.infrastructure.in.adapters.rest;

import com.leonart.gerenciamentousuario.application.domain.usuario.Usuario;
import com.leonart.gerenciamentousuario.application.ports.in.UsuariosApi;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequiredArgsConstructor
public class UsuarioController implements UsuariosApi {


     @Override
     public ResponseEntity<Usuario> criarUsuario(Usuario usuario) {
         // Lógica para criar um usuário
         return ResponseEntity.ok(usuario);
     }

     @Override
     public ResponseEntity<Usuario> obterUsuarioPorId(Long id) {
         // Lógica para obter um usuário pelo ID
         return ResponseEntity.ok(Usuario.with(
                 1,
                 "login",
                 "email",
                 "senha",
                 "nome",
                 LocalDateTime.now(),
                 LocalDateTime.now(),
                 "endereco"));
     }
}
