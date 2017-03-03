package codeguide;
/**
 * Exercise for good writing code in topic "In public class use accessor methods"
 * 
 * @author Vittunyuta Maeprasart
 *
 */
public class Student {
	/** name of this student */
	private String name;
	/** identification number of this student */
	private long id;

	/**
	 * Constructor for initialize a student
	 * @param name of the student
	 * @param id of the student
	 */
	public Student(String name, long id) {
			this.name = name;
			this.id = id;
		}

	/**
	 * Accessor (getters) method for getting student's name.
	 * @return student's name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Accessor (getters) method for getting student's id.
	 * @return student's id
	 */
	public long getId() {
		return this.id;
	}

	/**
	 * Mutator (setters) method for setting student's name.
	 * @param newName is input name
	 */
	public void setName(String newName) {
		this.name = newName;
	}

	/**
	 *  Mutator (setters) method for setting student's id.
	 * @param newId id input id
	 */
	public void setId(long newId) {
		this.id = newId;
	}

}
