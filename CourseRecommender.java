package dev.swanhtetaungphyo;

import java.util.*;

public class CourseRecommender {

	public static List<Course> recommendCourses(User user, List<Course> allCourses, List<String> registeredCourses) {

		Map<CharSequence, Integer> userVector = new HashMap<>();


		for (String courseId : user.getRegisteredCourses()) {
			Course course = Helper.findCourseById(allCourses, courseId);
			if (course != null) {
				userVector = Helper.mergeVector(userVector, TextProcessor.getWordFrequency(course.getDescription()));
			}
		}
		for (String keyword : user.getSearchedKeywords()) {
			userVector = Helper.mergeVector(userVector, TextProcessor.getWordFrequency(keyword));
		}


		Map<Course, Double> scoreListReceiver = Helper.scoreForAllCourses(userVector, allCourses);

		List<Map.Entry<Course, Double>> sortedCourses = new ArrayList<>(scoreListReceiver.entrySet());
		sortedCourses.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));


		Iterator<Map.Entry<Course, Double>> iterator = sortedCourses.iterator();
		while (iterator.hasNext()) {
			Course course = iterator.next().getKey();
			if (registeredCourses.contains(course.getTitle())) {
				iterator.remove();
			}
		}


		List<Course> recommendation = new ArrayList<>();
		int count = Math.min(5, sortedCourses.size());
		for (int i = 0; i < count; i++) {
			if (!sortedCourses.get(i).getValue().equals(0.0)) {
				recommendation.add(sortedCourses.get(i).getKey());
			}
		}

		sortedCourses.forEach(entry -> System.out.println(entry.getKey().getTitle() + ": " + entry.getValue()));

		System.out.println("_______________________");

		return recommendation;
	}

}


class Helper {

	public static Course findCourseById(List<Course> courses, String Id) {

		for (Course course : courses) {
			if (course.getId().equals(Id)) {
				return course;
			}
		}
		return null;
	}

	public static Map<CharSequence, Integer> mergeVector(Map<CharSequence, Integer> vector1, Map<CharSequence, Integer> vector2) {

		Map<CharSequence, Integer> merged = new HashMap<>(vector1);
		for (Map.Entry<CharSequence, Integer> entry : vector2.entrySet()) {
			merged.put(entry.getKey(), merged.getOrDefault(entry.getKey(), 0) + entry.getValue());
		}
		return merged;
	}


	public static Map<Course, Double> scoreForAllCourses(Map<CharSequence, Integer> userVector, List<Course> courseList) {

		Map<Course, Double> scoreList = new HashMap<>();
		for (Course course : courseList) {
			Map<CharSequence, Integer> courseVector = TextProcessor.getWordFrequency(course.title);
			Double scoresForCourse = SimilarityCalculator.calculateCosineSimilarity(userVector, courseVector);
			scoreList.put(course, scoresForCourse);
		}
		return scoreList;
	}

}