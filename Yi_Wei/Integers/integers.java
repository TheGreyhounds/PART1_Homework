public class integers{
  public static void main(String[] args) {
    byte b_minimum = -128;
    byte b_maximum =  127;

    short s_minimum = -32768;
    short s_maximum =  32767;

    int i_minimum = -2147483648;
    int i_maximum =  2147483647;

    long l_minimum = -9_223_372_036_854_775_808L;
    long l_maximum =  9_223_372_036_854_775_807L;

    System.out.println( b_minimum +" "+ b_maximum + "\n");
    System.out.println( s_minimum +" "+ s_maximum + "\n");
    System.out.println( i_minimum +" "+ i_maximum + "\n");
    System.out.println( l_minimum +" "+ l_maximum + "\n");

    /**************************************************************************
    *                                                                         *
    * Reflection: What we did here is that we declared a bunch of variables   *
    *             we set them to their maximum and minimum values based on    *
    *             their keyword and after that we printed them out onto       *
    *             the screen.                                                 *
    *                                                                         *
    **************************************************************************/

  }
}
