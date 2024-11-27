package aula10;

import java.util.Scanner;

public class login02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner (System.in);
		
		System.out.println("Sistema de login\n");
		System.out.println("Digite o usuário: ");
		
		String usuario =  scn.next();
		
		if(usuario.equals("senai")) {
			System.out.println("Usuário válido!");
		}
		else 
			System.out.println("Usuário invalido!");
	}

}
