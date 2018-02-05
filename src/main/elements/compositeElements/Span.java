/*
 * This file contains class named Span derived from class CompositeElement
 */
package main.elements.compositeElements;

import main.elements.CompositeElement;
/**
 * Span is a HTML tag
 * Span is type of Composite Element
 * @author Amit Sharma
 * @version 1.0
 */
public class Span extends CompositeElement{
	
	// Constructor to initialize the values
	Span(String id, String className){
		
		// calling parent class for initialization
		super(id , className);
	}
}
