package server.gachapon;

/**
 * @author Alan (SharpAceX) - gachapon source classes stub
 * @author Ronan - parsed MapleSEA loots
 *         <p>
 *         MapleSEA-like loots thanks to AyumiLove - src:
 *         https://ayumilovemaple.wordpress.com/maplestory-gachapon-guide/
 */

public class Henesys extends GachaponItems {

    @Override
    public int[] getCommonItems() {
        return new int[] {
                2040029, // Scroll for Helmet for DEX 60%
                2040317, // Scroll for Earring for DEX 60%
                2040501, // Scroll for Overall Armor for DEX 60%
                2040613, // Scroll for Bottomwear for DEX 60%
                2040704, // Scroll for Shoes for Jump 60%
                2040801, // Scroll for Gloves for DEX 60%
                2041019, // Scroll for Cape for DEX 60%
                2044501, // Scroll for Bow for ATT 60%
                2044601, // Scroll for Crossbow for ATT 60%
                2041307, // Scroll for Belts for DEX 60%
                2040017, // Scroll for Helmet for Accuracy 60%
                2040106, // Scroll for Face Accessory for Avoidability 60%
                2040201, // Scroll for Eye Accessory for Accuracy 60%
        };
    }

    @Override
    public int[] getUncommonItems() {
        return new int[] {
                2040031, // Scroll for Helmet for DEX 10%
                2040318, // Scroll for Earring for DEX 10%
                2040502, // Scroll for Overall Armor for DEX 10%
                2040612, // Scroll for Bottomwear for DEX 10%
                2040705, // Scroll for Shoes for Jump 10%
                2040802, // Scroll for Gloves for DEX 10%
                2041020, // Scroll for Cape for DEX 10%
                2044502, // Scroll for Bow for ATT 10%
                2044602, // Scroll for Crossbow for ATT 10%
                2041308, // Scroll for Belts for DEX 10%
                2040018, // Scroll for Helmet for Accuracy 10%
                2040105, // Scroll for Face Accessory for Avoidability 10%
                2040200, // Scroll for Eye Accessory for Accuracy 10%
        };
    }

    @Override
    public int[] getRareItems() {
        return new int[] {
                1003025, // Scarlion Hat(DEX)
        };
    }

}
