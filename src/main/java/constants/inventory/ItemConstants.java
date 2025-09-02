/*
	This file is part of the OdinMS Maple Story Server
    Copyright (C) 2008 Patrick Huy <patrick.huy@frz.cc>
		       Matthias Butz <matze@odinms.de>
		       Jan Christian Meyer <vimes@odinms.de>

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU Affero General Public License as
    published by the Free Software Foundation version 3 as published by
    the Free Software Foundation. You may not use, modify or distribute
    this program under any other version of the GNU Affero General Public
    License.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Affero General Public License for more details.

    You should have received a copy of the GNU Affero General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/
package constants.inventory;

import client.inventory.InventoryType;
import config.YamlConfig;
import constants.id.ItemId;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author Jay Estrella
 * @author Ronan
 */
public final class ItemConstants {
    protected static Map<Integer, InventoryType> inventoryTypeCache = new HashMap<>();

    public final static short LOCK = 0x01;
    public final static short SPIKES = 0x02;
    public final static short KARMA_USE = 0x02;
    public final static short COLD = 0x04;
    public final static short UNTRADEABLE = 0x08;
    public final static short KARMA_EQP = 0x10;
    public final static short SANDBOX = 0x40; // let 0x40 until it's proven something uses this
    public final static short PET_COME = 0x80;
    public final static short ACCOUNT_SHARING = 0x100;
    public final static short MERGE_UNTRADEABLE = 0x200;

    public final static boolean EXPIRING_ITEMS = false;
    public final static Set<Integer> permanentItemids = new HashSet<>();

