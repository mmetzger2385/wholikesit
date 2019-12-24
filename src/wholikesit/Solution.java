package wholikesit;

class Solution {
	public static String whoLikesIt(String... names) {

		String who = new String("no one likes this");

		if (names.length > 0) {
			who = who.replaceFirst("no one", names[0]);
		}

		if (names.length > 1) {
			who = who.replaceFirst(names[0], names[0] + " and " + names[1]).replaceFirst("likes", "like");
		}

		if (names.length > 2) {
			who = who.replaceFirst(" and", ",").replaceFirst(names[1], names[1] + " and " + names[2]);
		}

		if (names.length > 3) {
			who = who.replaceFirst(names[2], String.valueOf(names.length - 2) + " others");
		}

		System.out.println(who);

		return who;
	}

}
