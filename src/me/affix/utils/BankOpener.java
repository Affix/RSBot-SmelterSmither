package me.affix.utils;

import org.powerbot.script.Area;
import org.powerbot.script.Condition;
import org.powerbot.script.Tile;
import org.powerbot.script.rt6.ClientContext;
import org.powerbot.script.rt6.GameObject;

import java.util.concurrent.Callable;

public class BankOpener extends Task<ClientContext> {

  int bankBoothID = 79036;

  public BankOpener(ClientContext ctx){
    super(ctx);
  }

  @Override
  public boolean activate(){

    return ctx.backpack.select().count()==28
        && !ctx.objects.select().id(bankBoothID).isEmpty()
        && ctx.bank.opened()==false;

  }

  @Override
  public void execute(){
    final GameObject bankBooth = ctx.objects.select().id(bankBoothID).nearest().poll();

    if(bankBooth.inViewport())
    {
      Condition.wait(new Callable<Boolean>() {
        @Override
        public Boolean call() throws Exception {
          return bankBooth.interact("Bank");
        }
      });

    } else {
      ctx.movement.step(bankBooth);
      ctx.camera.turnTo(bankBooth);
    }
  }
}