package tech.techcontrol.application.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import tech.techcontrol.application.entities.User;
import tech.techcontrol.application.repositories.UserRepository;

//Classe especifica de configuração
@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	//por enquanto essa classe vai servir para "database seeding"(popular o banco de dados)
	
	@Autowired
	private UserRepository userRepository;

	//para fazer o test precisamos implementar o CommandLineRunner
	@Override
	public void run(String... args) throws Exception {
		//Tudo que for inserido aqui dentro vai ser rodado quando der o start na aplicação
		
		//inserindo os usuarios (Database seeding)
		User u1 = new User(null, "Maria Brown", "maria@email.com", "988888888", "senha123");
		User u2 = new User(null, "Alex Green", "alex@email.com", "977777777", "senha456");
		User u3 = new User(null, "Daniel Blue", "daniel@email.com", "966666666", "senha789");
		
		//salvando os dois usuarios inclusos
		userRepository.saveAll(Arrays.asList(u1, u2, u3));
	}
	
	
	
}
