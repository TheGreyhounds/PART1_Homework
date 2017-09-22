public class string
{
  public static void main(String[] args)
  {
    String bobbyB_1 = "A DOTHRAKI HORDE NED!";
    String bobbyB_2 = "ON AN OPEN FIELD!";
    String fullBobbyB = bobbyB_1.concat(bobbyB_2);
    String bobbyB_3 = "GODS".concat(" I WAS STRONG THEN!");
    System.out.println(fullBobbyB + '\n' + bobbyB_3);

    String shout = "JAVA COLLECTS GARBAGE.";
    String whisper = shout.toLowerCase();
    System.out.println(shout);
    System.out.println(whisper);

    //reusing variables like a champ

    whisper = "hunter2";
    shout = whisper.toUpperCase();
    System.out.println(whisper);
    System.out.println(shout);

    int i = 21;
    String iString = String.valueOf(i);
    System.out.println(i + "==" + iString);

    String whitespace = "   ";
    String text = "Now let's see if you remember how to concat strings.";
    System.out.println(text);
    // Take a hard look at this line. What do our Strings look like as
    // Java goes down the line and executes the concat() function?
    String combinedText = whitespace.concat(text).concat(whitespace);

    System.out.println(combinedText);

    String originalText = combinedText.trim();

    System.out.println(originalText);

    int lengthOfText = originalText.length();
    // A new type of variable appeared, boolean added to the Pokedex.
    boolean variableEquality = text.equals(originalText);

    // Also, take notice that I've stretched this statement over two lines
    System.out.println("The original text, " + lengthOfText + " characters long, " +
                       "is the same length as our trimmed text: " + variableEquality);

    /**************************************************************************
    *                                                                         *
    * Reflection: So what you're saying is spaces in front of and behind      *
    *             strings dont count toward the total length of the string?   *
    *                                                                         *
    *                                                                         *
    **************************************************************************/

  }
}
