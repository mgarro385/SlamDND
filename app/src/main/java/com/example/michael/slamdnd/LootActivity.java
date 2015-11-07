package com.example.michael.slamdnd;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class LootActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loot);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }



}

//Individual Treasure
enum ITtier1{
    //these rolls are straight from the Monster Manual
    ROLL1(1, 30, 'c', "5d6", 1),
    ROLL2(31, 70, 's', "4d6", 1),
    ROLL3(71, 95, 'g', "3d6", 1),
    ROLL4(96, 100, 'p', "1d6", 1);

    int low;
    int high;
    char currency;
    String roll;
    int mod;

    ITtier1(int low, int high, char currency, String roll, int mod){
        this.low = low;
        this.high = high;
        this.currency = currency;
        this.roll = roll;
        this.mod = mod;
    }
}

enum ITtier2{
    //these rolls are straight from the Monster Manual
    ROLL1(1, 30, 'c', "4d6", 100),
    ROLL2(31, 70, 's', "8d6", 10),
    ROLL3(71, 95, 'g', "4d6", 10),
    ROLL4(96, 100, 'p', "4d6", 1);

    int low;
    int high;
    char currency;
    String roll;
    int mod;

    ITtier2(int low, int high, char currency, String roll, int mod){
        this.low = low;
        this.high = high;
        this.currency = currency;
        this.roll = roll;
        this.mod = mod;
    }
}


enum ITtier3{
    //these rolls are straight from the Monster Manual
    ROLL1(1, 20, 'g', "2d6", 100),
    ROLL2(21, 35, 'g', "3d6", 100),
    ROLL3(36, 75, 'p', "2d6", 10),
    ROLL4(76, 100, 'p', "3d6", 10);

    int low;
    int high;
    char currency;
    String roll;
    int mod;

    ITtier3(int low, int high, char currency, String roll, int mod){
        this.low = low;
        this.high = high;
        this.currency = currency;
        this.roll = roll;
        this.mod = mod;
    }
}


enum ITtier4{
    //these rolls are straight from the Monster Manual
    ROLL1(1, 15, 'g', "9d6", 100),
    ROLL2(16, 55, 'p', "2d6", 100),
    ROLL3(56, 100, 'p', "3d6", 100);

    int low;
    int high;
    char currency;
    String roll;
    int mod;

    ITtier4(int low, int high, char currency, String roll, int mod){
        this.low = low;
        this.high = high;
        this.currency = currency;
        this.roll = roll;
        this.mod = mod;
    }
}


//All the fucking magic items
//Jesus christ theres too many
enum MagicTableA{
    Item1(1, 50, "Potion of healing"),
    Item2(51, 60, "Spell scroll (cantrip)"),
    Item3(61, 70, "Potion of climbing"),
    Item4(71, 90, "Spell scroll (1st level)"),
    Item5(91, 94, "Spell scroll (2nd level)"),
    Item6(95, 98, "Potion of greater healing"),
    Item7(99, 99, "Bag of holding"),
    Item8(100, 100, "Driftglobe");

    int low;
    int high;
    String name;
    MagicTableA(int low, int high, String name){
        this.low = low;
        this.high = high;
        this.name = name;
    }
}

enum MagicTableB{
    Item1(1, 15, "Potion of greater healing"),
    Item2(16, 22, "Potion of fire breath"),
    Item3(23, 29, "Potion of resistance"),
    Item4(30, 34, "Ammunition, +1"),
    Item5(35, 39, "Potion of animal friendship"),
    Item6(40, 44, "Potion of hill giant strength"),
    Item7(45, 49, "Potion of growth"),
    Item8(50, 54, "Potion of water breathing"),
    Item9(55, 59, "Spell scroll (2nd level)"),
    Item10(60, 64, "Spell scroll (3rd level)"),
    Item11(65, 67, "Bag of holding"),
    Item12(68, 70, "Keoghtom's ointment"),
    Item13(71, 73, "Oil of slipperiness"),
    Item14(74, 75, "Dust  of disappearance"),
    Item15(76, 77, "Dust of dryness"),
    Item16(78, 79, "Dust of sneezing and choking"),
    Item17(80, 81, "Elemental gem"),
    Item18(82, 83, "Philter of love"),
    Item19(84, 84, "Alchemy jug"),
    Item20(85, 85, "Cap of water breathing"),
    Item21(86, 86, "Cloak of the manta ray"),
    Item22(87, 87, "Driftglobe"),
    Item23(88, 88, "Goggles of night"),
    Item24(89, 89, "Helm of comprehending languages"),
    Item25(90, 90, "Immovable rod"),
    Item26(91, 91, "Lantern of revealing"),
    Item27(92, 92, "Mariner's armor"),
    Item28(93, 93, "Mithral armor"),
    Item29(94, 94, "Potion of poison"),
    Item30(95, 95, "Ring of swimming"),
    Item31(96, 96, "Robe of useful items"),
    Item32(97, 97, "Rope of climbing"),
    Item33(98, 98, "Saddle of the cavalier"),
    Item34(99, 99, "Wand of magic detection"),
    Item35(100, 100, "Wand of secrets");

