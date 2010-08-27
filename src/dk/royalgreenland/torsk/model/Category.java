/**
 * 
 */
package dk.royalgreenland.torsk.model;

/**
 * The Category class is a model of a category.
 * Contains information such as name and description. 
 * @author Christian Sindberg
 */
public class Category {
	
	private String name;

	private String description;
	
	/**
	 * Creates a new category.
	 * @param name The name of the category.
	 * @param description The Description of the category.
	 */
	public Category(String name, String description) {
		setName(name);
		setDescription(description);
	}
	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

}
