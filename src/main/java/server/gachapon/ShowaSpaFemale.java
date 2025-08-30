package server.gachapon;

/**
 * @author Alan (SharpAceX) - gachapon source classes stub
 * @author Ronan - parsed MapleSEA loots
 *         <p>
 *         MapleSEA-like loots src:
 *         http://maplesecrets.blogspot.com/2011/06/gachapon-showa-towns-sauna-female-spa.html
 */

public class ShowaSpaFemale extends GachaponItems {

    @Override
    public int[] getCommonItems() {
        return new int[] {
                1051105, // Green Armis
                1051106, // Blue Armis
                1051107, // Red Armis
                1051101, // Green Bazura
                1051102, // Blue Bazura
                1051103, // Red Bazura
                1051104, // Dark Bazura
                1052131, // Red Belly Duke
                1051090, // Green Katte
                1051091, // Blue Katte
                1051092, // Red Katte
                1051093, // Dark Katte
                1041122, // Green Lucida
                1041123, // Purple Lucida
                1041124, // Dark Lucida
                1061121, // Green Lucida Skirt
                1061122, // Purple Lucida Skirt
                1061123, // Dark Lucida Skirt
        };
    }

    @Override
    public int[] getUncommonItems() {
        return new int[] {
                1052071, // Red Mantle
                1052076, // Blue Czar
                1052134, // Canopus Suit
                1052072, // Black Garina
                1052075, // Blue Dragon Armor
        };
    }

    @Override
    public int[] getRareItems() {
        return new int[] {
                1072239, // Yellow Snowshoes
                1372039, // Elemental Wand 5
                1372040, // Elemental Wand 6
                1372041, // Elemental Wand 7
                1372042, // Elemental Wand 8
        };
    }

}
