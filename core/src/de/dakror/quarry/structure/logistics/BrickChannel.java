/*******************************************************************************
 * Copyright 2018 Maximilian Stark | Dakror <mail@dakror.de>
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/

package de.dakror.quarry.structure.logistics;

import de.dakror.quarry.game.Item;
import de.dakror.quarry.game.Item.ItemType;
import de.dakror.quarry.game.Item.Items;
import de.dakror.quarry.structure.base.FluidTubeStructure;
import de.dakror.quarry.structure.base.StructureType;

/**
 * @author Maximilian Stark | Dakror
 */
public class BrickChannel extends FluidTubeStructure {
    public static FluidTubeSchema classSchema = new FluidTubeSchema(0, StructureType.BrickChannel, 1000, 1, 1, "brick_channel", new Items(ItemType.Brick, 2), null);

    public BrickChannel(int x, int y) {
        super(x, y, classSchema);
    }

    @Override
    protected boolean isAllowedFluid(ItemType i) {
        return Item.base(i) == ItemType._MoltenMetal;
    }
}
