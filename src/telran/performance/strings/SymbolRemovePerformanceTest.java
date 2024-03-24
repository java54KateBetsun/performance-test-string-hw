package telran.performance.strings;

import telran.performance.PerformanceTest;
import telran.strings.SymbolsRemove;

public class SymbolRemovePerformanceTest extends PerformanceTest {
	 	String str;
	    char symbol;
	    SymbolsRemove symbolsRemove;
	protected SymbolRemovePerformanceTest(String displayName, int nRuns,
			String str, char symbol, SymbolsRemove symbolsRemove) {
		super(displayName, nRuns);
		this.str = str;
		this.symbol = symbol;
		this.symbolsRemove = symbolsRemove;
		
	}

	@Override
	protected void runTest() {
		symbolsRemove.removeSymbol(str, symbol);

	}

}
