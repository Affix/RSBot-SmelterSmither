package me.affix.smeltersmither;

import org.powerbot.script.PollingScript;
import org.powerbot.script.Script;
import org.powerbot.script.rt6.ClientContext;

import me.affix.metals.*;
import me.affix.utils.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Script.Manifest(name="SmelterSmither", description="Smelts and Smiths Items at Lumbridge!")

public class SmelterSmither extends PollingScript<ClientContext>  {

  private List<Task> taskList = new ArrayList<Task>();
  public boolean isConfigured = false;

  @Override
  public void start() {
    taskList.addAll(Arrays.asList(new BankOpener(ctx),
                                  new ItemDepositor(ctx)));

    GenericMetal metal = new GenericMetal();
  }

  @Override
  public void poll() {
    for (Task task: taskList)
    {
      if(task.activate())
      {
        task.execute();
      }
    }
  }

}
