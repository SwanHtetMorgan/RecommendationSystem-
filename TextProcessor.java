package dev.swanhtetaungphyo;

import org.apache.lucene.analysis.TokenStream;
import org.apache.lucene.analysis.en.EnglishAnalyzer;
import org.apache.lucene.analysis.tokenattributes.CharTermAttribute;

import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

public class TextProcessor {

	public static Map<CharSequence, Integer> getWordFrequency(CharSequence inputText) {

		Map<CharSequence, Integer> wordFrequency = new HashMap<>();

		try (EnglishAnalyzer analyzer = new EnglishAnalyzer();
			 TokenStream tokenStream = analyzer.tokenStream(null, new StringReader(inputText.toString()))) {

			tokenStream.reset();
			CharTermAttribute charTermAttribute = tokenStream.addAttribute(CharTermAttribute.class);

			while (tokenStream.incrementToken()) {
				CharSequence word = charTermAttribute.toString();
				wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
			}

			tokenStream.end();
		} catch (IOException e) {
			System.err.println("Error processing text: " + e.getMessage());
		}

		return wordFrequency;
	}

}