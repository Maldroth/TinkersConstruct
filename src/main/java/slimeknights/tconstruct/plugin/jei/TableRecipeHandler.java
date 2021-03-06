package slimeknights.tconstruct.plugin.jei;

import javax.annotation.Nonnull;

import mezz.jei.api.recipe.IRecipeHandler;
import mezz.jei.api.recipe.IRecipeWrapper;
import mezz.jei.api.recipe.VanillaRecipeCategoryUid;
import slimeknights.tconstruct.tools.TableRecipe;

public class TableRecipeHandler implements IRecipeHandler<TableRecipe> {

  @Nonnull
  @Override
  public Class<TableRecipe> getRecipeClass() {
    return TableRecipe.class;
  }

  @Nonnull
  @Override
  public String getRecipeCategoryUid() {
    return VanillaRecipeCategoryUid.CRAFTING;
  }

  @Nonnull
  @Override
  public IRecipeWrapper getRecipeWrapper(@Nonnull TableRecipe recipe) {
    return new TableRecipeWrapper(recipe);
  }

  @Override
  public boolean isRecipeValid(@Nonnull TableRecipe recipe) {
    return !recipe.outputBlocks.isEmpty() && recipe.getInput() != null && recipe.getInput().length > 0;
  }
}
