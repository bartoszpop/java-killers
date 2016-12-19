package com.gmail.at.bartoszpop.javakillers.text;

import java.text.MessageFormat;

/**
 * As stated in the {@link MessageFormat} documentation comment: 
 * <br>
 * <cite>Within a String, '' (two single quotes ) represents a single quote. A
 * QuotedString can contain arbitrary characters except single quotes; the
 * surrounding single quotes are removed. An UnquotedString can contain
 * arbitrary characters except single quotes and left curly brackets. Thus, a
 * string that should result in the formatted message '{0}' can be written as
 * '''{'0}'' or '''{0}'''.</cite>
 */
public class MessageFormatWithApostrophe {
	private static final MessageFormat CORRECT = new MessageFormat("Can''t {0}");

	private static final MessageFormat INCORRECT = new MessageFormat("Can't {0}");

	public static void main(String[] args) {
		System.out.println(CORRECT.format(new String[] { "do" })); // Can't do
		System.out.println(INCORRECT.format(new String[] { "do" })); // Cant {0}
	}
}