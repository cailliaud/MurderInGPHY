package fr.mig.core;

public abstract class Item
{
	/**
	 * Name is a String Object
	 *It represents the name of the Item
	 */
	protected String name;
	
	/**
	 * slot is an integer
	 * It represents the weight of the object
	 */
	protected int weight;

	public String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	protected void setWeight(int weight) {
		this.weight = weight;
	}
	
	@Override
	public String toString(){
		String str = "This Item is a/an" +
		this.getClass().getSimpleName()  + ", called " + this.name ;
		return str;
	}

}
