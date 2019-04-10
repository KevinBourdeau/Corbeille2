package Personnage;
import TypeRace.*;

import java.util.ArrayList;

import TypeEquipement.*;

import TypeRace.Humain;
import TypeRace.Race;

public class Personnage {

		protected String nom;
		protected Integer force;
		protected Integer agilite;
		protected Integer endurance;
		protected Integer intelligence;
		protected Integer sagesse;
		protected Race race;
		public ArrayList<Equipement> equipements;
		
		
		public Personnage() {
			this.nom = "Sans Nom";
			this.force = 10;
			this.agilite = 10;
			this.endurance = 10;
			this.intelligence = 10;
			this.sagesse = 10;
			this.race = new Humain();
			this.equipements = new ArrayList<Equipement>();
			
			
			
		}
		
		
		
		/*
		 * Polymorphisme par surcharge ( Overloading ) 
		 */
		public Personnage(String nom, Integer force, Integer agilite, Integer endurance, Integer intelligence,
				Integer sagesse, Race race) {
			super();
			this.nom = "Le Sang de mes Morts";
			this.force = 1000;
			this.agilite = 1;
			this.endurance = 10;
			this.intelligence = 0;
			this.sagesse = 0;
			this.race = new Nain();
		}




		public String getNom() {
			return nom;
		}
		public Integer getForce() {
			return force;
		}
		public Integer getAgilite() {
			return agilite;
		}
		public Integer getEndurance() {
			return endurance;
		}
		public Integer getIntelligence() {
			return intelligence;
		}
		public Integer getSagesse() {
			return sagesse;
		}
		
		public void ajouterEquipement(final Equipement equipements) {
			this.equipements.add(equipements);
		}
		
}
