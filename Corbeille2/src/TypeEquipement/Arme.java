package TypeEquipement;

public abstract class Arme extends Equipement{
	protected Integer pointsDeDegats; 

	
	


	public Arme(String nom, Integer pointsDeDegats) {
		super(nom);
		this.pointsDeDegats = pointsDeDegats;
	}





	public Integer getPointsDeDegats() {
		return this.pointsDeDegats;
	}

}
