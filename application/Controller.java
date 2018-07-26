package application;

import domain.Entity;
import domain.User;
import repository.persistence.Repository;

public class Controller {
	
	private Repository repo = new Repository();
	
	public void UserRegister(String email, String password) {
			 User user = new User(email,password);
			if( repo.addUser(user)) {System.out.println("Usuario añadido");}

	}
	public void UserLogin(String email, String password) {
		if (repo.userExistByEmail(email)) {
			//TODO el usuario existe
		}else {
			
			System.out.println("Este usuario no esta registrado");
		}
	}
	
	
	public void EntityRegister(String email, String password) {
		Entity entity = new Entity(email,password);
		repo.addEntity(entity);
	}
	
	public void EntityLogin(String email, String password) {
		if (repo.entityExistByEmail(email)) {
			//TODO el usuario existe
		}else {
			System.out.println("Esta entidad no esta registrada");
		}
	}
}
