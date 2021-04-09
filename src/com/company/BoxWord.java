//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Alan Zamora

import static java.lang.System.*;

class BoxWord
{
   private String word;

	public BoxWord()
	{
		word="";
	}

	public BoxWord(String s)
	{
	word = s;

	}

	public void setWord(String w)
	{
	word = w;

	}

	public String toString()
	{
		String output="";

		output = output + word;

		int count = word.length()-1;

		for(int i = 1; i<word.length()-1; i++){

			output = output + "\n"+word.charAt(i) ;

			count--;

			for(int j = 0; j<word.length()-2; j++){
				output = output + " ";
			}

			output= output + word.charAt(count);

		}
		StringBuffer sb = new StringBuffer(word);

		output = output + "\n"+ sb.reverse();

		return output+"\n";
	}


}


