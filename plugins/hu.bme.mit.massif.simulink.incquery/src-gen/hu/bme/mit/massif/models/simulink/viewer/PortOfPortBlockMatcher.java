package hu.bme.mit.massif.models.simulink.viewer;

import hu.bme.mit.massif.models.simulink.viewer.PortOfPortBlockMatch;
import hu.bme.mit.massif.models.simulink.viewer.util.PortOfPortBlockQuerySpecification;
import hu.bme.mit.massif.simulink.Port;
import hu.bme.mit.massif.simulink.PortBlock;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.incquery.runtime.api.IQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseMatcher;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.tuple.Tuple;
import org.eclipse.incquery.runtime.rete.misc.DeltaMonitor;
import org.eclipse.incquery.runtime.util.IncQueryLoggingUtil;

/**
 * Generated pattern matcher API of the hu.bme.mit.massif.models.simulink.viewer.portOfPortBlock pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link PortOfPortBlockMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern portOfPortBlock(port, portBlock) {
 * 	Port.portBlock(port, portBlock);
 * }
 * </pre></code>
 * 
 * @see PortOfPortBlockMatch
 * @see PortOfPortBlockProcessor
 * @see PortOfPortBlockQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class PortOfPortBlockMatcher extends BaseMatcher<PortOfPortBlockMatch> {
  /**
   * @return the singleton instance of the query specification of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IQuerySpecification<PortOfPortBlockMatcher> querySpecification() throws IncQueryException {
    return PortOfPortBlockQuerySpecification.instance();
  }
  
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static PortOfPortBlockMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    PortOfPortBlockMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new PortOfPortBlockMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_PORT = 0;
  
  private final static int POSITION_PORTBLOCK = 1;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(PortOfPortBlockMatcher.class);
  
  /**
   * Initializes the pattern matcher over a given EMF model root (recommended: Resource or ResourceSet).
   * If a pattern matcher is already constructed with the same root, only a light-weight reference is returned.
   * The scope of pattern matching will be the given EMF model root and below (see FAQ for more precise definition).
   * The match set will be incrementally refreshed upon updates from this scope.
   * <p>The matcher will be created within the managed {@link IncQueryEngine} belonging to the EMF model root, so
   * multiple matchers will reuse the same engine and benefit from increased performance and reduced memory footprint.
   * @param emfRoot the root of the EMF containment hierarchy where the pattern matcher will operate. Recommended: Resource or ResourceSet.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * @deprecated use {@link #on(IncQueryEngine)} instead, e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}
   * 
   */
  @Deprecated
  public PortOfPortBlockMatcher(final Notifier emfRoot) throws IncQueryException {
    this(IncQueryEngine.on(emfRoot));
  }
  
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * @deprecated use {@link #on(IncQueryEngine)} instead
   * 
   */
  @Deprecated
  public PortOfPortBlockMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pPort the fixed value of pattern parameter port, or null if not bound.
   * @param pPortBlock the fixed value of pattern parameter portBlock, or null if not bound.
   * @return matches represented as a PortOfPortBlockMatch object.
   * 
   */
  public Collection<PortOfPortBlockMatch> getAllMatches(final Port pPort, final PortBlock pPortBlock) {
    return rawGetAllMatches(new Object[]{pPort, pPortBlock});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pPort the fixed value of pattern parameter port, or null if not bound.
   * @param pPortBlock the fixed value of pattern parameter portBlock, or null if not bound.
   * @return a match represented as a PortOfPortBlockMatch object, or null if no match is found.
   * 
   */
  public PortOfPortBlockMatch getOneArbitraryMatch(final Port pPort, final PortBlock pPortBlock) {
    return rawGetOneArbitraryMatch(new Object[]{pPort, pPortBlock});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pPort the fixed value of pattern parameter port, or null if not bound.
   * @param pPortBlock the fixed value of pattern parameter portBlock, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Port pPort, final PortBlock pPortBlock) {
    return rawHasMatch(new Object[]{pPort, pPortBlock});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pPort the fixed value of pattern parameter port, or null if not bound.
   * @param pPortBlock the fixed value of pattern parameter portBlock, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Port pPort, final PortBlock pPortBlock) {
    return rawCountMatches(new Object[]{pPort, pPortBlock});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pPort the fixed value of pattern parameter port, or null if not bound.
   * @param pPortBlock the fixed value of pattern parameter portBlock, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Port pPort, final PortBlock pPortBlock, final IMatchProcessor<? super PortOfPortBlockMatch> processor) {
    rawForEachMatch(new Object[]{pPort, pPortBlock}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pPort the fixed value of pattern parameter port, or null if not bound.
   * @param pPortBlock the fixed value of pattern parameter portBlock, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Port pPort, final PortBlock pPortBlock, final IMatchProcessor<? super PortOfPortBlockMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pPort, pPortBlock}, processor);
  }
  
  /**
   * Registers a new filtered delta monitor on this pattern matcher.
   * The DeltaMonitor can be used to track changes (delta) in the set of filtered pattern matches from now on, considering those matches only that conform to the given fixed values of some parameters.
   * It can also be reset to track changes from a later point in time,
   * and changes can even be acknowledged on an individual basis.
   * See {@link DeltaMonitor} for details.
   * @param fillAtStart if true, all current matches are reported as new match events; if false, the delta monitor starts empty.
   * @param pPort the fixed value of pattern parameter port, or null if not bound.
   * @param pPortBlock the fixed value of pattern parameter portBlock, or null if not bound.
   * @return the delta monitor.
   * @deprecated use the IncQuery Databinding API (IncQueryObservables) instead.
   * 
   */
  @Deprecated
  public DeltaMonitor<PortOfPortBlockMatch> newFilteredDeltaMonitor(final boolean fillAtStart, final Port pPort, final PortBlock pPortBlock) {
    return rawNewFilteredDeltaMonitor(fillAtStart, new Object[]{pPort, pPortBlock});
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pPort the fixed value of pattern parameter port, or null if not bound.
   * @param pPortBlock the fixed value of pattern parameter portBlock, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public PortOfPortBlockMatch newMatch(final Port pPort, final PortBlock pPortBlock) {
    return PortOfPortBlockMatch.newMatch(pPort, pPortBlock);
    
  }
  
  /**
   * Retrieve the set of values that occur in matches for port.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Port> rawAccumulateAllValuesOfport(final Object[] parameters) {
    Set<Port> results = new HashSet<Port>();
    rawAccumulateAllValues(POSITION_PORT, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for port.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Port> getAllValuesOfport() {
    return rawAccumulateAllValuesOfport(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for port.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Port> getAllValuesOfport(final PortOfPortBlockMatch partialMatch) {
    return rawAccumulateAllValuesOfport(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for port.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Port> getAllValuesOfport(final PortBlock pPortBlock) {
    return rawAccumulateAllValuesOfport(new Object[]{null, pPortBlock});
  }
  
  /**
   * Retrieve the set of values that occur in matches for portBlock.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<PortBlock> rawAccumulateAllValuesOfportBlock(final Object[] parameters) {
    Set<PortBlock> results = new HashSet<PortBlock>();
    rawAccumulateAllValues(POSITION_PORTBLOCK, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for portBlock.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<PortBlock> getAllValuesOfportBlock() {
    return rawAccumulateAllValuesOfportBlock(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for portBlock.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<PortBlock> getAllValuesOfportBlock(final PortOfPortBlockMatch partialMatch) {
    return rawAccumulateAllValuesOfportBlock(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for portBlock.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<PortBlock> getAllValuesOfportBlock(final Port pPort) {
    return rawAccumulateAllValuesOfportBlock(new Object[]{pPort, null});
  }
  
  @Override
  protected PortOfPortBlockMatch tupleToMatch(final Tuple t) {
    try {
      return PortOfPortBlockMatch.newMatch((hu.bme.mit.massif.simulink.Port) t.get(POSITION_PORT), (hu.bme.mit.massif.simulink.PortBlock) t.get(POSITION_PORTBLOCK));
    } catch(ClassCastException e) {
      LOGGER.error("Element(s) in tuple not properly typed!",e);
      return null;
    }
    
  }
  
  @Override
  protected PortOfPortBlockMatch arrayToMatch(final Object[] match) {
    try {
      return PortOfPortBlockMatch.newMatch((hu.bme.mit.massif.simulink.Port) match[POSITION_PORT], (hu.bme.mit.massif.simulink.PortBlock) match[POSITION_PORTBLOCK]);
    } catch(ClassCastException e) {
      LOGGER.error("Element(s) in array not properly typed!",e);
      return null;
    }
    
  }
  
  @Override
  protected PortOfPortBlockMatch arrayToMatchMutable(final Object[] match) {
    try {
      return PortOfPortBlockMatch.newMutableMatch((hu.bme.mit.massif.simulink.Port) match[POSITION_PORT], (hu.bme.mit.massif.simulink.PortBlock) match[POSITION_PORTBLOCK]);
    } catch(ClassCastException e) {
      LOGGER.error("Element(s) in array not properly typed!",e);
      return null;
    }
    
  }
}