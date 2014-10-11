package hu.bme.mit.massif.models.simulink.derived.util;

import hu.bme.mit.massif.models.simulink.derived.ReferencedModelMatch;
import hu.bme.mit.massif.simulink.ModelReference;
import hu.bme.mit.massif.simulink.SimulinkModel;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.massif.models.simulink.derived.referencedModel pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class ReferencedModelProcessor implements IMatchProcessor<ReferencedModelMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pThis the value of pattern parameter This in the currently processed match
   * @param pTarget the value of pattern parameter Target in the currently processed match
   * 
   */
  public abstract void process(final ModelReference pThis, final SimulinkModel pTarget);
  
  @Override
  public void process(final ReferencedModelMatch match) {
    process(match.getThis(), match.getTarget());
    
  }
}