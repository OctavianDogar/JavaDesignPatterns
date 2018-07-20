package interpreter;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InterpreterEverydayDemo {

	public static void main(String[] args) {
		String input = "Lions, and tigers, and bears! Oh, my!";

		Pattern p = Pattern.compile("(lion|cat|dog|wolf|bear|human|tiger|liger|Lion)");
		Matcher m = p.matcher(input);

		while (m.find()) {
			System.out.println("Found a " + m.group() + ".");
		}


		List<String> emails = Arrays.asList(
				"jimmy@gmail.com",
				"jimmy@gmailcom",
				"jimmygmail.com",
				"jimmy@gmail.",
				".com",
				"jimmygmailcom");

		String corrEmail = "jimmy@gmail.com";


		Pattern pattern = Pattern.compile("\\p{Alnum}{3,12}@([a-zA-Z]|\\d){3,8}\\.([a-zA-Z]|\\d){2,5}");

		for(String email: emails){

			Matcher matcher = pattern.matcher(email);
			while (matcher.find()) {
				System.out.println("Correct email: " + matcher.group() + ".");
			}

		}


	}
}
