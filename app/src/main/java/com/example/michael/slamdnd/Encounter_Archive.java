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
        plains[0] = "Group of bandits";
        plains[1] = "";
        plains[2] = "";
        plains[3] = "";
        plains[4] = "";
        plains[5] = "";
        plains[6] = "";
        plains[7] = "";
        plains[8] = "";
        plains[9] = "";
        plains[10] = "";
        plains[11] = "";
        plains[12] = "";
        plains[13] = "";
        plains[14] = "";
        plains[15] = "";
        plains[16] = "";
        plains[17] = "";
        plains[18] = "";
        plains[19] = "";
    }

    public String selectPlain()
    {
        Random rn = new Random();
        int answer = rn.nextInt(20);

        return this.plains[answer];
    }

    public void cityPopulate()
    {
        city[0] = "";
        city[1] = "";
        city[2] = "";
        city[3] = "";
        city[4] = "";
        city[5] = "";
        city[6] = "";
        city[7] = "";
        city[8] = "";
        city[9] = "";
        city[10] = "";
        city[11] = "";
        city[12] = "";
        city[13] = "";
        city[14] = "";
        city[15] = "";
        city[16] = "";
        city[17] = "";
        city[18] = "";
        city[19] = "";
    }

    public String selectCity()
    {
        Random rn = new Random();
        int answer = rn.nextInt(20) + 1;

        return city[answer];
    }

    public void forestPopulate()
    {
        forest[0] = "";
        forest[1] = "";
        forest[2] = "";
        forest[3] = "";
        forest[4] = "";
        forest[5] = "";
        forest[6] = "";
        forest[7] = "";
        forest[8] = "";
        forest[9] = "";
        forest[10] = "";
        forest[11] = "";
        forest[12] = "";
        forest[13] = "";
        forest[14] = "";
        forest[15] = "";
        forest[16] = "";
        forest[17] = "";
        forest[18] = "";
        forest[19] = "";
    }

    public String selectForest()
    {
        Random rn = new Random();
        int answer = rn.nextInt(20) + 1;

        return forest[answer];
    }

    public void cavePopulate()
    {
        cave[0] = "";
        cave[1] = "";
        cave[2] = "";
        cave[3] = "";
        cave[4] = "";
        cave[5] = "";
        cave[6] = "";
        cave[7] = "";
        cave[8] = "";
        cave[9] = "";
        cave[10] = "";
        cave[11] = "";
        cave[12] = "";
        cave[13] = "";
        cave[14] = "";
        cave[15] = "";
        cave[16] = "";
        cave[17] = "";
        cave[18] = "";
        cave[19] = "";
    }

    public String selectCave()
    {
        Random rn = new Random();
        int answer = rn.nextInt(20) + 1;

        return cave[answer];
    }

    public void dungeonPopulate()
    {
        dungeon[0] = "";
        dungeon[1] = "";
        dungeon[2] = "";
        dungeon[3] = "";
        dungeon[4] = "";
        dungeon[5] = "";
        dungeon[6] = "";
        dungeon[7] = "";
        dungeon[8] = "";
        dungeon[9] = "";
        dungeon[10] = "";
        dungeon[11] = "";
        dungeon[12] = "";
        dungeon[13] = "";
        dungeon[14] = "";
        dungeon[15] = "";
        dungeon[16] = "";
        dungeon[17] = "";
        dungeon[18] = "";
        dungeon[19] = "";
    }

    public String selectDungeon()
    {
        Random rn = new Random();
        int answer = rn.nextInt(20) + 1;

        return dungeon[answer];
    }

    public void mountainPopulate()
    {
        mountain[0] = "";
        mountain[1] = "";
        mountain[2] = "";
        mountain[3] = "";
        mountain[4] = "";
        mountain[5] = "";
        mountain[6] = "";
        mountain[7] = "";
        mountain[8] = "";
        mountain[9] = "";
        mountain[10] = "";
        mountain[11] = "";
        mountain[12] = "";
        mountain[13] = "";
        mountain[14] = "";
        mountain[15] = "";
        mountain[16] = "";
        mountain[17] = "";
        mountain[18] = "";
        mountain[19] = "";
    }

    public String selectMountain()
    {
        Random rn = new Random();
        int answer = rn.nextInt(20) + 1;

        return mountain[answer];
    }
}
