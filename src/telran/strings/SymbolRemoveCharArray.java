package telran.strings;

public class SymbolRemoveCharArray implements SymbolsRemove {

	@Override
	public String removeSymbol(String str, char symbol) {
		return str.replace(String.valueOf(symbol), "");
	}

}
