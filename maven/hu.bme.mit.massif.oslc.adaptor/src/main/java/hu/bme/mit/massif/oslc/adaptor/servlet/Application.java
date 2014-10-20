/*******************************************************************************
 * Copyright (c) 2012, 2014 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *
 *     Michael Fiedler     - initial API and implementation for Bugzilla adapter
 *     Jad El-khoury        - initial implementation of code generator (https://bugs.eclipse.org/bugs/show_bug.cgi?id=422448)
 *
 * This file is generated by org.eclipse.lyo.oslc4j.codegenerator
 *******************************************************************************/

package hu.bme.mit.massif.oslc.adaptor.servlet;

import hu.bme.mit.massif.oslc.adaptor.SimulinkAdaptorConstants;
import hu.bme.mit.massif.oslc.adaptor.resources.BlockResource;
import hu.bme.mit.massif.oslc.adaptor.resources.BusCreatorResource;
import hu.bme.mit.massif.oslc.adaptor.resources.BusSelectorResource;
import hu.bme.mit.massif.oslc.adaptor.resources.BusSpecificationResource;
import hu.bme.mit.massif.oslc.adaptor.resources.EnableBlockResource;
import hu.bme.mit.massif.oslc.adaptor.resources.EnableResource;
import hu.bme.mit.massif.oslc.adaptor.resources.FromResource;
import hu.bme.mit.massif.oslc.adaptor.resources.GotoResource;
import hu.bme.mit.massif.oslc.adaptor.resources.InPortBlockResource;
import hu.bme.mit.massif.oslc.adaptor.resources.InPortResource;
import hu.bme.mit.massif.oslc.adaptor.resources.OutPortBlockResource;
import hu.bme.mit.massif.oslc.adaptor.resources.OutPortResource;
import hu.bme.mit.massif.oslc.adaptor.resources.PortBlockResource;
import hu.bme.mit.massif.oslc.adaptor.resources.PortResource;
import hu.bme.mit.massif.oslc.adaptor.resources.SimulinkElementResource;
import hu.bme.mit.massif.oslc.adaptor.resources.SimulinkModelResource;
import hu.bme.mit.massif.oslc.adaptor.resources.SubSystemResource;
import hu.bme.mit.massif.oslc.adaptor.resources.TriggerBlockResource;
import hu.bme.mit.massif.oslc.adaptor.resources.TriggerResource;
import hu.bme.mit.massif.oslc.adaptor.resources.VirtualBlockResource;
import hu.bme.mit.massif.oslc.adaptor.services.BlockResourceService;
import hu.bme.mit.massif.oslc.adaptor.services.BusCreatorResourceService;
import hu.bme.mit.massif.oslc.adaptor.services.BusSelectorResourceService;
import hu.bme.mit.massif.oslc.adaptor.services.BusSpecificationResourceService;
import hu.bme.mit.massif.oslc.adaptor.services.EnableBlockResourceService;
import hu.bme.mit.massif.oslc.adaptor.services.EnableResourceService;
import hu.bme.mit.massif.oslc.adaptor.services.FromResourceService;
import hu.bme.mit.massif.oslc.adaptor.services.GotoResourceService;
import hu.bme.mit.massif.oslc.adaptor.services.InPortBlockResourceService;
import hu.bme.mit.massif.oslc.adaptor.services.InPortResourceService;
import hu.bme.mit.massif.oslc.adaptor.services.OutPortBlockResourceService;
import hu.bme.mit.massif.oslc.adaptor.services.OutPortResourceService;
import hu.bme.mit.massif.oslc.adaptor.services.PortBlockResourceService;
import hu.bme.mit.massif.oslc.adaptor.services.PortResourceService;
import hu.bme.mit.massif.oslc.adaptor.services.ServiceProviderCatalogService;
import hu.bme.mit.massif.oslc.adaptor.services.ServiceProviderService;
import hu.bme.mit.massif.oslc.adaptor.services.SimulinkElementResourceService;
import hu.bme.mit.massif.oslc.adaptor.services.SimulinkModelResourceService;
import hu.bme.mit.massif.oslc.adaptor.services.SubSystemResourceService;
import hu.bme.mit.massif.oslc.adaptor.services.TriggerBlockResourceService;
import hu.bme.mit.massif.oslc.adaptor.services.TriggerResourceService;

