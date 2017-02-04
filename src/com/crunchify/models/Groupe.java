package com.crunchify.models;

import java.util.ArrayList;

public class Groupe {
	private ArrayList<Object> membres;

	public ArrayList<Object> getMembres() {
		return membres;
	}

	public void setMembres(ArrayList<Object> membres) {
		this.membres = membres;
	}
	
	
	public void addMembbre(String nom){
			membres.add(nom);
	}
	
	

}
