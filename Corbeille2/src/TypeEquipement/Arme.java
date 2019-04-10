package TypeEquipement;

/**
 * 
 * <h1> The Class Arme </h1>
 *
 */

public abstract class Arme extends Equipement{
	protected Integer pointsDeDegats; 

	
	

	/**
	 * Constructor of Arme
	 * 
	 * @param nom
	 * @param pointsDeDegats
	 */
	public Arme(String nom, Integer pointsDeDegats) {
		super(nom);
		this.pointsDeDegats = pointsDeDegats;
	}




	/**
	 * 
	 * @return pointsDeDegats
	 */
	public Integer getPointsDeDegats() {
		return this.pointsDeDegats;
	}

}