    int low;
    int high;
    String name;
    MagicTableB(int low, int high, String name){
        this.low = low;
        this.high = high;
        this.name = name;
    }
}

enum MagicTableC{
    Item1(1, 15, "Potion of superior healing"),
    Item2(16, 22, "Spell scroll (4th level)"),
    Item3(23, 27, "Ammunition, +2"),
    Item4(28, 32, "Poition of clairvoyance"),
    Item5(33, 37, "Potion of diminition"),
    Item6(38, 42, "Potion of gaseous form"),
    Item7(43, 47, "Potion of frost giant strength"),
    Item8(48, 52, "Potion of stone giant strength"),
    Item9(53, 57, "Potion of heroism"),
    Item10(58, 62, "Potion of invulnerability"),
    Item11(63, 67, "Potion of mind reading"),
    Item12(68, 72, "Spell scroll (5th level)"),
    Item13(73, 75, "Elixir of health"),
    Item14(76, 78, "Oil of etheralness"),
    Item15(79, 81, "Poition of fire giant strength"),
    Item16(82, 84, "Quaal's feather token"),
    Item17(85, 87, "Scroll of protection"),
    Item18(88, 89, "Bag of beans"),
    Item19(90, 91, "Bead of force"),
    Item20(92, 92, "Chime of opening"),
    Item21(93, 93, "Decanter of endless water"),
    Item22(94, 94, "Eyes of minute seeing"),
    Item23(95, 95, "Folding boat"),
    Item24(96, 96, "Heward's handy haversack"),
    Item25(97, 97, "Horseshoes of speed"),
    Item26(98, 98, "Necklace of fireballs"),
    Item27(99, 99, "Periapt of health"),
    Item28(100, 100, "Sending stones");


    int low;
    int high;
    String name;
    MagicTableC(int low, int high, String name){
        this.low = low;
        this.high = high;
        this.name = name;
    }
}

enum MagicTableD{
    Item1(1, 20, "Potion of supreme healing"),
    Item2(21, 30, "Potion of invisibility"),
    Item3(31, 40, "Potion of speed"),
    Item4(41, 50, "Spell scroll (6th level)"),
    Item5(51, 57, "Spell scroll (7th level)"),
    Item6(58, 62, "Ammunition, +3"),
    Item7(63, 67, "Oil of sharpness"),
    Item8(68, 72, "Potion of flying"),
    Item9(73, 77, "Potion of cloud giant strength"),
    Item10(78, 82, "Potion of longevity"),
    Item11(83, 87, "Potion of vitality"),
    Item12(88, 92, "Spell scroll (8th level)"),
    Item13(93, 95, "Horseshoes of a zephyr"),
    Item14(96, 98, "Nolzur's marvelous pigments"),
    Item15(99, 99, "Bag of devouring"),
    Item16(100, 100, "Portable hole");


    int low;
    int high;
    String name;
    MagicTableD(int low, int high, String name){
        this.low = low;
        this.high = high;
        this.name = name;
    }
}

enum MagicTableE{
    Item1(1, 30, "Spell scroll (8th level)"),
    Item2(31, 55, "Potion of storm giant strength"),
    Item3(56, 70, "Potion of supreme healing"),
    Item4(71, 85, "Spell scroll (9th level)"),
    Item5(86, 93, "Universal solvent"),
    Item6(94, 98, "Array of slaying"),
    Item7(99, 100, "Soverign glue");

    int low;
    int high;
    String name;
    MagicTableE(int low, int high, String name){
        this.low = low;
        this.high = high;
        this.name = name;
    }
}


