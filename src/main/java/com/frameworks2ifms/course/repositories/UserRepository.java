package com.frameworks2ifms.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.frameworks2ifms.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}

/* N é necessário criar uma implementação para a interface, pois o Spring.data.jpa já possui
 * uma implementação padrão da interface - basta definir JpaRepository<entidade, tipoEntidade>
 */

