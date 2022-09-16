
package net.mcreator.mindustryinminecraft.client.gui;

public class CraftingScreenScreen extends AbstractContainerScreen<CraftingScreenMenu> {

	private final static HashMap<String, Object> guistate = CraftingScreenMenu.guistate;

	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public CraftingScreenScreen(CraftingScreenMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 310;
		this.imageHeight = 186;
	}

	private static final ResourceLocation texture = new ResourceLocation("mindustryinminecraft:textures/screens/crafting_screen.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);

	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();

		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mindustryinminecraft:textures/screens/block-conveyor-ui.png"));
		this.blit(ms, this.leftPos + 10, this.topPos + 8, 0, 0, 32, 32, 32, 32);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mindustryinminecraft:textures/screens/block-router-ui.png"));
		this.blit(ms, this.leftPos + 64, this.topPos + 8, 0, 0, 32, 32, 32, 32);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mindustryinminecraft:textures/screens/block-mechanical-drill-ui.png"));
		this.blit(ms, this.leftPos + 118, this.topPos + 8, 0, 0, 32, 32, 32, 32);

		RenderSystem.setShaderTexture(0, new ResourceLocation("mindustryinminecraft:textures/screens/block-junction-ui.png"));
		this.blit(ms, this.leftPos + 172, this.topPos + 8, 0, 0, 32, 32, 32, 32);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}

		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();

		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);

		this.addRenderableWidget(new Button(this.leftPos + 1, this.topPos + 44, 45, 20, new TextComponent("Make"), e -> {
			if (true) {
				MindustryinminecraftMod.PACKET_HANDLER.sendToServer(new CraftingScreenButtonMessage(0, x, y, z));
				CraftingScreenButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 55, this.topPos + 44, 45, 20, new TextComponent("Make"), e -> {
			if (true) {
				MindustryinminecraftMod.PACKET_HANDLER.sendToServer(new CraftingScreenButtonMessage(1, x, y, z));
				CraftingScreenButtonMessage.handleButtonAction(entity, 1, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 253, this.topPos + 116, 30, 20, new TextComponent(">"), e -> {
		}));
		this.addRenderableWidget(new Button(this.leftPos + 109, this.topPos + 44, 45, 20, new TextComponent("Make"), e -> {
			if (true) {
				MindustryinminecraftMod.PACKET_HANDLER.sendToServer(new CraftingScreenButtonMessage(3, x, y, z));
				CraftingScreenButtonMessage.handleButtonAction(entity, 3, x, y, z);
			}
		}));
		this.addRenderableWidget(new Button(this.leftPos + 19, this.topPos + 116, 30, 20, new TextComponent("<"), e -> {
		}));
		this.addRenderableWidget(new Button(this.leftPos + 163, this.topPos + 44, 45, 20, new TextComponent("Make"), e -> {
			if (true) {
				MindustryinminecraftMod.PACKET_HANDLER.sendToServer(new CraftingScreenButtonMessage(5, x, y, z));
				CraftingScreenButtonMessage.handleButtonAction(entity, 5, x, y, z);
			}
		}));
	}

}
