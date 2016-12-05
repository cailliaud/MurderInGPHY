package mig.core;

import java.net.URL;

import javax.swing.ImageIcon;

/**
 * <b>The class PhysicalObject represents the physical items given or found by the player.</b>
 * <p>
 * it uses inheritance from the class EnigmaItem
 * </p>
 * 
 * @see EnigmaItem
 * 
 * @author Group 8
 * @version 22/11/2016
 */
public class PhysicalObject extends EnigmaItem {
	
	/**
	 * Image of the PhysicalObject
	 */
	private final ImageIcon image;
	
	/**
	 * Constructor of the class PhysicalObject
	 * 
	 * @param name Name of the Physical Object
	 * @param information Information about the Physical Object
	 * 
	 * If name of information are null , there will be default value for them
	 * The image of the object has a default value
	 */
	public PhysicalObject(String name, String information ) {
		super(name,information);
		
		// default image
		URL urlimage = PhysicalObject.class.getResource("resources/wooden-crate.png");
		this.image = new ImageIcon(urlimage);
	}
	
	/**
	 * COnstructor of the class PhysicalObject 
	 * @param name Name of the PhysicalObject
	 * @param information Information about the PhysicalObject
	 * @param image path of the image for the physicalObejct
	 */
	public PhysicalObject (String name, String information , String image){ 	
		super(name,information);
		URL urlimage = PhysicalObject.class.getResource("resources/PhysicalObjects_Icon/"+image);
		this.image = new ImageIcon(urlimage);
	
	}
	
	/**
	 * Accessor for the image 
	 * @return the image of the physicalObject
	 */
	public ImageIcon getImage(){
		return this.image;
	}
	
}
