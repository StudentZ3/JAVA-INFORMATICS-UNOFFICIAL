package abc;
public class TestStackOfChars {
	public boolean checkClosing(String s) {
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("");
		String s2 = new String("[][]");
		String s3 = new String("({{[]([])}}())[[{}]]");
		String s4 = new String("({");
		String s5 = new String(")(");
		String s6 = new String("([}}");
		String s7 = new String("({)}");
		String s8 = new String("(){}[()]]");
		StackOfChars stack1 = new StackOfChars();
	}
}
