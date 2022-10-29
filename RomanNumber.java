package algorithm;

public class RomanNumber {
		private static int getRomanValue(char ch) {
			switch (ch) {
				case 'I':
					return 1;
				case 'V':
					return 5;
				case 'X':
					return 10;
				case 'L':
					return 50;
				case 'C':
					return 100;
				case 'D':
					return 500;
				case 'M':
					return 1000;
				default:
					return 0;
			}
		}

		public int romanToInt(String romanString) {
			if (romanString.isEmpty()) {
				return 0;
			}
			
			romanString += "O";
			int number = 0;
			char[] rome = romanString.toCharArray();
			
			for (int i = 0; i < rome.length; i++) {
				if (rome[i] == 'O') {
					break;
				}
				
				int a = getRomanValue(rome[i]);
				int b = getRomanValue(rome[i + 1]);
				
				if (a < b) {
					number += b - a;
					i++;
				} else {
					number += a;
				}
			}
			return number;
		}
}

