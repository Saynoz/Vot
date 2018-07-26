package repository.persistence;


import java.util.ArrayList;
import java.util.List;

import domain.Entity;
import domain.User;

public class Repository {
	private List<User> users = new ArrayList<User>();
	private List<Entity> entitis = new ArrayList<Entity>();
	

	public boolean addUser(User user) {
		boolean result=false;
		if(userExistByEmail(user.getEmail())) {
			System.out.println("El usuario ya existe");
		}else {
			this.users.add(user);
			result=true;
		}
		return result;
	}
	
	public boolean addEntity(Entity entity) {
		boolean result=false;
		if(entityExistByEmail(entity.getEmail())) {
			System.out.println("La entidad ya existe");
		}else {
			this.entitis.add(entity);
			result=true;
		}
		return result;
	}
	
	
	public User findUserByEmail(String email) {
	 int resultindex=0;
		for(int i=0; i<users.size(); i++) {
			if (users.get(i).getEmail().matches(email)) {
				resultindex=i;
				break;
			}
		}
		return users.get(resultindex);
	}
	
	public Entity findEntityByEmail(String email) {
		 int resultindex=0;
			for(int i=0; i<entitis.size(); i++) {
				if (entitis.get(i).getEmail().matches((email))) {
					resultindex=i;
					break;
				}
			}
			return entitis.get(resultindex);
		}
	
	public boolean userExistByEmail(String email) {
		 boolean result= false;
			for(int i=0; i<users.size(); i++) {
				if (users.get(i).getEmail().matches(email)) {
					result=true;
					break;
				}
			}
			return result;
		}
	
	public boolean entityExistByEmail(String email) {
		 boolean result= false;
			for(int i=0; i<entitis.size(); i++) {
				if (entitis.get(i).getEmail().matches(email)) {
					result=true;
					break;
				}
			}
			return result;
		}
}
