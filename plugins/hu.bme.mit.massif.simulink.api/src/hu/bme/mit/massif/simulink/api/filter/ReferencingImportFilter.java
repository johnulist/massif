/*******************************************************************************
 * Copyright (c) 2010-2013, Embraer S.A., Budapest University of Technology and Economics
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html 
 *
 * Contributors: 
 *     Marton Bur, Abel Hegedus, Akos Horvath - initial API and implementation 
 *******************************************************************************/
package hu.bme.mit.massif.simulink.api.filter;

import hu.bme.mit.massif.communication.command.MatlabCommand;
import hu.bme.mit.massif.communication.command.MatlabCommandFactory;
import hu.bme.mit.massif.communication.datatype.MatlabString;
import hu.bme.mit.massif.simulink.api.extension.ISimulinkImportFilter;

public class ReferencingImportFilter implements ISimulinkImportFilter {

    @Override
    public boolean filter(MatlabCommandFactory commandFactory , String blockFQN) {
        MatlabCommand getLinkStatus = commandFactory.getParam().addParam(blockFQN).addParam("LinkStatus");
        String linkStatus = MatlabString.getMatlabStringData(getLinkStatus.execute());
        return "resolved".equals(linkStatus) || "implicit".equals(linkStatus);
    }

}
