/*******************************************************************************
 * Copyright (c) 2012, 2014 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
require([ "dojo/dom", "dojo/dom-construct", "dojo/on", "dojo/_base/event",
    "dojo/_base/xhr", "dojo/ready" ], function (dom, domConstruct, on, event, xhr, ready) {
    function showError(message) {
        var errorNode = dom.byId('error');
        if (message) {
            domConstruct.empty(errorNode);
            errorNode.appendChild(document.createTextNode(message));
        } else {
            errorNode.innerHTML = 'An error occurred.';
        }
        errorNode.style.display = 'block';
    }

    function callback() {
        var callback = dom.byId('callback').value;
        if (callback) {
            window.location = callback;
        }
    }

    function submit() {
        xhr.post({
            url: 'adminLogin',
            form: 'loginForm',
            load: function () {
                callback();
            },
            headers: {
                'X-CSRF-Prevent': lyoOAuthConfig.csrfPrevent
            },
            error: function (error, ioArgs) {
                showError(ioArgs.xhr.responseText);
            }
        });
    }

    ready(function () {
        on(dom.byId('loginForm'), 'submit', function (e) {
            event.stop(e);
            submit();
        });
    });
});