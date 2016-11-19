package mig.core;

public abstract class  EnigmaItem extends Item {

	protected String information;

	public String getInformation() {
		return information;
	}

	/**
	 * 
	 * @param information
	 * String that contain the information given by the EnigmaItem
	 */
	protected void setInformation(String information) {
		this.information = information;
	}
	
	@Override
	public String toString(){
		String str = "This Item is a/an " +
		this.getClass().getSimpleName() + ", called " 
		+ this.name + "\nInformation given is the following:\n"
		+ this.information ;
		return str;
	}

}
