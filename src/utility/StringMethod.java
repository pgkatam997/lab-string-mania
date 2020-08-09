package utility;

// Type your code
public class StringMethod{
	public String upper(String input) {
		return input.toUpperCase();
	}

	public String firstCharacter(String input) {
		// TODO Auto-generated method stub
		return input.substring(0,0+1);
	}

	public String length(String input) {
		// TODO Auto-generated method stub
		int length =input.length();
		String le=Integer.toString(length);
		return le;
	}

	public String trim(String input) {
		return input.trim();
		// TODO Auto-generated method stub	
	}

	public String lower(String input) {
		return input.toLowerCase();
		// TODO Auto-generated method stub
		
	}

	public String setInput(String input) {
		return input;
		// TODO Auto-generated method stub
		
	}

	public Object getInput() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
