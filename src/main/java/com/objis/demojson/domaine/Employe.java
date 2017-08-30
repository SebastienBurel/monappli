package com.objis.demojson.domaine;

import java.util.ArrayList;
import java.util.Collection;

public class Employe {
	
	private String nom; 
	private String prenom;
	private Collection<Employe> employes;
	
	public Employe(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.employes = new ArrayList<Employe>();
	}

	
	public Employe() {
		super();
	}


	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	
	@Override
	public String toString() {
		return "Employe [nom=" + nom + ", prenom=" + prenom + "]";
	}

	public void poserConges() {
		System.out.println("L'employé " + this.prenom + " " + this.nom + " pose des congés");
	}
	
	

}
