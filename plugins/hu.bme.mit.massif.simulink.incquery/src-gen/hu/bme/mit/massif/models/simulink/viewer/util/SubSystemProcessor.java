package hu.bme.mit.massif.models.simulink.viewer.util;

import hu.bme.mit.massif.models.simulink.viewer.SubSystemMatch;
import hu.bme.mit.massif.simulink.SubSystem;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.massif.models.simulink.viewer.subSystem pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class SubSystemProcessor implements IMatchProcessor<SubSystemMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pSubS the value of pattern parameter subS in the currently processed match
   * 
   */
  public abstract void process(final SubSystem pSubS);
  
  @Override
  public void process(final SubSystemMatch match) {
    process(match.getSubS());
    
  }
}