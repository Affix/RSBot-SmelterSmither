
package me.affix.metals;
import java.util.Arrays;

public class GenericMetal
{
  public static int anvil_id = 12692;
  public static int furnace_id = 4310;

  private String[] metals = new String[] {"Bronze", "Iron", "Steel"};

  public Bronze bronze() { return new Bronze(); }

  public Iron iron() { return new Iron(); }

  public void about()
  {
    System.out.println("--==    GenericMetals 0.1    ==--");
    System.out.println("An easily extendable Metals Framework");
    System.out.println("For PowerBot (RSBot)");
    System.out.println("Written by Affix (c) 2015");
  }

  /*
   * Method : platebody
   * Args : int count
   * Description :
   * Makes x number of platebody
   */
  public boolean platebody(int x)
  {
    int bars = 5;
    System.out.println("[GenericMetal] Platebody : Requires " + bars * x + " bars");
    return true;
  }

  /*
  * Method : platebody
  * Args : int count
  * Description :
  * Makes as many platebody as possible
 */
  public boolean platebody()
  {
    int bars = 5;
    System.out.println("[GenericMetal] Platebody : Making as many as possible");
    return true;
  }

}