    private static final Set<Integer> NON_DPS_SCROLL_IDS = Set.of(
        2040000, // Scroll for Helmet for DEF - Improves the helmet's weapon def.\nSuccess rate:100%, weapon def. +1
        2040001, // Scroll for Helmet for DEF - Improves helmet def.\nSuccess rate:60%, weapon def.+2, magic def., +2. The success rate of this scroll can be enhanced by Vega's Spell.
        2040002, // Scroll for Helmet for DEF - Improves helmet def.\nSuccess Rate:10%, weapon def.+5, magic def.+3, accuracy+1. The success rate of this scroll can be enhanced by Vega's Spell.
        2040003, // Scroll for Helmet for HP - Improves MaxHP on hats.\nSuccess rate:100%, MaxHP+5
        2040004, // Scroll for Helmet for HP - Improves MaxHP on hats.\nSuccess rate:60%, MaxHP+10. The success rate of this scroll can be enhanced by Vega's Spell.
        2040005, // Scroll for Helmet for HP - Improves MaxHP on hats.\nSuccess rate:10%, MaxHP+30. The success rate of this scroll can be enhanced by Vega's Spell.
        2040006, // Scroll for Helmet for DEF - Improves helmet def.\nSuccess rate:100%, weapon def.+5, magic def.+3, accuracy+1
        2040007, // Scroll for Helmet for HP - Improves MaxHP on hats.\nSuccess rate:100%, MaxHP+30
        2040008, // Dark scroll for Helmet for DEF - Improves helmet def.\nSuccess rate:70%, weapon def.+2, magic def.+1nIf failed, the item will be destroyed at a 50% rate.
        2040009, // Dark Scroll for Helmet for DEF - Improves the helmet def.\nSuccess rate:30%, weapon def.+5, magic def.+3, accuracy+1nIf failed, the item will be destroyed in a 50% rate.
        2040010, // Scroll for Helmet for HP - Improves MaxHP on hats.\nSuccess Rate:70%, MaxHP+10nIf failed, the item will be destroyed in a 50% rate.
        2040011, // Dark Scroll for Helmet for HP - Improves MaxHP on hats.\nSuccess Rate:30%, MaxHP+30nIf failed, the item will be destroyed in a 50% rate.
        2040018, // Scroll for Helmet for Accuracy - Improves the helmet's accuracy option.\nSuccess Rate 100%, Accuracy +1
        2040019, // Scroll for Helmet for DEF - Improves Weapon Defense on a Helmet.\nSuccess rate: 65%, Weapon Def. +2, Magic Def. +1
        2040020, // Scroll for Helmet for DEF - Improves Weapon Defense on a Helmet.\nSuccess rate: 15%, Weapon Def.+5, Magic Def.+3, Accuracy+1
        2040021, // Scroll for Helmet for MaxHP - Improves MaxHP on a Helmet.\nSuccess rate: 65%, MaxHP +10
        2040022, // Scroll for Helmet for MaxHP - Improves MaxHP on a Helmet.\nSuccess rate: 15%, MaxHP +30
        2040100, // Scroll for Face Accessory for HP - Improves MaxHP on face accessories.\nSuccess rate:10%, MaxHP +30. The success rate of this scroll can be enhanced by Vega's Spell.
        2040101, // Scroll for Face Accessory for HP - Improves MaxHP on face accessories.\nSuccess rate:60%, MaxHP +15. The success rate of this scroll can be enhanced by Vega's Spell.
        2040102, // Scroll for Face Accessory for HP - Improves MaxHP on face accessories.\nSuccess rate:100%, MaxHP +5
        2040103, // Dark Scroll for Face Accessory for HP - Improves MaxHP on face accessories.\nSuccess rate:30%, MaxHP +30 nIf failed, the item will be destroyed at a 50% rate.
        2040104, // Dark Scroll for Face Accessory for HP - Improves MaxHP on face accessories.\nSuccess rate:70%, MaxHP +15 nIf failed, the item will be destroyed at a 50% rate.
        2040107, // Scroll for Face Accessory for Avoidability - Improves avoidability on face accessories.\nSuccess rate:100%, Avoidability +1
        2040201, // Scroll for Eye Accessory for Accuracy - Improves accuracy on eye accessories.\nSuccess rate:60%, Accuracy +2. The success rate of this scroll can be enhanced by Vega's Spell.
        2040202, // Scroll for Eye Accessory for Accuracy - Improves accuracy on eye accessories.\nSuccess rate:100%, Accuracy +1
        2040204, // Dark Scroll for Eye Accessory for Accuracy - Improves accuracy on eye accessories.\nSuccess rate:70%, Accuracy +2 nIf failed, the item will be destroyed at a 50% rate.
        2040308, // Dark Scroll for Earring for DEF - Improves DEF on earringsnSuccess Rate 70%, weapon defense+1, magic defense+1nIf failed, the item will be destroyed at a 50% rate.
        2040309, // Dark Scroll for Earring for DEF - Improves DEF on earringsnSuccess Rate 30%, weapon defense+3, magic defense+3, accuracy+1nIf failed, the item will be destroyed at a 50% rate.
        2040310, // Scroll for Earring for DEF - Improves DEF on earrings.\nSuccess Rate 10%, weapon defense+3, magic defense+3, Accuracy+1. The success rate of this scroll can be enhanced by Vega's Spell.
        2040311, // Scroll for Earring for DEF - Improves DEF on earrings.\nSuccess Rate 60%, weapon defense+1, magic defense+1. The success rate of this scroll can be enhanced by Vega's Spell.
        2040312, // Scroll for Earring for DEF - Improves DEF on earringsnSuccess Rate 100%, weapon defense+1
        2040324, // Scroll for Earring for HP 100% - Improves HP on earrings..\nSuccess rate:100%, MaxHP+5
        2040325, // Scroll for Earring for HP 70% - Improves HP on earrings..\nSuccess rate:70%, MaxHP+15nIf failed, the item will be destroyed at a 50% rate.
        2040326, // Scroll for Earring for HP 60% - Improves HP on earrings.\nSuccess rate:60%, MaxHP+15. The success rate of this scroll can be enhanced by Vega's Spell.
        2040327, // Scroll for Earring for HP 30% - Improves HP on earrings..\nSuccess rate:30%, MaxHP+30nIf failed, the item will be destroyed at a 50% rate.
        2040328, // Scroll for Earring for HP 10% - Improves HP on earrings.\nSuccess rate:10%, MaxHP+30. The success rate of this scroll can be enhanced by Vega's Spell.
        2040400, // Scroll for Topwear for DEF - Improves weapon def. on topwear.\nSuccess rate:100%, weapon def.+1
        2040401, // Scroll for Topwear for DEF - Improves weapon def. on topwear.\nSuccess rate:60%, weapon def.+2, magic def.+1. The success rate of this scroll can be enhanced by Vega's Spell.
        2040402, // Scroll for Topwear for DEF - Improves weapon def. on topwear.\nSuccess rate:10%, weapon def. +5, magic def. +3, MaxHP+10. The success rate of this scroll can be enhanced by Vega's Spell.
        2040403, // Scroll for Topwear for DEF - Improves weapon def. on topwear.\nSuccess rate:100%, weapon def. +5, magic def. +3, MaxHP+10
        2040404, // Dark scroll for Topwear for DEF - Improves weapon def. on topwear.\nSuccess rate:70%, weapon def. +2, magic def. +1nIf failed, the item will be destroyed at a 50% rate.
        2040405, // Dark scroll for Topwear for DEF - Improves weapon def. on topwear.\nSuccess rate:30%, weapon def. +5, magic def. +3, MaxHP+10nIf failed, the item will be destroyed at a 50% rate.
        2040408, // Dark scroll for Topwear for HP - Improves HP on topwear.\nSuccess rate: 70%, MaxHP + 15nIf failed, the item will be destroyed at a 50% rate.
        2040409, // Dark scroll for Topwear for HP - Improves HP on topwear.\nSuccess rate: 30%, MaxHP + 30nIf failed, the item will be destroyed at a 50% rate.
        2040415, // Scroll for Topwear for DEF - Improves Weapon Def. on Topwear.\nSuccess rate: 65%, Weapon Def. +2, Magic Def. +1
        2040416, // Scroll for Topwear for DEF - Improves Weapon Def. on Topwear.\nSuccess rate: 15%, Weapon Def. +5, Magic Def. +3, MaxHP +10
        2040420, // Scroll for Topwear for HP 100% - Improves HP on topwear..Success rate 100%, MaxHP + 5
        2040421, // Scroll for Topwear for HP 60% - Improves HP on topwear.\nSuccess rate 60%, MaxHP + 15. The success rate of this scroll can be enhanced by Vega's Spell.
        2040422, // Scroll for Topwear for HP 10% - Improves HP on topwear.\nSuccess rate 10%, MaxHP + 30. The success rate of this scroll can be enhanced by Vega's Spell.
        2040503, // Scroll for Overall Armor for DEF - Improves weapon def. on the overall armor.\nSuccess rate:100%, weapon def.+1
        2040504, // Scroll for Overall Armor for DEF - Improves def. on the overall armor.\nSuccess rate:60%, weapon def.+2, magic def.+1. The success rate of this scroll can be enhanced by Vega's Spell.
        2040505, // Scroll for Overall Armor for DEF - Improves def. on the overall armor.\nSuccess rate:10%, wepon def. +5, magic def. +3, MaxHP+10. The success rate of this scroll can be enhanced by Vega's Spell.
        2040507, // Scroll for Overall Armor for DEF - Improves weapon def. on the overall armor.\nSuccess rate:30%, weapon def.+5, magic def.+3, MaxHP+10
        2040510, // Dark scroll for Overall Armor for DEF - Improves weapon def. on the overall armor.\nSuccess rate:70%, weapon def.+2, magic def.+1nIf failed, the item will be destroyed at a 50% rate.
        2040511, // Dark scroll for Overall Armor for DEF - Improves weapon def. on the overall armor.\nSuccess rate:30%, weapon def.+5, magic def.+3, MaxHP+10nIf failed, the item will be destroyed at a 50% rate.
        2040524, // Overall Armor Scroll for DEF - Improves Weapon Def. on Overall Armor.\nSuccess rate: 65%, Weapon Def. +2, Magic Def. +1
        2040525, // Overall Armor Scroll for DEF - Improves Weapon Def. on Overall Armor.\nSuccess rate: 15%, Weapon Def. +5, Magic Def. +3, MaxHP +10
        2040600, // Scroll for Bottomwear for DEF - Improves weapon def. on the bottomwear. nSuccess rate:100%, weapon def. +1
        2040601, // Scroll for Bottomwear for DEF - Improves weapon def. on the bottomwear.\nSuccess rate:60%, weapon def. +2, magic def. +1. The success rate of this scroll can be enhanced by Vega's Spell.
        2040602, // Scroll for Bottomwear for DEF - Improves weapon def. on the bottomwear.\nSuccess rate:10%, weapon def.+5, magic def.+3, MaxHP+10. The success rate of this scroll can be enhanced by Vega's Spell.
        2040603, // Scroll for Bottomwear for DEF - Improves weapon def. on the bottomwear.\nSuccess rate:100%, weapon def.+5, magic def.+3, MaxHP+10
        2040604, // Dark scroll for Bottomwear for DEF - Improves weapon def. on the bottomwear.\nSuccess rate:70%, weapon def.+2, magic def.+1nIf failed, the item will be destroyed at a 50% rate.
        2040605, // Dark scroll for Bottomwear for DEF - Improves weapon def. on the bottomwear.\nSuccess rate: 30%, weapon def.+5, magic def. + 3, MaxHP + 10nIf failed, the item will be destroyed at a 50% rate.
        2040606, // Dark scroll for Bottomwear for Jump - Improves jump on the bottomwear.\nSuccess rate: 70%, jump + 2, avoidability + 1nIf failed, the item will be destroyed at a 50% rate.
        2040607, // Dark scroll for Bottomwear for Jump - Improves jump on the bottomwear.\nSuccess rate: 30%. jump + 4, avoidability + 2nIf failed, the item will be destroyed at a 50% rate.
        2040608, // Dark scroll for Bottomwear for HP - Improves HP on the bottomwear.\nSuccess rate: 70%. MaxHP + 15nIf failed, the item will be destroyed at a 50% rate.
        2040609, // Dark scroll for Bottomwear for HP - Improves HP on the bottomwear.\nSuccess rate: 30%. MaxHP + 30nIf failed, the item will be destroyed at a 50% rate.
        2040615, // Scroll for Bottomwear for DEF - Improves weapon def. on bottomwear.\nSuccess rate:65%, weapon def.+2, magic def.+1
        2040616, // Scroll for Bottomwear for DEF - Improves weapon def. on bottomwear.\nSuccess rate:15%, weapon def.+5, magic def.+3, MaxHP+10
        2040617, // Scroll for Bottomwear for Jump 100% - Improves jumping abilities on bottomwears..\nSuccess rate:100%, jump+1
        2040618, // Scroll for Bottomwear for Jump 60% - Improves jumping abilities on bottomwears.\nSuccess rate:60%, jump+2, avoidability+1. The success rate of this scroll can be enhanced by Vega's Spell.
        2040619, // Scroll for Bottomwear for Jump 10% - Improves jumping abilities on bottomwears..\nSuccess rate:10%, jump+4, avoidability+2. The success rate of this scroll can be enhanced by Vega's Spell.
        2040620, // Scroll for Bottomwear for HP 100% - Improves HP on bottomwears..\nSuccess rate:100%, MaxHP+5
        2040621, // Scroll for Bottomwear for HP 60% - Improves HP on bottomwears.\nSuccess rate:60%, MaxHP+15. The success rate of this scroll can be enhanced by Vega's Spell.
        2040622, // Scroll for Bottomwear for HP 10% - Improves HP on bottomwears.\nSuccess rate:10%, MaxHP+30. The success rate of this scroll can be enhanced by Vega's Spell.
        2040700, // Scroll for Shoes for DEX - Improves dexterity on shoes.\nSuccess rate:100%, Avoidability+1
        2040701, // Scroll for Shoes for DEX - Improves dexterity on shoes.\nSuccess rate:60%, Avoidability +2, Accuracy+1. The success rate of this scroll can be enhanced by Vega's Spell.
        2040702, // Scroll for Shoes for DEX - Improves dexterity on shoes.\nSuccess rate:10%, Avoidability +5, accuracy +3, speed+1. The success rate of this scroll can be enhanced by Vega's Spell.
        2040703, // Scroll for Shoes for Jump - Improves jump on shoes.\nSuccess rate:100%, jump +1
        2040706, // Scroll for Shoes for Speed - Improves speed on shoes.\nSuccess rate:100%, speed+1
        2040707, // Scroll for Shoes for Speed - Improves speed on shoes.\nSuccess rate:60%, speed+2
        2040708, // Scroll for Shoes for Speed - Improves speed on shoes.\nSuccess rate:10%, speed+3. The success rate of this scroll can be enhanced by Vega's Spell.
        2040709, // Scroll for Shoes for DEX - Improves DEX on shoes.\nSuccess rate:100%, avoidability+5, accuracy+3, speed+1
        2040711, // Scroll for Shoes for Speed - Improves speed on shoes.\nSuccess rate:100%, speed+3
        2040712, // Dark scroll for Shoes for DEX - Improves DEX on shoes.\nSuccess rate:70%, avoidability+2, accuracy+1nIf failed, the item will be destroyed at a 50% rate.
        2040713, // Dark scroll for Shoes for DEX - Improves DEX on shoes.\nSuccess rate:30%, avoidability+5, accuracy+3, speed+1nIf failed, the item will be destroyed at a 50% rate.
        2040716, // Dark scroll for Shoes for Speed - Improves speed on shoes.\nSuccess rate:70%, speed+2nIf failed, the item will be destroyed at a 50% rate.
        2040717, // Dark scroll for Shoes for Speed - Improves speed on shoes.\nSuccess rate:30%, speed+3nIf failed, the item will be destroyed at a 50% rate.
        2040718, // Scroll for Shoes for DEX - Improves dexterity on shoes.\nSuccess rate:65%, avoidability+2, accuracy+1
        2040719, // Scroll for Shoes for DEX - Improves dexterity on shoes.\nSuccess rate:15%, avoidability+5, accuracy+3, speed+1
        2040722, // Scroll for Shoes for Speed - Improves speed on shoes.\nSuccess rate:65%, speed+2
        2040723, // Scroll for Shoes for Speed - Improves speed on shoes.\nSuccess rate:15%, speed+3
        2040727, // Scroll for Spikes on Shoes 10% - Adds traction to the shoes, which prevents the shoes from slipping on slippery surface.\nSuccess rate:10%, Does not affect the number of upgrades available. The success rate of this scroll can be enhanced by Vega's Spell.
        2040800, // Scroll for Gloves for DEX - Improves dexterity on gloves.\nSuccess rate:100%, accurcacy +1
        2040812, // Dark scroll for Gloves for HP - Improves HP on the glove.\nSuccess rate: 70%, MaxHP+15nIf failed, the item will be destroyed at a 50% rate.
        2040813, // Dark scroll for Gloves for HP - Improves HP on the glove.\nSuccess rate: 30%, MaxHP + 30nIf failed, the item will be destroyed at a 50% rate.
        2040823, // Scroll for Gloves for HP 100% - Improves HP on gloves..\nSuccess rate:100%, MaxHP+5
        2040824, // Scroll for Gloves for HP 60% - Improves HP on gloves.\nSuccess rate:60%, MaxHP+15. The success rate of this scroll can be enhanced by Vega's Spell.
        2040825, // Scroll for Gloves for HP 10% - Improves HP on gloves.\nSuccess rate:10%, MaxHP+30. The success rate of this scroll can be enhanced by Vega's Spell.
        2040900, // Scroll for Shield for DEF - Improves weapon def. on the shield.\nSuccess rate:100%, weapon def. +1
        2040901, // Scroll for Shield for DEF - Improves weapon def. on the shield.\nSuccess rate:60%, weapon def.+2, magic def.+1. The success rate of this scroll can be enhanced by Vega's Spell.
        2040902, // Scroll for Shield for DEF - Improves weapon def. on the shield.\nSuccess rate 10%, weapon def.+5, magic def.+3, MaxHP+10. The success rate of this scroll can be enhanced by Vega's Spell.
        2040903, // Scroll for Shield for DEF - Improves weapon def. on the shield.\nSuccess rate 100%, weapon def.+5, magic def.+3, MaxHP+10
        2040904, // Dark scroll for Shield for DEF - Improves weapon def. on the shield.\nSuccess rate 70%, weapon def.+2, magic def.+1nIf failed, the item will be destroyed at a 50% rate.
        2040905, // Dark scroll for Shield for DEF - Improves weapon def. on the shield.\nSuccess rate 30%, weapon def.+5, magic def.+3, MaxHP+10nIf failed, the item will be destroyed at a 50% rate.
        2040908, // Dark scroll for Shield for HP - Improves HP on the shield.\nSuccess rate: 70%, MaxHP + 15nIf failed, the item will be destroyed at a 50% rate.
        2040909, // Dark scroll for Shield for HP - Improves HP on the shield.\nSuccess rate: 30%, MaxHP + 30nIf failed, the item will be destroyed at a 50% rate.
        2040910, // Scroll for Shield for DEF - Improves weapon defense on the shield.\nSuccess rate:65%, weapon def.+2, magic def.+1
        2040911, // Scroll for Shield for DEF - Improves weapon defense on the shield.\nSuccess rate:15%, weapon def.+5, magic def.+3, MaxHP+10
        2040912, // [4yrAnniv]Scroll for Shield for DEF - Improves weapon defense for Maple Magician shield, Maple warrior shield, and the Maple Shibus shield. nSuccess rate:40%, weapon def.+3, magic def.+2 nIf failed, the item will be destroyed at a 30% rate.
        2040926, // Scroll for Shield for HP 100% - Improves HP on shields..\nSuccess rate:100%, MaxHP+5
        2040927, // Scroll for Shield for HP 60% - Improves HP on shields.\nSuccess rate:60%, MaxHP+15. The success rate of this scroll can be enhanced by Vega's Spell.
        2040928, // Scroll for Shield for HP 10% - Improves HP on shields.\nSuccess rate:10%, MaxHP+30. The success rate of this scroll can be enhanced by Vega's Spell.
        2041000, // Scroll for Cape for Magic Def. - Improves magic def. on the cape.\nSuccess rate:100%, magic def. +1
        2041001, // Scroll for Cape for Magic Def. - Improves magic def. on the cape.\nSuccess rate:60%, magic def.+3, weapon def.+1. The success rate of this scroll can be enhanced by Vega's Spell.
        2041002, // Scroll for Cape for Magic Def. - Improves magic def. on the cape.\nSuccess rate:10%, magic def. +5, weapon def. +3, MaxMP+10. The success rate of this scroll can be enhanced by Vega's Spell.
        2041003, // Scroll for Cape for Weapon Def. - Improves weapon def. on the cape.\nSuccess rate:100%, weapon def.+1
        2041004, // Scroll for Cape for Weapon Def. - Improves weapon def. on the cape.\nSuccess rate:60%, weapon def.+3, magic def. +1. The success rate of this scroll can be enhanced by Vega's Spell.
        2041005, // Scroll for Cape for Weapon Def. - Improves weapon def. on the cape.\nSuccess rate:10%, weapon def. +5, magic def.+3, MaxHP+10. The success rate of this scroll can be enhanced by Vega's Spell.
        2041006, // Scroll for Cape for HP - Improves MaxHP on the cape.\nSuccess rate:100%, MaxHP+5
        2041007, // Scroll for Cape for HP - Improves MaxHP on the cape.\nSuccess rate:60%, MaxHP+10. The success rate of this scroll can be enhanced by Vega's Spell.
        2041008, // Scroll for Cape for HP - Improves MaxHP on the cape.\nSuccess rate:10%, MaxHP+20. The success rate of this scroll can be enhanced by Vega's Spell.
        2041009, // Scroll for Cape for MP - Improves MaxMP on the cape.\nSuccess rate:100%, MaxMP+5
        2041010, // Scroll for Cape for MP - Improves MaxMP on the cape.\nSuccess rate:60%, MaxMP+10. The success rate of this scroll can be enhanced by Vega's Spell.
        2041011, // Scroll for Cape for MP - Improves MaxMP on the cape.\nSuccess rate:10%, MaxMP+20. The success rate of this scroll can be enhanced by Vega's Spell.
        2041024, // Scroll for Cape for Magic Def. - Improves magic def. on the cape.\nSuccess rate:100%, magic def.+5, weapon def.+3, MaxMP+10
        2041025, // Scroll for Cape for Weapon Def. - Improves weapon def. on the cape.\nSuccess rate:100%, weapon def.+5, magic def.+3, MaxHP+10
        2041026, // Dark scroll for Cape for Magic Def. - Improves magic def. on the cape.\nSuccess rate:70%, magic def.+3, weapon def.+1nIf failed, the item will be destroyed at a 50% rate.
        2041027, // Dark scroll for Cape for Magic Def. - Improves magic def. on the cape.\nSuccess rate:30%, magic def.+5, weapon def.+3, MaxMP+10nIf failed, the item will be destroyed at a 50% rate.
        2041028, // Dark scroll for Cape for Weapon Def. - Improves weapon def. on the cape.\nSuccess rate:70%, weapon def.+3, magic def.+1nIf failed, the item will be destroyed at a 50% rate.
        2041029, // Dark scroll for Cape for Weapon Def. - Improves weapon def. on the cape.\nSuccess rate:30%, weapon def.+5, magic def.+3, MaxHP+10nIf failed, the item will be destroyed at a 50% rate.
        2041030, // Dark scroll for Cape for HP - Improves MaxHP on the cape.\nSuccess rate:70%, MaxHP+10nIf failed, the item will be destroyed at a 50% rate.
        2041031, // Dark scroll for Cape for HP - Improves MaxHP on the cape.\nSuccess rate:30%, MaxHP+20nIf failed, the item will be destroyed at a 50% rate.
        2041032, // Dark scroll for Cape for MP - Improves MaxMP on the cape.\nSuccess rate:70%, MaxMP+10nIf failed, the item will be destroyed at a 50% rate.
        2041033, // Dark scroll for Cape for MP - Improves MaxMP on the cape.\nSuccess rate:30%, MaxMP+20nIf failed, the item will be destroyed at a 50% rate.
        2041042, // Scroll for Cape for Magic DEF - Improves magic defense on the cape.\nSuccess rate:65%, magic def.+3, weapon def.+1
        2041043, // Scroll for Cape for Magic DEF - Improves magic defense on the cape.\nSuccess rate:15%, magic def.+5, weapon def.+3, MaxMP+10
        2041044, // Scroll for Cape for Weapon DEF - Improves weapon defense on the cape.\nSuccess rate:65%, weapon def.+3, magic def.+1
        2041045, // Scroll for Cape for Weapon DEF - Improves weapon defense on the cape.\nSuccess rate:15%, weapon def.+5, magic def.+3, MaxHP+10
        2041046, // Scroll for Cape for MaxHP - Improves MaxHP on the cape.\nSuccess rate:65%, MaxHP+10
        2041047, // Scroll for Cape for MaxHP - Improves MaxHP on the cape.\nSuccess rate:15%, MaxHP+20
        2041048, // Scroll for Cape for MP - Improves MaxMP on the cape.\nSuccess rate:65%, MaxMP+10
        2041049, // Scroll for Cape for MP - Improves MaxMP on the cape.\nSuccess rate:15%, MaxMP+20
        2041058, // Scroll for Cape for Cold Protection 10% - Includes the effect of protection from cold weather on the cape.\nSuccess rate: 10%. Does not affect the number of upgrades available. The success rate of this scroll can be enhanced by Vega's Spell.
        2041200, // Dragon Stone - A powerful stone that contains the mysterious power of the dragon. Can only be used on Horntail Necklace.\nSuccess rate:100%, Weapon Defense +140, Magic Defense +140, Avoidability +15, All Stats +15
        2041212, // Rock of Wisdom - Can only be used on Horus's Eye.\nSuccess rate:60%, HP +70, MP +70
        2043015, // Scroll for One-Handed Sword for Accuracy 100% - Improves accuracy on one-handed swords.\nSuccess rate:100%, accuracy+1
        2043110, // Scroll for One-Handed Axe for Accuracy 100% - Improves accuracy on one-handed axe.\nSuccess rate:100%, accuracy+1
        2043210, // Scroll for One-Handed BW for Accuracy 100% - Improves accuracy on one-handed blunt weapon.\nSuccess rate:100%, accuracy+1
        2044010, // Scroll for Two-Handed Sword for Accuracy 100% - Improves accuracy on two-handed swords.\nSuccess rate:100%, accuracy+1
        2044110, // Scroll for Two-Handed Axe for Accuracy 100% - Improves accuracy on two-handed axe.\nSuccess rate:100%, accuracy+1
        2044210, // Scroll for Two-Handed BW for Accuracy 100% - Improves accuracy on two-handed blunt weapon.\nSuccess rate:100%, accuracy+1
        2044310, // Scroll for Spear for Accuracy 100% - Improves accuracy on spears.\nSuccess rate:100%, accuracy+1
        2044410, // Scroll for Pole-Arm for Accuracy 100% - Improves accuracy on pole-arms.\nSuccess rate:100%, accuracy+1
        2044805, // Scroll for Knuckle for Accuracy 100% - Improves accuracy on knuckles.\nSuccess rate:100%, accuracy+1
        2048000, // Scroll for Pet Equip. for Speed - Improves speed on pet equip.\nSuccess rate:100%, speed+1
        2048001, // Scroll for Pet Equip. for Speed - Improves speed on pet equip.\nSuccess rate:60%, moving speed+2. The success rate of this scroll can be enhanced by Vega's Spell.
        2048002, // Scroll for Pet Equip. for Speed - Improves speed on pet equip.\nSuccess rate:10%, moving speed+3. The success rate of this scroll can be enhanced by Vega's Spell.
        2048003, // Scroll for Pet Equip. for Jump - Improves jump on pet equip.\nSuccess rate:100%, jump+1
        2048004, // Scroll for Pet Equip. for Jump - Improves jump on pet equip.\nSuccess rate:60%, jump+2. The success rate of this scroll can be enhanced by Vega's Spell.
        2048005, // Scroll for Pet Equip. for Jump - Improves jump on pet equip.\nSuccess rate:10%, jump+3. The success rate of this scroll can be enhanced by Vega's Spell.
        2048006, // Scroll for Pet Equip. for Speed - Improves speed on Pet Equip. nSuccess rate:65%, speed+2
        2048007, // Scroll for Pet Equip. for Speed - Improves speed on Pet Equip. nSuccess rate:15%, speed+3
        2048008, // Scroll for Pet Equip. for Jump - Improves jump on Pet equip. nSuccess rate:65%, jump+2
        2048009, // Scroll for Pet Equip. for Jump - Improves jump on Pet equip. nSuccess rate:15%, jump+3
        2041066, // Scroll for Cape for Magic DEF 100% - Improves magic def. on the cape.\nSuccess rate:100%, magic def.+3, weapon def.+2
        2041067, // Scroll for Cape for Weapon DEF 100% - Improves weapon def. on the cape.\nSuccess rate:100%, weapon def.+3, magic def. +2
        2040936, // Scroll for Shield for DEF 100% - Improves weapon def. on the shield.\nSuccess rate:100%, weapon def.+2, magic def.+3
        2040740, // Scroll for Shoes for DEX 100% - Improves dexterity on shoes.\nSuccess rate:100%, Avoidability +2, Accuracy+3
        2040742, // Scroll for Shoes for Speed 100% - Improves speed on shoes.\nSuccess rate:100%, speed+2
        2040630, // Scroll for Bottomwear for DEF 100% - Improves weapon def. on the bottomwear.\nSuccess rate:100%, weapon def. +2, magic def. +3
        2040539, // Scroll for Overall Armor for DEF 100% - Improves def. on the overall armor.\nSuccess rate:100%, weapon def.+2, magic def.+3
        2040430, // Scroll for Topwear for DEF 100% - Improves weapon def. on topwear.\nSuccess rate:100%, weapon def.+2, magic def.+3
        2040041, // Scroll for Helmet for DEF 100% - Improves helmet def.\nSuccess rate:100%, weapon def.+2, magic def., +3
        2040042, // Scroll for Helmet for HP 100% - Improves MaxHP on hats.\nSuccess rate:100%, MaxHP+15
        2041068, // Scroll for Cape for Magic Def. 50% - Improves magic def. on the cape.\nSuccess rate:50%, magic def. +5, weapon def. +4
        2041069, // Scroll for Cape for Weapon Def. 50% - Improves weapon def. on the cape.\nSuccess rate:50%, weapon def. +5, magic def.+4
        2040943, // Scroll for Shield for DEF 50% - Improves weapon def. on the shield.\nSuccess rate 50%, weapon def.+5, magic def.+4
        2040755, // Scroll for Shoes for DEX 50% - Improves dexterity on shoes.\nSuccess rate:50%, Avoidability +3, accuracy +3, speed+2
        2040756, // Scroll for Shoes for Jump 50% - Improves jump on shoes.\nSuccess rate:50%, jump+6, speed+1
        2040757, // Scroll for Shoes for Speed 50% - Improves speed on shoes.\nSuccess rate:50%, speed+3, jump+1
        2040629, // Scroll for Bottomwear for DEF 50% - Improves weapon def. on the bottomwear.\nSuccess rate:50%, weapon def.+5, magic def.+4
        2040543, // Scroll for Overall Armor for DEF 50% - Improves def. on the overall armor.\nSuccess rate:50%, wepon def. +5, magic def. +4
        2040429, // Scroll for Topwear for DEF 50% - Improves weapon def. on topwear.\nSuccess rate:50%, weapon def. +5, magic def. +4
        2040045, // Scroll for Helmet for DEF 50% - Improves helmet def.\nSuccess Rate:50%, weapon def.+5, magic def.+4
        2040046, // Scroll for Helmet for HP 50% - Improves MaxHP on hats.\nSuccess rate:50%, MaxHP+35
        2049112, // King Pepe's 100% Scroll for Weapons - Improves or decreases the effectiveness of King Pepe weapons.\nSuccess Rate: 100%
        2049208, // Dark Scroll for Accessory for HP 70% - Improves MaxHP on Accessories (Pendants, Belts, Rings).\nSuccess Rate: 70%, MaxHP+10\nIf failed, the item will be destroyed at a 50% rate.
        2049209, // Dark Scroll for Accessory for HP 30% - Improves MaxHP on Accessories (Pendants, Belts, Rings).\nSuccess Rate: 30%, MaxHP+30\nIf failed, the item will be destroyed at a 50% rate.
        2049210, // Dark Scroll for Accessory for MP 70% - Improves MaxMP on Accessories (Pendants, Belts, Rings).\nSuccess Rate: 70%, MaxMP+10\nIf failed, the item will be destroyed at a 50% rate.
        2049211, // Dark Scroll for Accessory for MP 30% - Improves MaxMP on Accessories (Pendants, Belts, Rings).\nSuccess Rate: 30%, MaxMP+30\nIf failed, the item will be destroyed at a 50% rate.
        2040939, // Scroll for Shield for HP 65% - Improves HP on Shields.\nSuccess Rate: 65%, MaxHP+15
        2040940, // Scroll for Shield for HP 15% - Improves HP on Shields.\nSuccess Rate: 15%, MaxHP+30
        2040831, // Scroll for Gloves for HP 65% - Improves HP on Gloves.\nSuccess Rate: 65%, MaxHP+15
        2040832, // Scroll for Gloves for HP 15% - Improves HP on Gloves.\nSuccess Rate: 15%, MaxHP+30
        2040631, // Scroll for Bottomwear for Jump 65% - Improves Jump on Bottomwear.\nSuccess Rate: 65%, Jump+2, Avoidability+1
        2040632, // Scroll for Bottomwear for Jump 15% - Improves Jump on Bottomwear.\nSuccess Rate: 15%, Jump+4, Avoidability+2
        2040633, // Scroll for Bottomwear for HP 65% - Improves HP on Bottomwear.\nSuccess Rate: 65%, MaxHP+15
        2040634, // Scroll for Bottomwear for HP 15% - Improves HP on Bottomwear.\nSuccess Rate: 15%, MaxHP+30
        2040433, // Scroll for Topwear for HP 65% - Improves HP on Topwear.\nSuccess Rate 65%, MaxHP + 15
        2040434, // Scroll for Topwear for HP 15% - Improves HP on Topwear.\nSuccess Rate 15%, MaxHP + 30
        2040339, // Scroll for Earring for HP 65% - Improves HP on Earrings.\nSuccess Rate: 65%, MaxHP+15
        2040340 // Scroll for Earring for HP 15% - Improves HP on Earrings.\nSuccess Rate: 15%, MaxHP+30
);

