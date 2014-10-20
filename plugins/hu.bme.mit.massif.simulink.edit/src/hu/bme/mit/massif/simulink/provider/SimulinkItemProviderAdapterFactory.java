/*******************************************************************************
 * Copyright (c) 2010-2013, Embraer S.A., Budapest University of Technology and Economics
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html 
 *
 * Contributors: 
 *     Abel Hegedus, Akos Horvath - initial API and implementation 
 *******************************************************************************/
/**
 */
package hu.bme.mit.massif.simulink.provider;

import hu.bme.mit.massif.simulink.util.SimulinkAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SimulinkItemProviderAdapterFactory extends SimulinkAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimulinkItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link hu.bme.mit.massif.simulink.Block} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BlockItemProvider blockItemProvider;

	/**
	 * This creates an adapter for a {@link hu.bme.mit.massif.simulink.Block}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBlockAdapter() {
		if (blockItemProvider == null) {
			blockItemProvider = new BlockItemProvider(this);
		}

		return blockItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link hu.bme.mit.massif.simulink.Property} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyItemProvider propertyItemProvider;

	/**
	 * This creates an adapter for a {@link hu.bme.mit.massif.simulink.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPropertyAdapter() {
		if (propertyItemProvider == null) {
			propertyItemProvider = new PropertyItemProvider(this);
		}

		return propertyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link hu.bme.mit.massif.simulink.InPort} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InPortItemProvider inPortItemProvider;

	/**
	 * This creates an adapter for a {@link hu.bme.mit.massif.simulink.InPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInPortAdapter() {
		if (inPortItemProvider == null) {
			inPortItemProvider = new InPortItemProvider(this);
		}

		return inPortItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link hu.bme.mit.massif.simulink.OutPort} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutPortItemProvider outPortItemProvider;

	/**
	 * This creates an adapter for a {@link hu.bme.mit.massif.simulink.OutPort}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOutPortAdapter() {
		if (outPortItemProvider == null) {
			outPortItemProvider = new OutPortItemProvider(this);
		}

		return outPortItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link hu.bme.mit.massif.simulink.Trigger} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TriggerItemProvider triggerItemProvider;

	/**
	 * This creates an adapter for a {@link hu.bme.mit.massif.simulink.Trigger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTriggerAdapter() {
		if (triggerItemProvider == null) {
			triggerItemProvider = new TriggerItemProvider(this);
		}

		return triggerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link hu.bme.mit.massif.simulink.Enable} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnableItemProvider enableItemProvider;

	/**
	 * This creates an adapter for a {@link hu.bme.mit.massif.simulink.Enable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEnableAdapter() {
		if (enableItemProvider == null) {
			enableItemProvider = new EnableItemProvider(this);
		}

		return enableItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link hu.bme.mit.massif.simulink.BusSelector} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusSelectorItemProvider busSelectorItemProvider;

	/**
	 * This creates an adapter for a {@link hu.bme.mit.massif.simulink.BusSelector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBusSelectorAdapter() {
		if (busSelectorItemProvider == null) {
			busSelectorItemProvider = new BusSelectorItemProvider(this);
		}

		return busSelectorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link hu.bme.mit.massif.simulink.BusCreator} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusCreatorItemProvider busCreatorItemProvider;

	/**
	 * This creates an adapter for a {@link hu.bme.mit.massif.simulink.BusCreator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBusCreatorAdapter() {
		if (busCreatorItemProvider == null) {
			busCreatorItemProvider = new BusCreatorItemProvider(this);
		}

		return busCreatorItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link hu.bme.mit.massif.simulink.Goto} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GotoItemProvider gotoItemProvider;

	/**
	 * This creates an adapter for a {@link hu.bme.mit.massif.simulink.Goto}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGotoAdapter() {
		if (gotoItemProvider == null) {
			gotoItemProvider = new GotoItemProvider(this);
		}

		return gotoItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link hu.bme.mit.massif.simulink.From} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FromItemProvider fromItemProvider;

	/**
	 * This creates an adapter for a {@link hu.bme.mit.massif.simulink.From}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFromAdapter() {
		if (fromItemProvider == null) {
			fromItemProvider = new FromItemProvider(this);
		}

		return fromItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link hu.bme.mit.massif.simulink.SimulinkModel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimulinkModelItemProvider simulinkModelItemProvider;

	/**
	 * This creates an adapter for a {@link hu.bme.mit.massif.simulink.SimulinkModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSimulinkModelAdapter() {
		if (simulinkModelItemProvider == null) {
			simulinkModelItemProvider = new SimulinkModelItemProvider(this);
		}

		return simulinkModelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link hu.bme.mit.massif.simulink.MultiConnection} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiConnectionItemProvider multiConnectionItemProvider;

	/**
	 * This creates an adapter for a {@link hu.bme.mit.massif.simulink.MultiConnection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMultiConnectionAdapter() {
		if (multiConnectionItemProvider == null) {
			multiConnectionItemProvider = new MultiConnectionItemProvider(this);
		}

		return multiConnectionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link hu.bme.mit.massif.simulink.SingleConnection} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SingleConnectionItemProvider singleConnectionItemProvider;

	/**
	 * This creates an adapter for a {@link hu.bme.mit.massif.simulink.SingleConnection}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSingleConnectionAdapter() {
		if (singleConnectionItemProvider == null) {
			singleConnectionItemProvider = new SingleConnectionItemProvider(this);
		}

		return singleConnectionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link hu.bme.mit.massif.simulink.OutPortBlock} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutPortBlockItemProvider outPortBlockItemProvider;

	/**
	 * This creates an adapter for a {@link hu.bme.mit.massif.simulink.OutPortBlock}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOutPortBlockAdapter() {
		if (outPortBlockItemProvider == null) {
			outPortBlockItemProvider = new OutPortBlockItemProvider(this);
		}

		return outPortBlockItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link hu.bme.mit.massif.simulink.InPortBlock} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InPortBlockItemProvider inPortBlockItemProvider;

	/**
	 * This creates an adapter for a {@link hu.bme.mit.massif.simulink.InPortBlock}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInPortBlockAdapter() {
		if (inPortBlockItemProvider == null) {
			inPortBlockItemProvider = new InPortBlockItemProvider(this);
		}

		return inPortBlockItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link hu.bme.mit.massif.simulink.TriggerBlock} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TriggerBlockItemProvider triggerBlockItemProvider;

	/**
	 * This creates an adapter for a {@link hu.bme.mit.massif.simulink.TriggerBlock}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTriggerBlockAdapter() {
		if (triggerBlockItemProvider == null) {
			triggerBlockItemProvider = new TriggerBlockItemProvider(this);
		}

		return triggerBlockItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link hu.bme.mit.massif.simulink.EnableBlock} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnableBlockItemProvider enableBlockItemProvider;

	/**
	 * This creates an adapter for a {@link hu.bme.mit.massif.simulink.EnableBlock}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEnableBlockAdapter() {
		if (enableBlockItemProvider == null) {
			enableBlockItemProvider = new EnableBlockItemProvider(this);
		}

		return enableBlockItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link hu.bme.mit.massif.simulink.GotoTagVisibility} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GotoTagVisibilityItemProvider gotoTagVisibilityItemProvider;

	/**
	 * This creates an adapter for a {@link hu.bme.mit.massif.simulink.GotoTagVisibility}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGotoTagVisibilityAdapter() {
		if (gotoTagVisibilityItemProvider == null) {
			gotoTagVisibilityItemProvider = new GotoTagVisibilityItemProvider(this);
		}

		return gotoTagVisibilityItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link hu.bme.mit.massif.simulink.SubSystem} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubSystemItemProvider subSystemItemProvider;

	/**
	 * This creates an adapter for a {@link hu.bme.mit.massif.simulink.SubSystem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSubSystemAdapter() {
		if (subSystemItemProvider == null) {
			subSystemItemProvider = new SubSystemItemProvider(this);
		}

		return subSystemItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link hu.bme.mit.massif.simulink.ModelReference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelReferenceItemProvider modelReferenceItemProvider;

	/**
	 * This creates an adapter for a {@link hu.bme.mit.massif.simulink.ModelReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModelReferenceAdapter() {
		if (modelReferenceItemProvider == null) {
			modelReferenceItemProvider = new ModelReferenceItemProvider(this);
		}

		return modelReferenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link hu.bme.mit.massif.simulink.BusSignalMapping} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusSignalMappingItemProvider busSignalMappingItemProvider;

	/**
	 * This creates an adapter for a {@link hu.bme.mit.massif.simulink.BusSignalMapping}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBusSignalMappingAdapter() {
		if (busSignalMappingItemProvider == null) {
			busSignalMappingItemProvider = new BusSignalMappingItemProvider(this);
		}

		return busSignalMappingItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link hu.bme.mit.massif.simulink.LibraryLinkReference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LibraryLinkReferenceItemProvider libraryLinkReferenceItemProvider;

	/**
	 * This creates an adapter for a {@link hu.bme.mit.massif.simulink.LibraryLinkReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLibraryLinkReferenceAdapter() {
		if (libraryLinkReferenceItemProvider == null) {
			libraryLinkReferenceItemProvider = new LibraryLinkReferenceItemProvider(this);
		}

		return libraryLinkReferenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link hu.bme.mit.massif.simulink.IdentifierReference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IdentifierReferenceItemProvider identifierReferenceItemProvider;

	/**
	 * This creates an adapter for a {@link hu.bme.mit.massif.simulink.IdentifierReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIdentifierReferenceAdapter() {
		if (identifierReferenceItemProvider == null) {
			identifierReferenceItemProvider = new IdentifierReferenceItemProvider(this);
		}

		return identifierReferenceItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (blockItemProvider != null) blockItemProvider.dispose();
		if (propertyItemProvider != null) propertyItemProvider.dispose();
		if (inPortItemProvider != null) inPortItemProvider.dispose();
		if (outPortItemProvider != null) outPortItemProvider.dispose();
		if (triggerItemProvider != null) triggerItemProvider.dispose();
		if (enableItemProvider != null) enableItemProvider.dispose();
		if (busSelectorItemProvider != null) busSelectorItemProvider.dispose();
		if (busCreatorItemProvider != null) busCreatorItemProvider.dispose();
		if (gotoItemProvider != null) gotoItemProvider.dispose();
		if (fromItemProvider != null) fromItemProvider.dispose();
		if (simulinkModelItemProvider != null) simulinkModelItemProvider.dispose();
		if (multiConnectionItemProvider != null) multiConnectionItemProvider.dispose();
		if (singleConnectionItemProvider != null) singleConnectionItemProvider.dispose();
		if (outPortBlockItemProvider != null) outPortBlockItemProvider.dispose();
		if (inPortBlockItemProvider != null) inPortBlockItemProvider.dispose();
		if (triggerBlockItemProvider != null) triggerBlockItemProvider.dispose();
		if (enableBlockItemProvider != null) enableBlockItemProvider.dispose();
		if (gotoTagVisibilityItemProvider != null) gotoTagVisibilityItemProvider.dispose();
		if (subSystemItemProvider != null) subSystemItemProvider.dispose();
		if (modelReferenceItemProvider != null) modelReferenceItemProvider.dispose();
		if (busSignalMappingItemProvider != null) busSignalMappingItemProvider.dispose();
		if (libraryLinkReferenceItemProvider != null) libraryLinkReferenceItemProvider.dispose();
		if (identifierReferenceItemProvider != null) identifierReferenceItemProvider.dispose();
	}

}
