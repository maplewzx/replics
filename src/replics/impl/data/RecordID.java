/*
 *  Copyright 2008 École des Mines de Nantes.
 * 
 * This file is part of Replics.
 * 
 * Replics <http://replics.googlecode.com> is free software: 
 * you can redistribute it and/or modify it under the terms
 * of the GNU General Public License as published by the
 * Free Software Foundation, either version 3 of the License,
 * or (at your option) any later version.
 * 
 * Replics is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with Replics.  If not, see <http://www.gnu.org/licenses/>.
 */

package replics.impl.data;

import replics.ids.IRecordID;

public class RecordID implements IRecordID {

	int RecordID;
	String GroupID;
	
	public RecordID(int RecordID, String GroupID){
		super();
		this.RecordID=RecordID;
		this.GroupID=GroupID;
	}
	
	public boolean equals() {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public String getGroupID() {
		// TODO Auto-generated method stub
		return GroupID;
	}

	@Override
	public int getRecordID() {
		// TODO Auto-generated method stub
		return RecordID;
	}

}
