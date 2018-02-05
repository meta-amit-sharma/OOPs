/*
 * This file contains abstract Class named Element
 */
package main;

import java.util.List;

/**
 * This Class acts as the super class for all the 
 * elements of DOM. This contains all the attributes
 * which are common to all elements in DOM.
 * @author Amit Sharma
 * @version 1.0
 */
public abstract class Element {
	
	// id of tag
	protected String id;


	// class of tag
	protected String className;
	
	// Constructor for initializing values
	public Element(String id, String className) {
		
		// initializing id
		this.id = id;
		
		// initializing class name
		this.className = className;
		
	}
	
	// returns id of a particular tag
	public String getId() {
		
		return id;
	}
	
	// returns class name of a particular tag
	public String getClassName() {
		
		return className;
	}

	public Element findById( String id){
		return null;
	}
	
	public List<Element> findByClass(String className){
		return null;
	}
	/**
	 * Recursive function to find the hierarchy of elements
	 * @param element - the composite element
	 * @param count - counts the hierarchy, upto what level the element is
	 * @return - the list
	 */
	public List<String> displayDomRecursive(String spaces){
		return null;
	}
		
}