/*
 * Copyright (c) 2015. markus endres, timotheus preisinger
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package ec;


import flatlc.levels.FlatLevelCombination;

/**
 * @author Timotheus Preisinger
 * @author endresma
 */
public class EquivalenceClass extends AbstractEquivalenceClass {

    /**
     * Constructor. The equivalence class is initialized with its level
     * combination.
     *
     * @param lvl level combination of this equivalence class
     */
    public EquivalenceClass(FlatLevelCombination lvl) {
        super(lvl);
    }



}
