package server.gachapon;

/**
 * @author Alan (SharpAceX) - gachapon source classes stub
 * @author Ronan - parsed MapleSEA loots
 *         <p>
 *         MapleSEA-like loots src:
 *         http://maplesecrets.blogspot.com/2011/05/gachapon-showa-towns-sauna.html
 */

public class ShowaSpaMale extends GachaponItems {

    @Override
    public int[] getCommonItems() {
        return new int[] {
                1050106, // Green Arzuna
                1050107, // Blue Arzuna
                1050108, // Red Arzuna
                1050102, // Green Varuna
                1050103, // Blue Varuna
                1050104, // Red Varuna
                1050105, // Dark Varuna
                1052131, // Red Belly Duke
                1050096, // Green Katinas
                1050097, // Blue Katinas
                1050098, // Red Katinas
                1050099, // Dark Katinas
                1040120, // Green Neos
                1040121, // Blue Neos
                1040122, // Black Neos
                1060109, // Green Neos Pants
                1060110, // Blue Neos Pants
                1060111, // Black Neos Pants
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
                1072238, // Violet Snowshoes
                1382049, // Elemental Staff 5
                1382050, // Elemental Staff 6
                1382051, // Elemental Staff 7
                1382052, // Elemental Staff 8
        };
    }

}
