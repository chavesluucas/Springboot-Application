package tech.techcontrol.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tech.techcontrol.application.entities.User;
import tech.techcontrol.application.services.UserService;

@RestController
@RequestMapping("/users/")
public class UserController {
	
	//EndPoints
	
	@Autowired
	private UserService service;

	//Aqui é onde vai ter o metodo HTTP responsável por trazer as info do service para a web
	//Metodo que vai retornar um ResponseEntity de lista de usuario
	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		
		//Então declaramos uma lista de usuarios chamado list que recebe o findAll do service = service.findAll()
		List<User> list = service.findAll();
		
		//Então vamos retornar uma 
		return ResponseEntity.ok().body(list);
	}
	
	//Fazendo um get, que recebe um parametro de um ID
	@GetMapping(value = "/{id}") //Metodo que vai retornar só um User, o findById recebe o parametro do tipo de variavel e variavel, e antes a anotation @PathVariable
	public ResponseEntity<User> findById(@PathVariable Long id){
		//User vai ser o obj que vai receber o serviço de findById
		User obj = service.findById(id);
		//vai ser retornado uma ResponseEntity do tipo ok no corpo com o obj(o Usuario que foi buscado pelo id)
		return ResponseEntity.ok().body(obj);
	}
	
}
