package net.runelite.client.plugins.trasamasflippingcopilot.model;

import org.junit.Test;

import net.runelite.client.plugins.trasamasflippingcopilot.model.Offer;
import net.runelite.client.plugins.trasamasflippingcopilot.model.OfferStatus;
import net.runelite.client.plugins.trasamasflippingcopilot.model.StatusOfferList;
import net.runelite.client.plugins.trasamasflippingcopilot.model.Suggestion;


public class OfferListTest {
    @Test
    public void testIsEmptySlotNeededWithExistingOfferInSlot() {
        StatusOfferList offerList = new StatusOfferList();
        offerList.set(0, new Offer(OfferStatus.BUY, 565, 200, 10, 0, 0, 0, 0, 0, false, false));
        Suggestion suggestion = new Suggestion("buy", 0, 560, 200, 10, "Death rune", 0, "");
        assert !offerList.isEmptySlotNeeded(suggestion);
    }

    @Test
    public void testIsEmptySlotNeededWithNoEmptySlots() {
        StatusOfferList offerList = new StatusOfferList();
        offerList.replaceAll(ignored -> new Offer(OfferStatus.BUY, 565, 200, 10, 0, 0, 0, 0, 0, false, false));
        Suggestion suggestion = new Suggestion("buy", 0, 560, 200, 10, "Death rune", 0, "");
        assert offerList.isEmptySlotNeeded(suggestion);
    }

}
