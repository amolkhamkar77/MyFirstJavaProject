package PracticePrograms;

public class StringPractice1 {

	public static void main(String[] args) {

		String s1 = "Amol Khamkar";
		String s2 = "AMOL KHAMKAR";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.length());
		System.out.println(s1.lastIndexOf(s2));
		System.out.println(s1.concat(s2));
		System.out.println(s1.substring(2));
		System.out.println(s1.substring(2, 7));
		System.out.println(s1.isEmpty());
		System.out.println(s1.replace("Amol", "Ak"));
		
	}

}
