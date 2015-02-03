package me.affix.metals;

public class Bronze extends GenericMetal
{

  /*
   * Required Ore IDs and Count for max
   * {id, req}
   * e.g Copper {436, 14}
   */
  public int[][] ore_ids = {{436, 14},{438, 14}}; /* Using 14 Means we are making 14 Bronze Bars*/
  /*
  * Copper Ore : 436
  * Tin Ore    : 438
   */

  public Bronze()
  {
    System.out.println("[LOAD] GenericMetal : Bronze Loaded!");
  }
}
