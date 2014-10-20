/*******************************************************************************
 * Copyright (c) 2010-2013, Embraer S.A., Budapest University of Technology and Economics
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html 
 *
 * Contributors: 
 *     Abel Hegedus - initial API and implementation 
 *******************************************************************************/
package hu.bme.mit.massif.common.tracer;

import hu.bme.mit.massif.common.MassifCommonPlugin;

public enum MassifTracerOptions {
    GLOBAL, SIMULINKAPI, TRANSFORMATION, UI, ALLOCATION;

    public String getFullTraceOption() {
        return MassifCommonPlugin.PLUGIN_ID + getTraceOption();
    }

    public String getTraceOption() {
        if (this == MassifTracerOptions.GLOBAL) {
            return "/debug";
        } else {
            return "/trace/" + this.toString().toLowerCase();
        }
    }
}