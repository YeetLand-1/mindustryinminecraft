
package net.mcreator.mindustryinminecraft.gui;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.client.Minecraft;

import net.mcreator.mindustryinminecraft.MindustryinminecraftMod;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class CraftingScreenGuiWindow extends ContainerScreen<CraftingScreenGui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	private final static HashMap guistate = CraftingScreenGui.guistate;
	public CraftingScreenGuiWindow(CraftingScreenGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 310;
		this.ySize = 186;
	}
	private static final ResourceLocation texture = new ResourceLocation("mindustryinminecraft:textures/crafting_screen.png");
	@Override
	public void render(MatrixStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderHoveredTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(MatrixStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.color4f(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		Minecraft.getInstance().getTextureManager().bindTexture(texture);
		int k = (this.width - this.xSize) / 2;
		int l = (this.height - this.ySize) / 2;
		this.blit(ms, k, l, 0, 0, this.xSize, this.ySize, this.xSize, this.ySize);
		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("mindustryinminecraft:textures/block-conveyor-ui.png"));
		this.blit(ms, this.guiLeft + 10, this.guiTop + 8, 0, 0, 32, 32, 32, 32);
		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("mindustryinminecraft:textures/block-router-ui.png"));
		this.blit(ms, this.guiLeft + 64, this.guiTop + 8, 0, 0, 32, 32, 32, 32);
		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("mindustryinminecraft:textures/block-mechanical-drill-ui.png"));
		this.blit(ms, this.guiLeft + 118, this.guiTop + 8, 0, 0, 32, 32, 32, 32);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeScreen();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void tick() {
		super.tick();
	}

	@Override
	protected void drawGuiContainerForegroundLayer(MatrixStack ms, int mouseX, int mouseY) {
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardListener.enableRepeatEvents(false);
	}

	@Override
	public void init(Minecraft minecraft, int width, int height) {
		super.init(minecraft, width, height);
		minecraft.keyboardListener.enableRepeatEvents(true);
		this.addButton(new Button(this.guiLeft + 1, this.guiTop + 44, 45, 20, new StringTextComponent("Make"), e -> {
			if (true) {
				MindustryinminecraftMod.PACKET_HANDLER.sendToServer(new CraftingScreenGui.ButtonPressedMessage(0, x, y, z));
				CraftingScreenGui.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 55, this.guiTop + 44, 45, 20, new StringTextComponent("Make"), e -> {
			if (true) {
				MindustryinminecraftMod.PACKET_HANDLER.sendToServer(new CraftingScreenGui.ButtonPressedMessage(1, x, y, z));
				CraftingScreenGui.handleButtonAction(entity, 1, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 253, this.guiTop + 116, 30, 20, new StringTextComponent(">"), e -> {
			if (true) {
				MindustryinminecraftMod.PACKET_HANDLER.sendToServer(new CraftingScreenGui.ButtonPressedMessage(2, x, y, z));
				CraftingScreenGui.handleButtonAction(entity, 2, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 109, this.guiTop + 44, 45, 20, new StringTextComponent("Make"), e -> {
			if (true) {
				MindustryinminecraftMod.PACKET_HANDLER.sendToServer(new CraftingScreenGui.ButtonPressedMessage(3, x, y, z));
				CraftingScreenGui.handleButtonAction(entity, 3, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 19, this.guiTop + 116, 30, 20, new StringTextComponent("<"), e -> {
			if (true) {
				MindustryinminecraftMod.PACKET_HANDLER.sendToServer(new CraftingScreenGui.ButtonPressedMessage(4, x, y, z));
				CraftingScreenGui.handleButtonAction(entity, 4, x, y, z);
			}
		}));
	}
}
