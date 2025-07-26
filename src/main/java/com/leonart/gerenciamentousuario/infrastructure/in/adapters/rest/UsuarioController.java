package com.leonart.gerenciamentousuario.infrastructure.in.adapters.rest;

import com.leonart.gerenciamentousuario.application.domain.usuario.Usuario;
import com.leonart.gerenciamentousuario.application.domain.usuario.UsuarioDTO;
import com.leonart.gerenciamentousuario.application.ports.in.UsuariosApi;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class UsuarioController implements UsuariosApi {


     @Override
     public ResponseEntity<UsuarioDTO> criarUsuario(UsuarioDTO usuario) {
         // Lógica para criar um usuário
         return ResponseEntity.ok(usuario);
     }

     @Override
     public ResponseEntity<UsuarioDTO> obterUsuarioPorId(Integer id){
         // Lógica para obter um usuário por ID
         UsuarioDTO usuario = new UsuarioDTO()
                 .id(1)
                 .login("usuario1")
                 .email("usuario@email.com")
                 .senha("senha123")
                 .nome("Nome do Usuário")
                 .dataDaUltimaAlteracao("2024-06-01T12:00:00")
                 .dataDeCriacao("2024-05-01T09:00:00")
                 .endereco("Rua Exemplo, 123");
            return ResponseEntity.ok(usuario);
     }

}
