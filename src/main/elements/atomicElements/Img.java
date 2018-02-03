package main.elements.atomicElements;
/*
 * This file contains class Img, which is derived from class AtomicElement
 */
import main.elements.AtomicElement;
/**
 * Image is a HTML tag, in this we denote Image as "img"
 * Image is type of Atomic Element
 * @author Amit Sharma
 * @version 1.0
 */
public class Img extends AtomicElement {
	
	// Attribute of Image tag
	String src;
	
	// Constructor to initialize the values
	public Img(String id, String src, String className){
		
		// calling parent class for initialization
		super(id , className);
		
		// initializing the value
		this.src = src;
		
	}
}

