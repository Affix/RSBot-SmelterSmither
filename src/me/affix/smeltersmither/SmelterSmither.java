package me.affix.smeltersmither;

import org.powerbot.script.PollingScript;
import org.powerbot.script.Script;
import org.powerbot.script.rt6.ClientContext;

import me.affix.metals.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Script.Manifest(name="SmelterSmither", description="Smelts and Smiths Items at Lumbridge!")

public class SmelterSmither extends PollingScript<ClientContext>  {

  private List<Task> taskList = new ArrayList<Task>();
  public boolean isConfigured = false;

  @Override
  public void start() {
    /* Implement Tast List */
    GenericMetal metal = new GenericMetal();
    metal.about();
    metal.bronze();
    metal.iron();
    metal.steel();
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
