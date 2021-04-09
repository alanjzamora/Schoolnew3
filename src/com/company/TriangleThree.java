//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Alan Zamora

import static java.lang.System.*;

public class TriangleThree {
	private int size;
	private String letter;

	public TriangleThree() {
	}

	public TriangleThree(int count, String let) {
		letter = let;
		size = count;

	}

	public void setTriangle(String let, int sz) {
		letter = let;
		size = sz;

	}

	public String getLetter() {
		return letter;
	}

	public String toString()  {
		String output = "";

		for (int i = 1; i <= size; i++) {
			for (int j = size - 1; j >= i; j--) {
				output = output + " ";
			}

			for (int k = i - 1; k >= 0; k--) {
				output = output + letter;
			}

			output = output + "\n";
		}

		return output + "\n";
	}
}


