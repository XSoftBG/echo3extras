/* 
 * This file is part of the Echo Extras Project.
 * Copyright (C) 2005-2009 NextApp, Inc.
 *
 * Version: MPL 1.1/GPL 2.0/LGPL 2.1
 *
 * The contents of this file are subject to the Mozilla Public License Version
 * 1.1 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * http://www.mozilla.org/MPL/
 *
 * Software distributed under the License is distributed on an "AS IS" basis,
 * WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
 * for the specific language governing rights and limitations under the
 * License.
 *
 * Alternatively, the contents of this file may be used under the terms of
 * either the GNU General Public License Version 2 or later (the "GPL"), or
 * the GNU Lesser General Public License Version 2.1 or later (the "LGPL"),
 * in which case the provisions of the GPL or the LGPL are applicable instead
 * of those above. If you wish to allow use of your version of this file only
 * under the terms of either the GPL or the LGPL, and not to allow others to
 * use your version of this file under the terms of the MPL, indicate your
 * decision by deleting the provisions above and replace them with the notice
 * and other provisions required by the GPL or the LGPL. If you do not delete
 * the provisions above, a recipient may use your version of this file under
 * the terms of any one of the MPL, the GPL or the LGPL.
 */

package nextapp.echo.extras.webcontainer.sync.component;

import nextapp.echo.extras.app.ContextMenu;
import nextapp.echo.app.Component;
import nextapp.echo.app.util.Context;
import nextapp.echo.app.update.ClientUpdateManager;

/**
 * Synchronization peer for <code>ContextMenu</code>s.
 * 
 * @author n.beekman
 */
public class ContextMenuPeer extends AbstractMenuPeer {

    public ContextMenuPeer()
    {
      super();
      addOutputProperty(ContextMenu.PROPERTY_MENU_VISIBLE);
    }   

    public Class getInputPropertyClass(String propertyName) 
    {
      if (propertyName.equals(ContextMenu.PROPERTY_MENU_VISIBLE)) {
          return Boolean.class;
      } else {
          return super.getInputPropertyClass(propertyName); 
      }
    }
  
    public void storeInputProperty(Context context, Component component, String propertyName, int propertyIndex, Object newValue) {
        final ClientUpdateManager clientUpdateManager = (ClientUpdateManager) context.get(ClientUpdateManager.class);
        clientUpdateManager.setComponentProperty(component, propertyName, newValue);
    }
 
    /**
     * @see nextapp.echo.webcontainer.ComponentSynchronizePeer#getClientComponentType(boolean)
     */
    public String getClientComponentType(boolean mode) {
        return "Extras.ContextMenu";
    }

    /**
     * @see nextapp.echo.webcontainer.ComponentSynchronizePeer#getComponentClass()
     */
    public Class getComponentClass() {
        return ContextMenu.class;
    }
}