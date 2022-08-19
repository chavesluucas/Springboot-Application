package tech.techcontrol.application.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tech.techcontrol.application.entities.User;
import tech.techcontrol.application.repositories.UserRepository;

//O services é responsável pelas regras de negócios
@Service
public class UserService {
	
	@Autowired //responsável por fazer o spring injetar as dependências de forma transparente ao programador
	private UserRepository repository;
	
	//Metodo responsável para retornar uma LISTA do tipo USER do banco de dados
	public List<User> findAll(){
		return repository.findAll();
	}
	
	//Metodo que vai ser um User, que vamos chamar pelo ID, então é passado o paramentro (Tipo + Variavel)
	public User findById(Long id) {
		//Então vamos chamaro o metodo Optinal que recebe um User e vamos chamar ele de obj(objeto), dentro dessa variavel obj vai encontrar o metodo que vai buscar o ID
		Optional<User> obj= repository.findById(id);
		//Após o Optinal pegar o ID, vamos retornar o obj com o .get()
		return obj.get();
	}
	
}