import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.lyo.oslc4j.application.OslcWinkApplication;
import org.eclipse.lyo.oslc4j.core.exception.OslcCoreApplicationException;
import org.eclipse.lyo.oslc4j.core.model.AllowedValues;
import org.eclipse.lyo.oslc4j.core.model.Compact;
import org.eclipse.lyo.oslc4j.core.model.CreationFactory;
import org.eclipse.lyo.oslc4j.core.model.Dialog;
import org.eclipse.lyo.oslc4j.core.model.ExtendedError;
import org.eclipse.lyo.oslc4j.core.model.OAuthConfiguration;
import org.eclipse.lyo.oslc4j.core.model.OslcConstants;
import org.eclipse.lyo.oslc4j.core.model.PrefixDefinition;
import org.eclipse.lyo.oslc4j.core.model.Preview;
import org.eclipse.lyo.oslc4j.core.model.Property;
import org.eclipse.lyo.oslc4j.core.model.Publisher;
import org.eclipse.lyo.oslc4j.core.model.QueryCapability;
import org.eclipse.lyo.oslc4j.core.model.ResourceShape;
import org.eclipse.lyo.oslc4j.core.model.Service;
import org.eclipse.lyo.oslc4j.core.model.ServiceProvider;
import org.eclipse.lyo.oslc4j.core.model.ServiceProviderCatalog;
import org.eclipse.lyo.oslc4j.provider.jena.JenaProvidersRegistry;
import org.eclipse.lyo.oslc4j.core.model.Error;
import org.eclipse.lyo.oslc4j.provider.json4j.Json4JProvidersRegistry;

public class Application extends OslcWinkApplication {

    private static final Set<Class<?>>         RESOURCE_CLASSES                          = new HashSet<Class<?>>();
    private static final Map<String, Class<?>> RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP = new HashMap<String, Class<?>>();

