package com.leonart.gerenciamentousuario.infrastructure;

import com.leonart.gerenciamentousuario.infrastructure.out.entity.UsuarioJPAEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioJPAEntity, Long> {
}
