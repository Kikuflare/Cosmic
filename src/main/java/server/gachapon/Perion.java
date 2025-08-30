package server.gachapon;

/**
 * @author Alan (SharpAceX) - gachapon source classes stub & pirate equipment
 * @author Ronan - parsed MapleSEA loots
 *         <p>
 *         MapleSEA-like loots thanks to AyumiLove - src:
 *         https://ayumilovemaple.wordpress.com/maplestory-gachapon-guide/
 */

public class Perion extends GachaponItems {

    @Override
    public int[] getCommonItems() {
        return new int[] {
                2040418, // Scroll for Topwear for STR 60%
                2040532, // Scroll for Overall Armor for STR 60%
                2040931, // Scroll for Shield for STR 60%
                2041013, // Scroll for Cape for STR 60%
                2043001, // Scroll for One-Handed Sword for ATT 60%
                2043101, // Scroll for One-Handed Axe for ATT 60%
                2043201, // Scroll for One-Handed BW for ATT 60%
                2044001, // Scroll for Two-Handed Sword for ATT 60%
                2044101, // Scroll for Two-Handed Axe for ATT 60%
                2044201, // Scroll for Two-Handed BW for ATT 60%
                2044301, // Scroll for Spear for ATT 60%
                2044401, // Scroll for Pole Arm for ATT 60%
                2041301, // Scroll for Belts for STR 60%

        };
    }

    @Override
    public int[] getUncommonItems() {
        return new int[] {
                2040419, // Scroll for Topwear for STR 10%
                2040534, // Scroll for Overall Armor for STR 10%
                2040933, // Scroll for Shield for STR 10%
                2041014, // Scroll for Cape for STR 10%
                2043002, // Scroll for One-Handed Sword for ATT 10%
                2043102, // Scroll for One-Handed Axe for ATT 10%
                2043202, // Scroll for One-Handed BW for ATT 10%
                2044002, // Scroll for Two-Handed Sword for ATT 10%
                2044102, // Scroll for Two-Handed Axe for ATT 10%
                2044202, // Scroll for Two-Handed BW for ATT 10%
                2044302, // Scroll for Spear for ATT 10%
                2044402, // Scroll for Pole Arm for ATT 10%
                2041302, // Scroll for Belts for STR 10%
        };
    }

    @Override
    public int[] getRareItems() {
        return new int[] {
                1003026, // Scarlion Hat(STR)
        };
    }

}
