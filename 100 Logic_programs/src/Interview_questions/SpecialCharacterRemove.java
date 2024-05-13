package Interview_questions;

public class SpecialCharacterRemove {

	public static void main(String[] args) {

		String name = "$dharani@gamil.# ";
		int count = 0;
		char specialCharacter = 0;
		String removeSpecialChar="";
		for (int i = 0; i < name.length(); i++) {
			if (!Character.isDigit(name.charAt(i)) && !Character.isLetter(name.charAt(i))
					&& !Character.isWhitespace(name.charAt(i))) {
				specialCharacter = name.charAt(i);
				System.out.println("specialCharacter...." + specialCharacter);
				count++;
			}else {
				removeSpecialChar=removeSpecialChar+name.charAt(i);
			}
		}
		if (count == 0) {
			System.out.println("there is no special character");
		} else {
			System.out.println("Special character count " + count);
		}
		//System.out.println("removeSpecialChar...{} "+removeSpecialChar);
	}

}
