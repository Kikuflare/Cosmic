package server.gachapon;

/**
 * @author Ronan - parsed MapleSEA loots
 *         <p>
 *         MapleSEA-like loots thanks to AyumiLove - src:
 *         https://ayumilovemaple.wordpress.com/maplestory-gachapon-guide/
 */

public class Ludibrium extends GachaponItems {

    @Override
    public int[] getCommonItems() {
        return new int[] {
                1102026, // Green Seraph Cape
                1102027, // Blue Seraph Cape
                1102028, // Red Seraph Cape
                1102029, // White Seraph Cape
                1102030, // Black Seraph Cape
        };
    }

    @Override
    public int[] getUncommonItems() {
        return new int[] {
                1102031, // Green Giles Cape
                1102032, // Purple Giles Cape
                1102033, // Red Giles Cape
                1102034, // Blue Giles Cape
                1102035, // Black Giles Cape
        };
    }

    @Override
    public int[] getRareItems() {
        return new int[] {
                1102041, // Pink Adventurer Cape
                1102042, // Purple Adventurer Cape
                1102084, // Pink Gaia Cape
                1102086, // Purple Gaia Cape
        };
    }

}
