package allFilesFromRevision;

public class ASCIISymbolsDisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for (int i = 33; i <= 126; i++) {
        	System.out.print((char)i);
        	if(i != 33 && (i-33) % 10 == 0) {
        		System.out.println();
        	}
        }
	}

}
