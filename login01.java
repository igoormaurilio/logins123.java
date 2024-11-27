package aula10;

import java.util.Scanner;

public class login01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner (System.in);
		
		System.out.println("Sistema de login\n");
		System.out.println("Digite o usuário: ");
		int usuario =  scn.nextInt();
		
		if(usuario == 123456) {
			System.out.println("Usuário válido!!");
			
		}
		else {
		    System.out.println("Usuário invalido!");
	
		}
	}
}
