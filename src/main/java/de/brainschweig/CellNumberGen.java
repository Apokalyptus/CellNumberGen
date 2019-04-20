package main.java.de.brainschweig;

public class CellNumberGen {

	public static void main(String[] args) {
		final int MAXCELLNOLENGTH = 12;
		int lenghOfPrefix = 0;
		int lengthOfNumberToCalc = 0;
		String numberFormatter = "%00d";
		String[] cellPrefixes = new String[] { "01511", "01512", "01514", "01515", "01516", "01517", "0160", "0170",
				"0171", "0175", "01520", "01522", "01523", "01525", "0162", "0172", "0173", "0174", "01570", "01573",
				"01575", "01577", "01578", "0163", "0177", "0178", "01590", "0176", "0179" };

		for (String cellPrefix : cellPrefixes) {
			lenghOfPrefix = cellPrefix.length();
			lengthOfNumberToCalc = MAXCELLNOLENGTH - lenghOfPrefix;
			long result = 1;
			for (int j = 0; j < lengthOfNumberToCalc; j++) {
				result = result * 10;
			}

			for (int i = 0; i < result - 1; i++) {
				numberFormatter = "%0" + Long.toString(lengthOfNumberToCalc) + "d";
				System.out.println(cellPrefix + String.format(numberFormatter, i));
			}

		}

	}

}
