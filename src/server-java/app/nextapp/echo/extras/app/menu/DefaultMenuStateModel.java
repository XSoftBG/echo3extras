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

package nextapp.echo.extras.app.menu;

import java.util.HashSet;
import java.util.Set;

/**
 * Default <code>MenuStateModel</code> implementation.
 */
public class DefaultMenuStateModel extends AbstractMenuStateModel {

    private Set selectedIdSet = null;
    private Set disabledIdSet = null;
    private Set hidedIdSet = null;

    /**
     * @see nextapp.echo.extras.app.menu.MenuStateModel#isVisible(java.lang.String)
     */
    public boolean isVisible(String id) {
        return hidedIdSet == null || !hidedIdSet.contains(id);
    }

    /**
     * @see nextapp.echo.extras.app.menu.MenuStateModel#isEnabled(java.lang.String)
     */
    public boolean isEnabled(String id) {
        return disabledIdSet == null || !disabledIdSet.contains(id);
    }

    /**
     * @see nextapp.echo.extras.app.menu.MenuStateModel#isSelected(java.lang.String)
     */
    public boolean isSelected(String id) {
        return selectedIdSet != null && selectedIdSet.contains(id);
    }
    
    /**
     * @see nextapp.echo.extras.app.menu.MenuStateModel#setVisible(java.lang.String, boolean)
     */
    public void setVisible(String id, boolean visible) {
        if (hidedIdSet == null) {
            hidedIdSet = new HashSet();
        }
        if (visible) {
            hidedIdSet.remove(id);
        } else { 
            hidedIdSet.add(id);
        }
        fireStateChanged();
    }

    /**
     * @see nextapp.echo.extras.app.menu.MenuStateModel#setEnabled(java.lang.String, boolean)
     */
    public void setEnabled(String id, boolean enabled) {
        if (disabledIdSet == null) {
            disabledIdSet = new HashSet();
        }
        if (enabled) {
            disabledIdSet.remove(id);
        } else { 
            disabledIdSet.add(id);
        }
        fireStateChanged();
    }
    
    /**
     * @see nextapp.echo.extras.app.menu.MenuStateModel#setSelected(java.lang.String, boolean)
     */
    public void setSelected(String id, boolean selected) {
        if (selected == isSelected(id)) {
            return;
        }
        if (selectedIdSet == null) {
            selectedIdSet = new HashSet();
        }
        if (selected) {
            selectedIdSet.add(id);
        } else {
            selectedIdSet.remove(id);
        }
        fireStateChanged();
    }
}
