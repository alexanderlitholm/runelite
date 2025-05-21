package net.runelite.client.plugins.trasamasflippingcopilot;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;
import net.runelite.client.plugins.trasamasflippingcopilot.controller.FlippingCopilotPlugin;

public class FlippingCopilotPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(FlippingCopilotPlugin.class);
		RuneLite.main(args);
	}
}