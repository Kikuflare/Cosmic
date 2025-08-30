package server.gachapon;

/**
 * @author Alan (SharpAceX)
 * @author Ronan - added ores and reworked global loots
 */

public class Global extends GachaponItems {

    @Override
    public int[] getCommonItems() {
        return new int[] {
                2000005, // Power Elixir
                2022251, // Maple Pop
                2048002, // Scroll for Pet Equip. for Speed 10%
                2048005, // Scroll for Pet Equip. for Jump 10%
        };
    }

    @Override
    public int[] getUncommonItems() {
        return new int[] {
                2022070, // Congrats from GM
                2022121, // Gelt Chocolate
                2022123, // Banana Graham Pie
        };
    }

    @Override
    public int[] getRareItems() {
        return new int[] {
                2049100, // Chaos Scroll 60%
        };
    }

}
