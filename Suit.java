/*******************************************************************************
 * Companion code for the book "Introduction to Software Design with Java" 
 * by Martin P. Robillard.
 *
 * Copyright (C) 2019 by Martin P. Robillard
 *
 * This code is licensed under a Creative Commons 
 * Attribution-NonCommercial-NoDerivatives 4.0 International License.
 * 
 * See http://creativecommons.org/licenses/by-nc-nd/4.0/
 *******************************************************************************/
package comp303midtermpractice;

/**
 * Represents the suit of a playing card.
 */
public enum Suit 
{ 
	CLUBS, DIAMONDS, SPADES, HEARTS;
	Color color;
	
	/**
	 * @return Color of the suit
	 */
	public Color color() {
		if(this==DIAMONDS||this==HEARTS) {
			return Color.RED;
		}
		else{
			return Color.BLACK;
		}
	}
}

