package readstrings;
// test github
/*Contents:
- String method: using .equals(), .indexOf(), .substring(a,b), toLowerCase(), .length();
- Notes about .indexOf() and .substring():
  For these examples, assume the variable s has the value "Colorful"
  s.indexOf("l") is 2
  s.indexOf("ful") is 5
  s.indexOf("l", 3) is 7
  s.indexOf("o", 1) is 1
  s.substring(1) is "olorful"
  s.substring(5) is "ful"
  s.substring(1, 2) is "o"
  s.substring(1, 4) is "olo"
- Other String methods that can be used: .toUpperCase(), .startsWith(), .endsWith().
- Note: In order to be able to access class findProtein, both classes are declared "static".
- Remainder (%) operator: 5 % 3 is 2
*/
public class TagFinder {
/*
 * En este programa se usa el method indexOf para ubicar un string 
 * particular en la cadena de datos
 */
	public static void main(String[] args) {
		//
		String a = "cccAtgccctaGccc";
		// resultado debe ser "atgccctag length 9";
		//
		String result = findProtein(a);
		if (result.equals("notfound")) {
			System.out.println("not a protein");
		}
		else {
			System.out.println("success for " + result + " length " + result.length());
			
		}
	}
	public static String findProtein(String dna) {
		//
		String dna2 = dna.toLowerCase();
		//
		int start = dna2.indexOf("atg");
		System.out.println("ATG starts: " + start);
		if (start == -1) {
			return "notfound";
		}
		int stop = dna2.indexOf("tag", start+3);
		System.out.println("TAG stops: " + stop);
		if ((stop - start) % 3 == 0) {
			return dna2.substring(start, stop+3);
		}
		else {
			return "notfound";
		}
	}
}
