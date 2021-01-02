package com.epita.tp1;

public abstract class Animal {
	//on déclare les comportements communs
	
	//que l'on peut décrire à ce niveau
	public void marcher() {
		
	}
	
	//que l'on ne peut pas déclarer ici
	//tout animal communique
	//mais pas de la même façon --> délégué aux classes filles --> abstrat
	abstract void communiquer();
}
