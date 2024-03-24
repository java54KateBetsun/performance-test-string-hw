package telran.performance.strings;

import java.util.Random;

import telran.strings.SymbolRemoveCharArray;
import telran.strings.SymbolsRemove;
import telran.strings.SymbolsRemoveStandard;

public class SymbolsRemovePerformanceAppl {
	
	private static final int N_SYMBOLS = 1000;
	private static final int N_RUNS = 1000;
	
	public static void main(String[] args) {
		String str = getRandomString(N_SYMBOLS);
		char symbol = getRandomChar();
		SymbolRemovePerformanceTest testRemoveCharArray = getTest("test of SymbolRemoveCharArray", N_RUNS, str, symbol, new SymbolRemoveCharArray());
		SymbolRemovePerformanceTest testRemoveStandard = getTest("test of SymbolsRemoveStandard",N_RUNS, str, symbol, new SymbolsRemoveStandard());
		testRemoveCharArray.run();
		testRemoveStandard.run();

	}

	private static SymbolRemovePerformanceTest getTest(String displayName, int nRuns,
			String str, char symbol, SymbolsRemove symbolsRemove) {
		return new SymbolRemovePerformanceTest(displayName, nRuns, str, 
				symbol, symbolsRemove);
	}

	private static char getRandomChar() {
		Random random = new Random();
		char randomChar = (char) (random.nextInt(94) + 32);
		return randomChar;
	}
	
	
	private static String getRandomString(int length) {
		Random random = new Random();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            char randomChar = getRandomChar(); // Generate a random printable ASCII symbol
            sb.append(randomChar);
        }
        return sb.toString();
	}
}
