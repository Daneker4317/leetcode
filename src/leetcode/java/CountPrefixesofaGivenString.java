class CountPrefixesofaGivenString {
	public int countPrefixes(String[] words, String s) {
		byte c = 0;
		for (int i = 0; i < words.length; i++) {
			if (isPrefix(words[i], s)) {
				c++;
			}
		}
		return c;
	}

	private static boolean isPrefix(String s, String t) {
		if (t.length() < s.length()) {
			return false;
		}
		return t.substring(0, s.length()).equals(s);
	}
}