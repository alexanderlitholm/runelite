package  net.runelite.client.plugins.trasamasflippingcopilot.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class SuggestionPreferences {

    private boolean f2pOnlyMode = false;
    private boolean sellOnlyMode = false;
    private List<Integer> blockedItemIds = new ArrayList<>();
}
