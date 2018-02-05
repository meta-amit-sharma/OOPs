/*
 * This file contains Class Dom
 */
package main;

import main.elements.CompositeElement;
import java.util.ArrayList;
import java.util.List;
/**
 * The class DOM represents the Document object model 
 * just as it is in real world. It is here where the elements 
 * gets added and it also maintains the hierarchy of the element 
 * in which they are added.
 * @author Amit Sharma
 * @version 1.0
 */
public class Dom {
	Element element;
	public Dom(Element root){
		element = (CompositeElement) root;
	}
	/**
	 * 
	 * @param id
	 * @returns Element
	 * 
	 * Searches element by ID
	 */
	public Element findElementByID (String id) {
		// returns element 
		return this.element.findById(id);
	}
	
	/**
	 * 
	 * @param className
	 * @returns Element's List
	 * 
	 * Searches element by class name
	 */
	public List<Element> findElementByClass(String className) {
		// return list of elements with same class
		return this.element.findByClass(className);
	}
		
	/**
	 * To get the list of elements of the DOM in hierarchical form
	 * @return the list of the hierarchy of elements
	 */
	public List<String> displayDOM(){
		return this.element.displayDomRecursive("");
	
	}
}

