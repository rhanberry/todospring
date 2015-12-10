package main.java.todospring.model;

public class Todolist {

	


	private int id;
	private String todoitem;
	private String tododescription;
	private boolean isComplete;


	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the todoitem
	 */
	public String getTodoitem() {
		return todoitem;
	}

	/**
	 * @param todoitem
	 *            the todoitem to set
	 */
	public void setTodoitem(String todoitem) {
		this.todoitem = todoitem;
	}

	/**
	 * @return the tododescription
	 */
	public String getTododescription() {
		return tododescription;
	}

	/**
	 * @param tododescription
	 *            the tododescription to set
	 */
	public void setTododescription(String tododescription) {
		this.tododescription = tododescription;
	}

	/**
	 * @return the isComplete
	 */
	public boolean isComplete() {
		return isComplete;
	}

	/**
	 * @param isActive
	 *            the isComplete to set
	 */
	public void setComplete(boolean isActive) {
		this.isComplete = isActive;
	}



	@Override
	public String toString() {
		return "Todolist [id=" + id + ", todoitem=" + todoitem + ", tododescription=" + tododescription + ", age="
				+ age + ", isComplete=" + isComplete + "]";
	}
}
