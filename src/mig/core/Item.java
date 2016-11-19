package mig.core;

public abstract class Item
{
	/**
	 * Name is a String Object.
	 *It represents the name of the Item.
	 */
	protected String name;
	
	/**
	 * slot is an integer.
	 * It represents the weight of the object.
	 */
	protected int weight;
	
	/**
	 * Boolean to know if the object exist or not.
	 * True if the item exist, false if it is not.
	 */
	protected boolean exist = false;
	
	
	/**
	 * Getter for the name of the item.
	 * @return The name of the item (String)
	 * 
	 * @see Item#name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setter for the name of the item.
	 * @param name The name of the Item.
	 * Protected because the name can be changed only in the class .
	 * 
	 * @see Item#name
	 */
	protected void setName(String name) {
		this.name = name;
	}

	/**
	 * Getter for the weight of the object.
	 * @return the value of the weight (integer)
	 * 
	 * @see Item#weight
	 */
	public int getWeight() {
		return weight;
	}

	/**
	 * Setter for the weight of the object.
	 * @param weight the value of the weight (integer)
	 * 
	 * @see Item#weight
	 */
	protected void setWeight(int weight) {
		this.weight = weight;
	}
	
	/**
	 * Getter to know if the object exist.
	 * @return True if the item exist
	 * 
	 * @see Item#exist
	 */
	public boolean getExist(){
		return exist;
	}
	
	/**
	 * Setter for exist parameter.
	 * @param exist True if the item exist
	 * 
	 * @see Item#exist
	 */
	public void setExist(boolean exist){
		this.exist=exist;
	}
	
	/**
	 * Method to display information about the object .
	 * Overriding of the method toString of the class Object
	 * 
	 * @see Object#toString()
	 */
	@Override
	public String toString(){
		String str = "This Item is a/an" +
		this.getClass().getSimpleName()  + ", called " + this.name ;
		return str;
	}

}
