/**
 * 
 */
package com.test.liv.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author belgoudene
 *
 */
public class Article {

	private Integer id;
	
	private String name;
	
	private List<String> listeArticle = new ArrayList<String>();

	/**
	 * @return the id
	 */
	public final Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public final void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public final String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public final void setName(String name) {
		this.name = name;
	}
	
	public List<String> getListeArticle(){
		
		listeArticle.add("Article1");
		listeArticle.add("Article2");
		listeArticle.add("Article3");
		listeArticle.add("Article4");
		
		return listeArticle;
	}
	
	
}