    static {
        // i ain't going to open one gigantic itemid cache just for 4 perma itemids, no way!
        for (int petItemId : ItemId.getPermaPets()) {
            permanentItemids.add(petItemId);
        }
    }

    public static int getFlagByInt(int type) {
        if (type == 128) {
            return PET_COME;
        } else if (type == 256) {
            return ACCOUNT_SHARING;
        }
        return 0;
    }

    public static boolean isThrowingStar(int itemId) {
        return itemId / 10000 == 207;
    }

    public static boolean isBullet(int itemId) {
        return itemId / 10000 == 233;
    }

    public static boolean isPotion(int itemId) {
        return itemId / 1000 == 2000;
    }

    public static boolean isFood(int itemId) {
        int useType = itemId / 1000;
        return useType == 2022 || useType == 2010 || useType == 2020;
    }

    public static boolean isConsumable(int itemId) {
        return isPotion(itemId) || isFood(itemId);
    }

    public static boolean isRechargeable(int itemId) {
        return isThrowingStar(itemId) || isBullet(itemId);
    }

    public static boolean isArrowForCrossBow(int itemId) {
        return itemId / 1000 == 2061;
    }

    public static boolean isArrowForBow(int itemId) {
        return itemId / 1000 == 2060;
    }

    public static boolean isArrow(int itemId) {
        return isArrowForBow(itemId) || isArrowForCrossBow(itemId);
    }

