package hu.bme.mit.massif.models.simulink.viewer.util;

import hu.bme.mit.massif.models.simulink.viewer.PortBlockMatch;
import hu.bme.mit.massif.simulink.PortBlock;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.massif.models.simulink.viewer.portBlock pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class PortBlockProcessor implements IMatchProcessor<PortBlockMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pBl the value of pattern parameter bl in the currently processed match
   * 
   */
  public abstract void process(final PortBlock pBl);
  
  @Override
  public void process(final PortBlockMatch match) {
    process(match.getBl());
    
  }
}