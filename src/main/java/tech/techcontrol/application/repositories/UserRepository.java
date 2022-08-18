package tech.techcontrol.application.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import tech.techcontrol.application.entities.User;

//Para criar o repository, basicamente extendemos a nossa interface para JpaRepository passando as info <"Entidade", "Tipo do ID">
public interface UserRepository extends JpaRepository<User, Long>{

}