    public static boolean isPet(int itemId) {
        return itemId / 1000 == 5000;
    }

    public static boolean isExpirablePet(int itemId) {
        return YamlConfig.config.server.USE_ERASE_PET_ON_EXPIRATION || itemId == ItemId.PET_SNAIL;
    }

    public static boolean isPermanentItem(int itemId) {
        return permanentItemids.contains(itemId);
    }

    public static boolean isNewYearCardEtc(int itemId) {
        return itemId / 10000 == 430;
    }

    public static boolean isNewYearCardUse(int itemId) {
        return itemId / 10000 == 216;
    }

    public static boolean isAccessory(int itemId) {
        return itemId >= 1110000 && itemId < 1140000;
    }

    public static boolean isTaming(int itemId) {
        int itemType = itemId / 1000;
        return itemType == 1902 || itemType == 1912;
    }

    public static boolean isTownScroll(int itemId) {
        return itemId >= 2030000;
    }

    public static boolean isCleanSlate(int scrollId) {
        return scrollId > 2048999 && scrollId < 2049004;
    }

    public static boolean isModifierScroll(int scrollId) {
        return scrollId == ItemId.SPIKES_SCROLL || scrollId == ItemId.COLD_PROTECTION_SCROLl;
    }

    public static boolean isNonDpsScroll(int scrollId) {
        return NON_DPS_SCROLL_IDS.contains(scrollId);
    }

