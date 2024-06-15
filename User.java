package dev.swanhtetaungphyo;

import java.util.List;


public class User {
	String id;
	List<String> registeredCourses;
	List<String> searchedKeywords;

	public User(String id, List<String> registeredCourses, List<String> searchedKeywords) {

		this.id = id;
		this.registeredCourses = registeredCourses;
		this.searchedKeywords = searchedKeywords;
	}

	public String getId() {

		return id;
	}

	public void setId(String id) {

		this.id = id;
	}

	public List<String> getRegisteredCourses() {

		return registeredCourses;
	}

	public void setRegisteredCourses(List<String> registeredCourses) {

		this.registeredCourses = registeredCourses;
	}

	public List<String> getSearchedKeywords() {

		return searchedKeywords;
	}

	public void setSearchedKeywords(List<String> searchedKeywords) {

		this.searchedKeywords = searchedKeywords;
	}

}
