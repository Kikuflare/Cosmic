package server.gachapon;

/**
 * @author Alan (SharpAceX) - gachapon source classes stub & pirate equipment
 * @author Ronan - parsed MapleSEA loots
 *         <p>
 *         MapleSEA-like loots thanks to AyumiLove - src:
 *         https://ayumilovemaple.wordpress.com/maplestory-gachapon-guide/
 */

public class KerningCity extends GachaponItems {

    @Override
    public int[] getCommonItems() {
        return new int[] {
                2040321, // Scroll for Earring for LUK 60%
                2040413, // Scroll for Topwear for LUK 60%
                2040516, // Scroll for Overall Armor for LUK 60%
                2040924, // Scroll for Shield for LUK 60%
                2041022, // Scroll for Cape for LUK 60%
                2043301, // Scroll for Dagger for ATT 60%
                2044701, // Scroll for Claw for ATT 60%
                2041310, // Scroll for Belts for LUK 60%
        };
    }

    @Override
    public int[] getUncommonItems() {
        return new int[] {
                2040323, // Scroll for Earring for LUK 10%
                2040412, // Scroll for Topwear for LUK 10%
                2040517, // Scroll for Overall Armor for LUK 10%
                2040925, // Scroll for Shield for LUK 10%
                2041023, // Scroll for Cape for LUK 10%
                2043302, // Scroll for Dagger for ATT 10%
                2044702, // Scroll for Claw for ATT 10%
                2041311, // Scroll for Belts for LUK 10%
        };
    }

    @Override
    public int[] getRareItems() {
        return new int[] {
                1003024, // Targar Hat(LUK)
        };
    }

}
