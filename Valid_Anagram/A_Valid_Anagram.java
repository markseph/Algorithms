import java.util.HashMap;

// Given two strings s and t , write a function to determine if t is an anagram of s.

public class A_Valid_Anagram {
	public static void main(String[] args) {
		String s = "anagram";
		String t = "nagaram";
//		String s = "rat";
//		String t = "car";
//		String s = "ratp";
//		String t = "trap";
		
		boolean isAnagram = false;
		isAnagram = isAnagram(s, t);
		System.out.println(isAnagram);
	}
	
	//	time complexity: O(n)
	//	space complexity: O(1)
	public static boolean isAnagram(String s, String t) {
		boolean isAnagram = false;
		
		if(s.length() != t.length()) {
			isAnagram = false;
			return isAnagram;
		}
		
		int[] alphabet = new int[26];
		for(int i = 0; i < s.length(); i++) {
			alphabet[s.charAt(i) - 'a']++;
			alphabet[t.charAt(i) - 'a']--;
		}
		for(int count : alphabet) {
			if(count != 0) {
				isAnagram = false;
				return isAnagram;
			}
		}
		isAnagram = true;
		return isAnagram;
	}
	
//	//	time complexity: O(n)
//	//	space complexity: O(n)
//	public static boolean isAnagram(String s, String t) {
//		boolean isAnagram = false;
//		HashMap<Character, Integer> word1 = new HashMap<Character, Integer>();
//		HashMap<Character, Integer> word2 = new HashMap<Character, Integer>();
//		
//		if(s.length() != t.length()) {
//			isAnagram = false;
//			return isAnagram;
//		}
//		
//		for(int i = 0; i < s.length(); i++) {
//			if(word1.containsKey(s.charAt(i))) {
//				word1.replace(s.charAt(i), word1.get(s.charAt(i)) + 1);
//			}
//			else {
//				word1.put(s.charAt(i), 1);
//			}
//			if(word2.containsKey(t.charAt(i))) {
//				word2.replace(t.charAt(i), word2.get(t.charAt(i)) + 1);
//			}
//			else {
//				word2.put(t.charAt(i), 1);
//			}
//		}
//		
//		for(Character key : word1.keySet()) {
//			if(!(word1.get(key).equals(word2.get(key)))) {
//				isAnagram = false;
//				return isAnagram;
//			}
//		}
//		isAnagram = true;
//		return isAnagram;
//	}
}