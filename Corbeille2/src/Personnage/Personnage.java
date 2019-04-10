package Personnage;
import TypeRace.*;

import java.util.ArrayList;

import TypeEquipement.*;

import TypeRace.Humain;
import TypeRace.Race;

/**
 * 
 * @author kevinbourdeau
 * @version 1.0
 *
 */




/**
 * 
 * <h1> The Class Personnage </h1>
 *
 */
public class Personnage {

		protected String nom;
		protected Integer force;
		protected Integer agilite;
		protected Integer endurance;
		protected Integer intelligence;
		protected Integer sagesse;
		protected Race race;
		public ArrayList<Equipement> equipements;
		
		
		/**
		 * Constructor of the Personnage
		 * 
		 *
		 */
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
		
		
		
		/**
		 * Polymorphisme par surcharge ( Overloading ) 
		 * Constructor of the Personnage
		 * 
		 * @param nom
		 * @param force
		 * @param agilite
		 * @param endurance
		 * @param intelligence
		 * @param sagesse
		 * @param race
		 * 
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



		/**
		 * 
		 * @return nom
		 */
		
		public String getNom() {
			return nom;
		}
		
		/**
		 * 
		 * @return force
		 */
		
		public Integer getForce() {
			return force;
		}
		
		/**
		 * 
		 * @return agilite
		 */
		
		public Integer getAgilite() {
			return agilite;
		}

		/**
		 * 
		 * @return endurance
		 */
		
		public Integer getEndurance() {
			return endurance;
		}
		
		/**
		 * 
		 * @return intelligence
		 */
		
		public Integer getIntelligence() {
			return intelligence;
		}
		
		/**
		 * 
		 * @return sagesse
		 */
		
		public Integer getSagesse() {
			return sagesse;
		}
		
		/**
		 * 
		 * @see Personnage#ajouterEquipement(Equipement)
		 * @param equipements
		 */
		public void ajouterEquipement(final Equipement equipements) {
			this.equipements.add(equipements);
		}
		
}
