package com.epita.tp1;

public abstract class Animal {
	//on d�clare les comportements communs
	
	//que l'on peut d�crire � ce niveau
	public void marcher() {
		
	}
	
	//que l'on ne peut pas d�clarer ici
	//tout animal communique
	//mais pas de la m�me fa�on --> d�l�gu� aux classes filles --> abstrat
	abstract void communiquer();
}
