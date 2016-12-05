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
	
	
	private final ImageIcon image;
	
	/**
	 * Constructor of the class PhysicalObject
	 * 
	 * @param name Name of the Physical Object
	 * @param information Information about the Physical Object
	 * 
	 * If name of information are null , there will be default value for them
	 */
	public PhysicalObject(String name, String information ) {
		super(name,information);
		URL urlimage = PhysicalObject.class.getResource("resources/wooden-crate.png");
		this.image = new ImageIcon(urlimage);
	}
	
	public PhysicalObject (String name, String information , String image){ 	
		super(name,information);
		URL urlimage = PhysicalObject.class.getResource("resources/PhysicalObjects_Icon/"+image);
		this.image = new ImageIcon(urlimage);
	
	}
	
	public ImageIcon getImage(){
		return this.image;
	}
	
}