    public static boolean isFlagModifier(int scrollId, short flag) {
        if (scrollId == ItemId.COLD_PROTECTION_SCROLl && ((flag & ItemConstants.COLD) == ItemConstants.COLD)) {
            return true;
        }
        return scrollId == ItemId.SPIKES_SCROLL && ((flag & ItemConstants.SPIKES) == ItemConstants.SPIKES);
    }

    public static boolean isChaosScroll(int scrollId) {
        return scrollId >= 2049100 && scrollId <= 2049103;
    }

    public static boolean isRateCoupon(int itemId) {
        int itemType = itemId / 1000;
        return itemType == 5211 || itemType == 5360;
    }

    public static boolean isExpCoupon(int couponId) {
        return couponId / 1000 == 5211;
    }

    public static boolean isPartyItem(int itemId) {
        return itemId >= 2022430 && itemId <= 2022433 || itemId >= 2022160 && itemId <= 2022163;
    }

    public static boolean isHiredMerchant(int itemId) {
        return itemId / 10000 == 503;
    }

    public static boolean isPlayerShop(int itemId) {
        return itemId / 10000 == 514;
    }

    public static boolean isBannedItem(int itemId) {
        return itemId == 5220000 || // Gachapon Ticket
                itemId == 5220010 || // Gachapon for slot machines
                itemId == 5220020 || // Gachapon for Net Cafe
                itemId == 5451000 || // Remote Gachapon Ticket
                itemId == 5610000 || // Vega's Spell(10%)
                itemId == 5610001 || // Vega's Spell(60%)
                itemId == 5222000; // Cash Shop Surprise
    }

