/**
 * Tangara is an educational platform to get started with programming.
 * Copyright (C) 2009 Colombbus (http://www.colombbus.org)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.colombbus.tangara.help;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import org.colombbus.helpengine.HelpEngine;
import org.colombbus.tangara.Messages;

/**
 * Help action which show a JavaHelp application.
 */
@SuppressWarnings("serial")
public class HelpAction extends AbstractAction {

	private HelpEngine helpEngine;


	public HelpAction(HelpEngine helpEngine) {
		String actionName = Messages.getString("HelpAction.name"); //$NON-NLS-1$
		putValue(NAME, actionName);
		this.helpEngine = helpEngine;
	}


	@Override
	public void actionPerformed(ActionEvent actionEvent) {
		helpEngine.openHelp();
	}
}