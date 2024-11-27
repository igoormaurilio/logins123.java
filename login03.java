package aula10;

import java.util.Scanner;

public class login03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner (System.in);
		
		System.out.println("Sistema de login\n");
		System.out.println("Digite o usuário: ");
		
		String usuario = scn.next();
		
		System.out.println("digite a senha: ");
		int senha = scn.nextInt();
		
		
		if(usuario.equals("senai") && senha == 1234) {
			System.out.println("Usuário válido!");
		}
		else 
			System.out.println("Usuário invalido!");

	}

}
