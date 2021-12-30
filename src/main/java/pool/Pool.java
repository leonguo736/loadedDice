package pool;

import champion.Champion;

import java.util.ArrayList;
import java.util.List;

public class Pool {
//    private List<Champion> oneCost   = new ArrayList<>();
//    private List<Champion> twoCost   = new ArrayList<>();
//    private List<Champion> threeCost = new ArrayList<>();
//    private List<Champion> fourCost  = new ArrayList<>();
//    private List<Champion> fiveCost  = new ArrayList<>();

    private Champion[] oneCost;
    private Champion[] twoCost;
    private Champion[] threeCost;
    private Champion[] fourCost;
    private Champion[] fiveCost;

    public Pool() {
//        new Champion("Ziggs", new String[]{"Arcanist", "Yordle", "Scrap"}, 1);
//        oneCost.add(new Champion("Ziggs", new String[]{"Arcanist", "Yordle", "Scrap"}, 1));

        oneCost = new Champion[]{new Champion("Caitlyn", new String[]{"Enforcer", "Sniper"}, 1),
                new Champion("Camille", new String[]{"Challenger", "Clockwork"}, 1),
                new Champion("Darius", new String[]{"Bodyguard", "Syndicate"}, 1),
                new Champion("Ezreal", new String[]{"Innovator", "Scrap"}, 1),
                new Champion("Garen", new String[]{"Academy", "Protector"}, 1),
                new Champion("Graves", new String[]{"Academy", "Twinshot"}, 1),
                new Champion("Illaoi", new String[]{"Bruiser", "Mercenary"}, 1),
                new Champion("Kassadin", new String[]{"Mutant", "Protector"}, 1),
                new Champion("Poppy", new String[]{"Bodyguard", "Yordle"}, 1),
                new Champion("Singed", new String[]{"Chemtech", "Innovator"}, 1),
                new Champion("Twitch", new String[]{"Assassin", "Chemtech"}, 1),
                new Champion("Ziggs", new String[]{"Arcanist", "Scrap", "Yordle"}, 1)};

        twoCost = new Champion[]{new Champion("Blitzcrank", new String[]{"Bodyguard", "Protector", "Scrap"}, 2),
                new Champion("Katarina", new String[]{"Academy", "Assassin"}, 2),
                new Champion("Kogmaw", new String[]{"Mutant", "Sniper", "Twinshot"}, 2),
                new Champion("Lulu", new String[]{"Enchanter", "Yordle"}, 2),
                new Champion("Quinn", new String[]{"Challenger", "Mercenary"}, 2),
                new Champion("Swain", new String[]{"Arcanist", "Imperial"}, 2),
                new Champion("Talon", new String[]{"Assassin", "Imperial"}, 2),
                new Champion("Tristana", new String[]{"Sniper", "Yordle"}, 2),
                new Champion("Trundle", new String[]{"Bruiser", "Scrap"}, 2),
                new Champion("Vi", new String[]{"Bruiser", "Enforcer", "Sister"}, 2),
                new Champion("Warwick", new String[]{"Challenger", "Chemtech"}, 2),
                new Champion("Zilean", new String[]{"Clockwork", "Innovator"}, 2),
                new Champion("Zyra", new String[]{"Scholar", "Syndicate"}, 2)};

        threeCost = new Champion[]{new Champion("Chogath", new String[]{"Bruiser", "Chemtech", "Mutant"}, 3),
                new Champion("Ekko", new String[]{"Assassin", "Scrap"}, 3),
                new Champion("Chogath", new String[]{"Bruiser", "Chemtech", "Mutant"}, 3),
                new Champion("Zac", new String[]{"Bruiser", "Chemtech"}, 3)};
    }
     public static void main (String[] args) {
        System.out.println(new Champion("Ziggs", new String[]{"Arcanist", "Yordle", "Scrap"}, 1).getName());
     }
}