enum MagicTableF{
    Item1(1, 15, "Weapon, +1"),
    Item2(16, 18, "Shield, +1"),
    Item3(19, 21, "Sentinel Shield"),
    Item4(22, 23, "Amulet of proof against detection and location"),
    Item5(24, 25, "Boots of elvenkind"),
    Item6(26, 27, "Boots of striding and springing"),
    Item7(28, 29, "Bracers of archery"),
    Item8(30, 31, "Brooch of shielding"),
    Item9(32, 33, "Broom of flying"),
    Item10(34, 35, "Cloak of elvenkind"),
    Item11(36, 37, "Cloak of protection"),
    Item12(38, 39, "Gauntlets of ogre power"),
    Item13(40, 41, "Hat of disguise"),
    Item14(42, 43, "Javelin of lightning"),
    Item15(44, 45, "Pearl of power"),
    Item16(46, 47, "Rod of the pact keeper, +1"),
    Item17(48, 49, "Slippers of spider climbing"),
    Item18(50, 51, "Staff of the adder"),
    Item19(52, 53, "Staff of the python"),
    Item20(54, 55, "Sword of vengeance"),
    Item21(56, 57, "Trident of fish command"),
    Item22(58, 59, "Wand of magic missiles"),
    Item23(60, 61, "Wand of the war mage, +1"),
    Item24(62, 63, "Wand of web"),
    Item25(64, 65, "Weapon of warning"),
    Item26(66, 66, "Adamantine armor (chain mail)"),
    Item27(67, 67, "Adamantine armor (chain shirt)"),
    Item28(68, 68, "Adamantine armor (scale mail)"),
    Item29(69, 69, "Bag of tricks (gray)"),
    Item30(70, 70, "Bag of tricks (rust)"),
    Item31(71, 71, "Bag of tricks (tan)"),
    Item32(72, 72, "Boots of the winterlands"),
    Item33(73, 73, "Circlet of blasting"),
    Item34(74, 74, "Deck of illusions"),
    Item35(75, 75, "Eversmoking bottle"),
    Item36(76, 76, "Eyes of charming"),
    Item37(77, 77, "Eyes of the eagle"),
    Item38(78, 78, "Figurine of wondrous power (silver raven)"),
    Item39(79, 79, "Gem of brightness"),
    Item40(80, 80, "Gloves of missile snaring"),
    Item41(81, 81, "Gloves of swimming and climbing"),
    Item42(82, 82, "Gloves of thievery"),
    Item43(83, 83, "Headband of intellect"),
    Item44(84, 84, "Helm of telepathy"),
    Item45(85, 85, "Instrument of the bards (Doss lute)"),
    Item46(86, 86, "Instrument of the bards (Fochlucan bandore)"),
    Item47(87, 87, "Instrument of the bards (Mac-Fuimidh cittern)"),
    Item48(88, 88, "Medallion of thoughts"),
    Item49(89, 89, "Necklace of adaptation"),
    Item50(90, 90, "Periapt of wound closure"),
    Item51(91, 91, "Pipes of haunting"),
    Item52(92, 92, "Pipes of the sewers"),
    Item53(93, 93, "Ring of jumping"),
    Item54(94, 94, "Ring of mind shielding"),
    Item55(95, 95, "Ring of warmth"),
    Item56(96, 96, "Ring of water walking"),
    Item57(97, 97, "Quiver of Ehlonna"),
    Item58(98, 98, "Stone of good luck"),
    Item59(99, 99, "Wind fan"),
    Item60(100, 100, "Winged boots");

    int low;
    int high;
    String name;
    MagicTableF(int low, int high, String name){
        this.low = low;
        this.high = high;
        this.name = name;
    }
}

