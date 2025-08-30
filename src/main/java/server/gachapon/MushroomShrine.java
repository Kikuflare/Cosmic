package server.gachapon;

/**
 * @author Alan (SharpAceX) - gachapon source classes stub
 * @author Ronan - parsed MapleSEA loots
 *         <p>
 *         MapleSEA-like loots thanks to AyumiLove - src:
 *         https://ayumilovemaple.wordpress.com/maplestory-gachapon-guide/
 */

public class MushroomShrine extends GachaponItems {

    @Override
    public int[] getCommonItems() {
        return new int[] {
                1082158, // Red Arcina
                1082159, // Blue Arcina
                1082160, // Green Arcina
                1082151, // Green Ciara
                1082152, // Blue Ciara
                1082153, // Red Ciara
                1082154, // Purple Ciara
                1082213, // Black Skellduke
                1082135, // Blue Anelin
                1082136, // Green Anelin
                1082137, // Red Anelin
                1082138, // Dark Anelin
                1082139, // Green Korben
                1082140, // Blue Korben
                1082141, // Dark Korben
        };
    }

    @Override
    public int[] getUncommonItems() {
        return new int[] {
                1082163, // Red Hunter Gloves
                1082164, // Blue Elemental Gloves
                1082216, // Canopus Glove
                1082167, // Black Garina Gloves
                1082168, // Blue Dragon Gauntlet
        };
    }

    @Override
    public int[] getRareItems() {
        return new int[] {
                1082149, // Brown Work Gloves
                1032048, // Crystal Leaf Earrings
                2070016, // Crystal Ilbi Throwing-Stars
        };
    }

}
