package server.gachapon;

/**
 * @author Alan (SharpAceX) - gachapon source classes stub & pirate equipment
 * @author Ronan - parsed MapleSEA loots
 *         <p>
 *         MapleSEA-like loots thanks to AyumiLove - src:
 *         https://ayumilovemaple.wordpress.com/maplestory-gachapon-guide/
 */

public class Ellinia extends GachaponItems {

    @Override
    public int[] getCommonItems() {
        return new int[] {
                2040025, // Scroll for Helmet for INT 60%
                2040206, // Scroll for Eye Accessory for INT 60%
                2040301, // Scroll for Earring for INT 60%
                2040513, // Scroll for Overall Armor for INT 60%
                2040817, // Scroll for Gloves for Magic Att. 60%
                2040919, // Scroll for Shield for Magic Att. 60%
                2041016, // Scroll for Cape for INT 60%
                2043009, // Scroll for One-Handed Sword for Magic Att. 60%
                2043701, // Scroll for Wand for Magic Att. 60%
                2043801, // Scroll for Staff for Magic Att. 60%
                2041304, // Scroll for Belts for INT 60%
        };
    }

    @Override
    public int[] getUncommonItems() {
        return new int[] {
                2040026, // Scroll for Helmet for INT 10%
                2040205, // Scroll for Eye Accessory for INT 10%
                2040302, // Scroll for Earring for INT 10%
                2040514, // Scroll for Overall Armor for INT 10%
                2040816, // Scroll for Gloves for Magic Att. 10%
                2040920, // Scroll for Shield for Magic Att. 10%
                2041017, // Scroll for Cape for INT 10%
                2043008, // Scroll for One-Handed Sword for Magic Att. 10%
                2043702, // Scroll for Wand for Magic Att. 10%
                2043802, // Scroll for Staff for Magic Att. 10%
                2041305, // Scroll for Belts for INT 10%
        };
    }

    @Override
    public int[] getRareItems() {
        return new int[] {
                1003023, // Targar Hat(INT)
        };
    }

}