enum MagicTableG{
    Item1(1, 11, "Weapon, +2"),
    Item2(12, 14, "Figurine of wondrous power"),
    Item3(15, 15, "Adamantine armor (beastplate)"),
    Item4(16, 16, "Adamantine armor (splint)"),
    Item5(17, 17, "Amulet of health"),
    Item6(18, 18, "Armor of vulnerability"),
    Item7(19, 19, "Arrow-catching shield"),
    Item8(20, 20, "Belt of dwarvenkind"),
    Item9(21, 21, "Belt of hill giant strength"),
    Item10(22, 22, "Berserker axe"),
    Item11(23, 23, "Boots of levitation"),
    Item12(24, 24, "Boots of speed"),
    Item13(25, 25, "Bowl of commanding water elements"),
    Item14(26, 26, "Bracers of defense"),
    Item15(27, 27, "Brazier of commanding fire elements"),
    Item16(28, 28, "Cape of the mountebank"),
    Item17(29, 29, "Censor of controlling air elements"),
    Item18(30, 30, "Armor, +1 chain mail"),
    Item19(31, 31, "Armor of resistance (chain mail)"),
    Item20(32, 32, "Armor, +1 chain shirt"),
    Item21(33, 33, "Armor of resistance (chain shirt)"),
    Item22(34, 34, "Cloak of displacement"),
    Item23(35, 35, "Cloak of the bat"),
    Item24(36, 36, "Cube of force"),
    Item25(37, 37, "Daern's instant fortress"),
    Item26(38, 38, "Dagger of venom"),
    Item27(39, 39, "Dimensional shackles"),
    Item28(40, 40, "Dragon slayer"),
    Item29(41, 41, "Elven chain"),
    Item30(42, 42, "Flame tongue"),
    Item31(43, 43, "Gem of seeing"),
    Item32(44, 44, "Giant slayer"),
    Item33(45, 45, "Glamoured studded leather"),
    Item34(46, 46, "Helm of teleportation"),
    Item35(47, 47, "Horn of blasting"),
    Item36(48, 48, "Horn of Valhalla"),
    Item37(49, 49, "Instrument of the bards (Canaith mandolin)"),
    Item38(50, 50, "Instrument of the bards (Cli lyre)"),
    Item39(51, 51, "Ioun stone (awareness)"),
    Item40(52, 52, "Ioun stone (protection)"),
    Item41(53, 53, "Ioun stone (reserve)"),
    Item42(54, 54, "Ioun stone (sustenance)"),
    Item43(55, 55, "Iron bands of Bilarro"),
    Item44(56, 56, "Armor, +1 leather"),
    Item45(57, 57, "Armor fo resistane (leather)"),
    Item46(58, 58, "Mace of disruption"),
    Item47(59, 59, "Mace of smithing"),
    Item48(60, 60, "Mace of terror"),
    Item49(61, 61, "Mantle of spell resistance"),
    Item50(62, 62, "Necklance of prayer beads"),
    Item51(63, 63, "Periapt of proof against poison"),
    Item52(64, 64, "Ring of animal influence"),
    Item53(65, 65, "Ring of evasion"),
    Item54(66, 66, "Ring of feather falling"),
    Item55(67, 67, "Ring of free action"),
    Item56(68, 68, "Ring of protection"),
    Item57(69, 69, "Ring of resistance"),
    Item58(70, 70, "Ring of spell storing"),
    Item59(71, 71, "Ring of the ram"),
    Item60(72, 72, "Ring of X-ray vision"),
    Item61(73, 73, "Robe of eyes"),
    Item62(74, 74, "Rod of rulership"),
    Item63(75, 75, "Rod of the pact keeper, +2"),
    Item64(76, 76, "Rope of entanglement"),
    Item65(77, 77, "Armor, +1 scale mail"),
    Item66(78, 78, "Armor of resistance (scale mail)"),
    Item67(79, 79, "Shield, +2"),
    Item68(80, 80, "Shield of missile attraction"),
    Item69(81, 81, "Staff of charming"),
    Item70(82, 82, "Staff of healing"),
    Item71(83, 83, "Staff of swarming insects"),
    Item72(84, 84, "Staff of the woodlands"),
    Item73(85, 85, "Staff of withering"),
    Item74(86, 86, "Stone of controlling earth elements"),
    Item75(87, 87, "Sun blade"),
    Item76(88, 88, "Sword of life stealing"),
    Item77(89, 89, "Sword of wounding"),
    Item78(90, 90, "Tentacle rod"),
    Item79(91, 91, "Vicious weapon"),
    Item80(92, 92, "Wand of binding"),
    Item81(93, 93, "Wand of enemy detection"),
    Item82(94, 94, "Wand of fear"),
    Item83(95, 95, "Wand of fireballs"),
    Item84(96, 96, "Wand of lightning bolts"),
    Item85(97, 97, "Wand of paralysis"),
    Item86(98, 98, "Wand of the war mage, +2"),
    Item87(99, 99, "Wand of wonder"),
    Item88(100, 100, "Wings of flying");

    int low;
    int high;
    String name;
    MagicTableG(int low, int high, String name){
        this.low = low;
        this.high = high;
        this.name = name;
    }
}





