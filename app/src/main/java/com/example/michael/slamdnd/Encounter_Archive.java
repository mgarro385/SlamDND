package com.example.michael.slamdnd;

import java.util.Random;

/**
 * Created by agmaida on 11/6/2015.
 */
public class Encounter_Archive
{
    int N = 20;

    String[] plains = new String[N];
    String[] city = new String[N];
    String[] forest = new String[N];
    String[] cave = new String[N];
    String[] dungeon = new String[N];
    String[] mountain = new String[N];

    public void plainsPopulation()
    {
        Random r1 = new Random();
        int d4 = r1.nextInt(4)+1;

        Random r2 = new Random();
        int d6 = r2.nextInt(6)+1;

        Random r3 = new Random();
        int d8 = r3.nextInt(8)+1;

        Random r4 = new Random();
        int d10 = r4.nextInt(10)+1;

        plains[0] = d8 + " Bandit(s)";
        plains[1] = d6 + " Werewolve(s)";
        plains[2] = d8 + " Blighted Humans";
        plains[3] = d8 + " Merchant(s)";
        plains[4] = d6 + " Wolve(s)";
        plains[5] = d6 + " Bandit(s) and Captain";
        plains[6] = "Rogue Mage";
        plains[7] = d8 + " Peasant(s)";
        plains[8] = d6 + " Bandit(s) and Captain";
        plains[9] = d8 + " Imperial Soldier(s)";
        plains[10] = "Paladin of Pelor";
        plains[11] = d6 + " Traveler(s)";
        plains[12] = d8 + " Bandit(s)";
        plains[13] = d8 + " Imperial Soldier(s)";
        plains[14] = d8 + " Merchant(s)";
        plains[15] = "Half Buried Chest";
        plains[16] = "Turned over wagon";
        plains[17] = d6 + " Adventurer(s)";
        plains[18] = d6 + " Adventurer(s)";
        plains[19] = d6 + " Adventurer(s)";
    }

    public String selectPlain()
    {
        Random rn = new Random();
        int answer = rn.nextInt(20);

        return this.plains[answer];
    }

    public void cityPopulate()
    {

        Random r1 = new Random();
        int d4 = r1.nextInt(4)+1;

        Random r2 = new Random();
        int d6 = r2.nextInt(6)+1;

        Random r3 = new Random();
        int d8 = r3.nextInt(8)+1;

        Random r4 = new Random();
        int d10 = r4.nextInt(10)+1;

        city[0] = "Noble";
        city[1] = d4 + " Cleric(s) of Pelor";
        city[2] = d6 + " City Guard(s)";
        city[3] = d6 + " Thug(s)";
        city[4] = "Pushy Vendor";
        city[5] = "Pickpocket";
        city[6] = "Barbrawl spilled onto street";
        city[7] = "Crew recruitment";
        city[8] = d4 + " Clerics of Melora";
        city[9] = "Paladin of Pelor";
        city[10] = "Shady Salesman";
        city[11] = d6 + " City Guard(s)";
        city[12] = "Assassin";
        city[13] = "Pickpocket";
        city[14] = "Crew recruitment";
        city[15] = d6 + " Imperial Soldier(s)";
        city[16] = "Alley Fight";
        city[17] = d6 + " City Guard(s)";
        city[18] = d6 + " Adventurer(s)";
        city[19] = d6 + " Adventurer(s)";
    }

    public String selectCity()
    {
        Random rn = new Random();
        int answer = rn.nextInt(20) + 1;

        return city[answer];
    }

    public void forestPopulate()
    {
        Random r1 = new Random();
        int d4 = r1.nextInt(4)+1;

        Random r2 = new Random();
        int d6 = r2.nextInt(6)+1;

        Random r3 = new Random();
        int d8 = r3.nextInt(8)+1;

        Random r4 = new Random();
        int d10 = r4.nextInt(10)+1;


        forest[0] = d10 + " Bandit(s)";
        forest[1] = d4 + " Giant Spider(s)";
        forest[2] = "Unicorn";
        forest[3] = d4 + " Dire Bat(s)";
        forest[4] = d4 + " Boar(s)";
        forest[5] = "Owlbear";
        forest[6] = d6 + " Werewolve(s)";
        forest[7] = d4 + " Dire Wolve(s)";
        forest[8] = d10 + " Goblin(s)";
        forest[9] = 2*d6 + " Wolve(s)";
        forest[10] = "Young Green Dragon";
        forest[11] = "Tree Ent";
        forest[12] = d4 + " Rangers";
        forest[13] = "Wandering Shaman";
        forest[14] = "Bear";
        forest[15] = 2*d6 + "Kobold(s) and Leader";
        forest[16] = d8 + " Bandit(s) and Captain";
        forest[17] = d4 + " deer";
        forest[18] = "Hermit";
        forest[19] = d6 + " Adventurer(s)";
    }

