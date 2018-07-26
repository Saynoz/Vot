package view;

import application.Controller;

public class Main {
	
	public static Controller controller = new Controller();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		controller.UserRegister("dbaques@gmail.com", "hola");
		controller.UserRegister("maria@gmail.com", "hola1");
		controller.UserRegister("dbaques@gmail.com", "hola");
		
	controller.UserLogin("dbaques@gmail.co", "hola");
	}

}
