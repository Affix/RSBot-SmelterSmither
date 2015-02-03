
package me.affix.metals;
import java.util.Arrays;

public class GenericMetal
{
  public int anvil_id = 12345;

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

}
