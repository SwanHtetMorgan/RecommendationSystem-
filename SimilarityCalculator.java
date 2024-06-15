package dev.swanhtetaungphyo;

import org.apache.commons.text.similarity.CosineSimilarity;

import java.util.Map;

public class SimilarityCalculator {

	public static double calculateCosineSimilarity(Map<CharSequence, Integer> vector1, Map<CharSequence, Integer> vector2) {
		CosineSimilarity cosineSimilarity = new CosineSimilarity();
		return cosineSimilarity.cosineSimilarity(vector1, vector2);
	}
}
