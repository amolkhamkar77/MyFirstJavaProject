package pract1;

import multipleInheritance.Lemon;

public class Lemona implements Int1, Int2, Int3 {

			public static void main(String[] args) {
				Lemona l = new Lemona();
				l.water();
				l.sugar();
				l.salt();
				
				
				
				
				
				
		
	}

			@Override
			public void water() {
				System.out.println("take water");
				System.out.println("take cold water");
			}

			@Override
			public void sugar() {
				System.out.println("take salt");
			}

			@Override
			public void salt() {
				System.out.println("take sugar");
			}

}