    public String selectForest()
    {
        Random rn = new Random();
        int answer = rn.nextInt(20) + 1;

        return forest[answer];
    }

    public void cavePopulate()
    {

        Random r1 = new Random();
        int d4 = r1.nextInt(4)+1;

        Random r2 = new Random();
        int d6 = r2.nextInt(6)+1;

        Random r3 = new Random();
        int d8 = r3.nextInt(8)+1;

        Random r4 = new Random();
        int d10 = r4.nextInt(10)+1;

        Random r5 = new Random();
        int d12 = r5.nextInt(12)+1;

        cave[0] = d6 + " Giant Spider(s)";
        cave[1] = d6 + " Cloaker(s)";
        cave[2] = "Giant Slug";
        cave[3] = "Gellatinous Cube";
        cave[4] = d8 + " Goblin(s)";
        cave[5] = d12 + " Kobold(s) and Leader";
        cave[6] = d6 + " Dreugar";
        cave[7] = d6 + " Violet Fungi";
        cave[8] = "Cave In";
        cave[9] = "Torches go out";
        cave[10] = "Come across chasm";
        cave[11] = "Swarm of bats";
        cave[12] = d6 + " Dire bat(s)";
        cave[13] = "Purple worm";
        cave[14] = d8 + " Bandits";
        cave[15] = d6 + " Dwarven Explorers";
        cave[16] = d6 + "Bandits and Leader";
        cave[17] = "Hermit";
        cave[18] = d6 + " Miners";
        cave[19] = d6 + " Adventurer(s)";
    }

    public String selectCave()
    {
        Random rn = new Random();
        int answer = rn.nextInt(20) + 1;

        return cave[answer];
    }

    public void dungeonPopulate()
    {

        Random r1 = new Random();
        int d4 = r1.nextInt(4)+1;

        Random r2 = new Random();
        int d6 = r2.nextInt(6)+1;

        Random r3 = new Random();
        int d8 = r3.nextInt(8)+1;

        Random r4 = new Random();
        int d10 = r4.nextInt(10)+1;

        Random r5 = new Random();
        int d12 = r5.nextInt(12)+1;

        dungeon[0] = "Torches go out";
        dungeon[1] = "Monster attack";
        dungeon[2] = "Poison dart trap";
        dungeon[3] = "Spike wall trap";
        dungeon[4] = "Swarm of bats";
        dungeon[5] = "Monster attack";
        dungeon[6] = "Trap destroys" + d10 + "pounds of food";
        dungeon[7] = "Paladin of Pelor";
        dungeon[8] = "Pitfall Trap";
        dungeon[9] = "Locked Door";
        dungeon[10] = "Dead Adventure Party";
        dungeon[11] = "Treasure Chest";
        dungeon[12] = "Monster attack";
        dungeon[13] = "flame trap";
        dungeon[14] = "Corpse";
        dungeon[15] = "Lost Bard";
        dungeon[16] = "Mimic";
        dungeon[17] = "Monster attack";
        dungeon[18] = d6 + " Adventurer(s)";
        dungeon[19] = d6 + " Adventurer(s)";
    }

    public String selectDungeon()
    {
        Random rn = new Random();
        int answer = rn.nextInt(20) + 1;

        return dungeon[answer];
    }

    public void mountainPopulate()
    {
        Random r1 = new Random();
        int d4 = r1.nextInt(4)+1;

        Random r2 = new Random();
        int d6 = r2.nextInt(6)+1;

        Random r3 = new Random();
        int d8 = r3.nextInt(8)+1;

        Random r4 = new Random();
        int d10 = r4.nextInt(10)+1;

        Random r5 = new Random();
        int d12 = r5.nextInt(12)+1;

        mountain[0] = d6 + " Eagle(s)";
        mountain[1] = 2*d6 + " Orc(s)";
        mountain[2] = d8 + " Hobgoblin(s)";
        mountain[3] = d4 + " Giant Eagle(s)";
        mountain[4] = d6 + " Ogre(s)";
        mountain[5] = "Young White Dragon";
        mountain[6] = d6 + " Griffon(s)";
        mountain[7] = 2*d4 + " Bugbear(s)";
        mountain[8] = d6 + " Cyclops";
        mountain[9] = "Gorgon";
        mountain[10] = d6 + " Trolls";
        mountain[11] = "Young Red Dragon";
        mountain[12] = d6 + " Miners";
        mountain[13] = d6 + " Travel(s)";
        mountain[14] = d6 + " Merchant(s)";
        mountain[15] = d12 + "kobold(s) and Leader";
        mountain[16] = d8 + " Bandit(s)";
        mountain[17] = "Rogue Mage";
        mountain[18] = "Rock Slide";
        mountain[19] = d6 + " Adventurer(s)";
    }

    public String selectMountain()
    {
        Random rn = new Random();
        int answer = rn.nextInt(20) + 1;

        return mountain[answer];
    }
}
