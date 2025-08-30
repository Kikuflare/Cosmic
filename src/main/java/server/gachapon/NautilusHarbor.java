package server.gachapon;

/**
 * @author Alan (SharpAceX) - gachapon source classes stub & pirate items
 * @author Ronan - parsed MapleSEA loots
 *         <p>
 *         MapleSEA-like loots thanks to AyumiLove - src:
 *         https://ayumilovemaple.wordpress.com/maplestory-gachapon-guide/
 */

public class NautilusHarbor extends GachaponItems {

    @Override
    public int[] getCommonItems() {
        return new int[] {
                2044801, // Scroll for Knuckler for Attack 60%
                2044901, // Scroll for Gun for Attack 60%
                2040804, // Scroll for Gloves for ATT 60%
                2040914, // Scroll for Shield for Weapon Att. 60%
                2040618, // Scroll for Bottomwear for Jump 60%
                2040701, // Scroll for Shoes for DEX 60%
                2040707, // Scroll for Shoes for Speed 60%
                2040727, // Scroll for Spikes on Shoes 10%
                2041058, // Scroll for Cape for Cold Protection 10%
        };
    }

    @Override
    public int[] getUncommonItems() {
        return new int[] {
                2044802, // Scroll for Knuckler for Attack 10%
                2044902, // Scroll for Gun for Attack 10%
                2040805, // Scroll for Gloves for ATT 10%
                2040915, // Scroll for Shield for Weapon Att. 10%
                2040619, // Scroll for Bottomwear for Jump 10%
                2040702, // Scroll for Shoes for DEX 10%
                2040708, // Scroll for Shoes for Speed 10%
        };
    }

    @Override
    public int[] getRareItems() {
        return new int[] {
                1002357 // Zakum Helmet
        };
    }

}