    public static InventoryType getInventoryType(final int itemId) {
        if (inventoryTypeCache.containsKey(itemId)) {
            return inventoryTypeCache.get(itemId);
        }

        InventoryType ret = InventoryType.UNDEFINED;

        final byte type = (byte) (itemId / 1000000);
        if (type >= 1 && type <= 5) {
            ret = InventoryType.getByType(type);
        }

        inventoryTypeCache.put(itemId, ret);
        return ret;
    }

    public static boolean isMakerReagent(int itemId) {
        return itemId / 10000 == 425;
    }

    public static boolean isOverall(int itemId) {
        return itemId / 10000 == 105;
    }

    public static boolean isCashStore(int itemId) {
        int itemType = itemId / 10000;
        return itemType == 503 || itemType == 514;
    }

    public static boolean isMapleLife(int itemId) {
        int itemType = itemId / 10000;
        return itemType == 543 && itemId != 5430000;
    }

    public static boolean isWeapon(int itemId) {
        return itemId >= 1302000 && itemId < 1493000;
    }

    public static boolean isEquipment(int itemId) {
        return itemId < 2000000 && itemId != 0;
    }

    public static boolean isFishingChair(int itemId) {
        return itemId == ItemId.FISHING_CHAIR;
    }

    public static boolean isMedal(int itemId) {
        return itemId >= 1140000 && itemId < 1143000;
    }

    public static boolean isFace(int itemId) {
        return itemId >= 20000 && itemId < 22000;
    }

    public static boolean isHair(int itemId) {
        return itemId >= 30000 && itemId < 35000;
    }
}
