//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Alan Zamora

import static java.lang.System.*;

public class TriangleFour {
	private int size;
	private String letter;

	public TriangleFour() {
	}

	public TriangleFour(int count, String let) {
		size = count;
		letter = let;

	}

	public void setTriangle(String let, int sz) {
		letter = let;
		size = sz;
	}

	public String getLetter() {
		return letter;
	}

	public String toString() {
		String output = "";
		for(int i = 1;i<=size;i++)
			for(int j = 1;j<i;j++)
				output = output + " ";
	//		for()

return "";
	}

}