    static {
        // try
        // {
        RESOURCE_CLASSES.addAll(JenaProvidersRegistry.getProviders());
        RESOURCE_CLASSES.addAll(Json4JProvidersRegistry.getProviders());
        RESOURCE_CLASSES.add(BlockResourceService.class);
        RESOURCE_CLASSES.add(BusCreatorResourceService.class);
        RESOURCE_CLASSES.add(BusSelectorResourceService.class);
        RESOURCE_CLASSES.add(BusSpecificationResourceService.class);
        RESOURCE_CLASSES.add(EnableBlockResourceService.class);
        RESOURCE_CLASSES.add(EnableResourceService.class);
        RESOURCE_CLASSES.add(FromResourceService.class);
        RESOURCE_CLASSES.add(GotoResourceService.class);
        RESOURCE_CLASSES.add(InPortBlockResourceService.class);
        RESOURCE_CLASSES.add(InPortResourceService.class);
        RESOURCE_CLASSES.add(OutPortBlockResourceService.class);
        RESOURCE_CLASSES.add(OutPortResourceService.class);
        RESOURCE_CLASSES.add(PortBlockResourceService.class);
        RESOURCE_CLASSES.add(PortResourceService.class);
        RESOURCE_CLASSES.add(SimulinkElementResourceService.class);
        RESOURCE_CLASSES.add(SimulinkModelResourceService.class);
        RESOURCE_CLASSES.add(SubSystemResourceService.class);
        RESOURCE_CLASSES.add(TriggerBlockResourceService.class);
        RESOURCE_CLASSES.add(TriggerResourceService.class);
        RESOURCE_CLASSES.add(BlockResource.class);
        RESOURCE_CLASSES.add(BusCreatorResource.class);
        RESOURCE_CLASSES.add(BusSelectorResource.class);
        RESOURCE_CLASSES.add(BusSpecificationResource.class);
        RESOURCE_CLASSES.add(EnableBlockResource.class);
        RESOURCE_CLASSES.add(EnableResource.class);
        RESOURCE_CLASSES.add(FromResource.class);
        RESOURCE_CLASSES.add(GotoResource.class);
        RESOURCE_CLASSES.add(InPortBlockResource.class);
        RESOURCE_CLASSES.add(InPortResource.class);
        RESOURCE_CLASSES.add(OutPortBlockResource.class);
        RESOURCE_CLASSES.add(OutPortResource.class);
        RESOURCE_CLASSES.add(PortBlockResource.class);
        RESOURCE_CLASSES.add(PortResource.class);
        RESOURCE_CLASSES.add(SimulinkElementResource.class);
        RESOURCE_CLASSES.add(SimulinkModelResource.class);
        RESOURCE_CLASSES.add(SubSystemResource.class);
        RESOURCE_CLASSES.add(TriggerBlockResource.class);
        RESOURCE_CLASSES.add(TriggerResource.class);
        RESOURCE_CLASSES.add(VirtualBlockResource.class);
        // RESOURCE_CLASSES.add(Class.forName("org.eclipse.lyo.server.oauth.webapp.services.ConsumersService"));
        // RESOURCE_CLASSES.add(Class.forName("org.eclipse.lyo.server.oauth.webapp.services.OAuthService"));

        // Catalog resources.

        RESOURCE_CLASSES.add(ServiceProviderCatalogService.class);
        RESOURCE_CLASSES.add(ServiceProviderService.class);

        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(OslcConstants.PATH_ALLOWED_VALUES, AllowedValues.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(OslcConstants.PATH_COMPACT, Compact.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(OslcConstants.PATH_CREATION_FACTORY, CreationFactory.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(OslcConstants.PATH_DIALOG, Dialog.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(OslcConstants.PATH_ERROR, Error.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(OslcConstants.PATH_EXTENDED_ERROR, ExtendedError.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(OslcConstants.PATH_OAUTH_CONFIGURATION, OAuthConfiguration.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(OslcConstants.PATH_PREFIX_DEFINITION, PrefixDefinition.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(OslcConstants.PATH_PREVIEW, Preview.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(OslcConstants.PATH_PROPERTY, Property.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(OslcConstants.PATH_PUBLISHER, Publisher.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(OslcConstants.PATH_QUERY_CAPABILITY, QueryCapability.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(OslcConstants.PATH_RESOURCE_SHAPE, ResourceShape.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(OslcConstants.PATH_SERVICE, Service.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(OslcConstants.PATH_SERVICE_PROVIDER, ServiceProvider.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(OslcConstants.PATH_SERVICE_PROVIDER_CATALOG,
                ServiceProviderCatalog.class);
        // } catch (ClassNotFoundException e)
        // {
        // e.printStackTrace();
        // System.err.println("Application failed to initialize");
        // }

        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SimulinkAdaptorConstants.PATH_BLOCKRESOURCE, BlockResource.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SimulinkAdaptorConstants.PATH_BUSCREATORRESOURCE,
                BusCreatorResource.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SimulinkAdaptorConstants.PATH_BUSSELECTORRESOURCE,
                BusSelectorResource.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SimulinkAdaptorConstants.PATH_BUSSPECIFICATIONRESOURCE,
                BusSpecificationResource.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SimulinkAdaptorConstants.PATH_ENABLEBLOCKRESOURCE,
                EnableBlockResource.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SimulinkAdaptorConstants.PATH_ENABLERESOURCE,
                EnableResource.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SimulinkAdaptorConstants.PATH_FROMRESOURCE, FromResource.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SimulinkAdaptorConstants.PATH_GOTORESOURCE, GotoResource.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SimulinkAdaptorConstants.PATH_INPORTBLOCKRESOURCE,
                InPortBlockResource.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SimulinkAdaptorConstants.PATH_INPORTRESOURCE,
                InPortResource.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SimulinkAdaptorConstants.PATH_OUTPORTBLOCKRESOURCE,
                OutPortBlockResource.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SimulinkAdaptorConstants.PATH_OUTPORTRESOURCE,
                OutPortResource.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SimulinkAdaptorConstants.PATH_PORTBLOCKRESOURCE,
                PortBlockResource.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SimulinkAdaptorConstants.PATH_PORTRESOURCE, PortResource.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SimulinkAdaptorConstants.PATH_SIMULINKELEMENTRESOURCE,
                SimulinkElementResource.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SimulinkAdaptorConstants.PATH_SIMULINKMODELRESOURCE,
                SimulinkModelResource.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SimulinkAdaptorConstants.PATH_SUBSYSTEMRESOURCE,
                SubSystemResource.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SimulinkAdaptorConstants.PATH_TRIGGERBLOCKRESOURCE,
                TriggerBlockResource.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SimulinkAdaptorConstants.PATH_TRIGGERRESOURCE,
                TriggerResource.class);
        RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(SimulinkAdaptorConstants.PATH_VIRTUALBLOCKRESOURCE,
                VirtualBlockResource.class);
    }

    public Application() throws OslcCoreApplicationException, URISyntaxException {
        super(RESOURCE_CLASSES, OslcConstants.PATH_RESOURCE_SHAPES, RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP);
    }
}
