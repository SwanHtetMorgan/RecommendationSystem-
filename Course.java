package dev.swanhtetaungphyo;

public class Course {
	String id;
	String title;
	String description;

	public Course(String id, String title, String description) {

		this.id = id;
		this.title = title;
		this.description = description;
	}

	public String getId() {

		return id;
	}

	public void setId(String id) {

		this.id = id;
	}

	public String getTitle() {

		return title;
	}

	public void setTitle(String title) {

		this.title = title;
	}

	public String getDescription() {

		return description;
	}

	public void setDescription(String description) {

		this.description = description;
	}

	@Override
	public String toString() {

		return "Course{" +
			   "id='" + id + '\'' +
			   ", title='" + title + '\'' +
			   ", description='" + description + '\'' +
			   '}';
	}

}
