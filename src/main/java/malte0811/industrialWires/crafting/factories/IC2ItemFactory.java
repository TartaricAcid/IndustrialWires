package malte0811.industrialWires.crafting.factories;

import blusunrize.immersiveengineering.common.crafting.IngredientFactoryStackableNBT;
import com.google.gson.JsonObject;
import ic2.api.item.IC2Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.common.crafting.IIngredientFactory;
import net.minecraftforge.common.crafting.JsonContext;

import javax.annotation.Nonnull;

public class IC2ItemFactory implements IIngredientFactory {
	@Nonnull
	@Override
	public Ingredient parse(JsonContext context, JsonObject json) {
		String name = json.get("name").getAsString();
		String variant = json.get("variant").getAsString();
		return new IngredientFactoryStackableNBT.IngredientStackableNBT(IC2Items.getItem(name, variant));
	}
}
