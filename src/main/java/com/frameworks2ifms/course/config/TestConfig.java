package com.frameworks2ifms.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.frameworks2ifms.course.entities.User;
import com.frameworks2ifms.course.repositories.UserRepository;

@Configuration // define que esta é uma classe de configuração
@Profile("test") // define que a configuração é específica do perfil "test", definido em aplication.proprieties

/*
 * Esta classe fará o Data-base seeding
 * Iremos popular o banco de dados
 * Teremos uma injeção de dependência, pois a classe TestConfig dependerá da classe que faz
 * a conexão com o BD, que é o UserRepository
 */

public class TestConfig implements CommandLineRunner {
	
	/* A Classe implementa a interface CommandLineRunner para executar comandos específicos
	 * durante a inicialização de uma aplicação, basta sobrescrever o método run() e inserir a lógica
	 * a ser executada na inicialização
	 * 
	 *  a anotação "@Autowired" faz com que o spring resolva a dependência e associe uma instancia
	 * de userrepository à classe TestConfig - @Autowired faz injeção de dependência automaticamente */
	
	@Autowired 
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		
	}
	
	// instanciando objetos e salvando no banco de dados:
	
	
	

}
