package me.affix.utils;

import org.powerbot.script.Area;
import org.powerbot.script.Condition;
import org.powerbot.script.Tile;
import org.powerbot.script.rt6.ClientContext;

import java.util.concurrent.Callable;

public class ItemDepositor extends Task<ClientContext> {

  public ItemDepositor(ClientContext ctx){
    super(ctx);
  }

  @Override
  public boolean activate(){
    return ctx.backpack.select().count()==28
        &&ctx.bank.opened()==true;

  }

  @Override
  public void execute(){

    Condition.wait(new Callable<Boolean>() {
      @Override
      public Boolean call() throws Exception {
        return ctx.bank.depositInventory();
      }
    });
    ctx.backpack.select();

  }
}