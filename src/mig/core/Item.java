package mig.core;
/**
 * <b> Class Item </b> 
 * <p> This Class creates an Item. </p>
 * <p> This Class is an abstract Class because it inherits 
 * from Class EnigmaItem and Key
 * This Class contain a name of the Item and a boolean to represent if the item
 * exist or not </p>  
 * 
 * @author Group 8
 * @version 22/11/16
 */
public abstract class Item
{
	/**
	 * Name is a String Object.
	 *It represents the name of the Item.
	 */
	private String name;
	
	/**
	 * Boolean to know if the object exist or not.
	 * True if the item exist, false if it is not.
	 */
	private boolean exist = false;
	
	
	public Item (String name){
		if ((name==null)||(name.isEmpty()))
			this.name="unknown name";
		else 
			this.name=name;
	}
	
	/**
	 * Getter for the name of the item.
	 * @return The name of the item (String)
	 * 
	 * @see Item#name
	 */
	public String getName() {
		return name;
	}

//	/**
//	 * Setter for the name of the item.
//	 * @param name The name of the Item.
//	 * Protected because the name can be changed only in the class .
//	 * 
//	 * @see Item#name
//	 */
//	protected void setName(String name) {
//		this.name = name;
//	}

	
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
	
	public void existNow(){
		this.exist=true;
	}
	
	public void notExist(){
		this.exist=false;
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
