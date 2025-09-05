package server.gachapon;

/**
 * @author Ronan - parsed MapleSEA loots
 *         <p>
 *         MapleSEA-like loots thanks to AyumiLove - src:
 *         https://ayumilovemaple.wordpress.com/maplestory-gachapon-guide/
 */

public class ElNath extends GachaponItems {

    @Override
    public int[] getCommonItems() {
        return new int[] {
                1072227, // Red Arnah Shoes
                1072228, // Blue Arnah Shoes
                1072229, // Green Arnah Shoes
                1072223, // Green Varr Shoes
                1072224, // Blue Varr Shoes
                1072225, // Red Varr Shoes
                1072226, // Dark Varr Shoes
                1072318, // Black Duke Barkin Shoes
                1072213, // Green Katina Boots
                1072214, // Blue Katina Boots
                1072215, // Red Katina Boots
                1072216, // Dark Katina Boots
                1072220, // Green Crescent Boots
                1072221, // Blue Crescent Boots
                1072222, // Dark Crescent Boots
        };
    }

    @Override
    public int[] getUncommonItems() {
        return new int[] {
                1072269, // Red Hunter Shoes
                1072268, // Blue Elemental Shoes
                1072321, // Canopus Boots
                1072272, // Black Garina Shoes
                1072273, // Blue Dragon Boots
        };
    }

    @Override
    public int[] getRareItems() {
        return new int[] {
                1122000, // Horntail Necklace
                1122059, // Mark of Naricain
        };
    }

}
