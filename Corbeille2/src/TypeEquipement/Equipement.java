package TypeEquipement;

/**
 * 
 * <h1> The Class Equipement </h1>
 *
 */

public abstract class Equipement {
	protected String nom;
	
	
	/**
	 * Constructor of Equipement
	 * 
	 * @param nom
	 */
	public Equipement(final String nom)
	{
		this.nom = nom;
	}
	
	/**
	 * 
	 * @return nom
	 */
	public String getNom() {
		return this.nom;
	}
	
	

}
