package talentless_smolov;

public class PlayerStore {

    public static Player findPlayer(Player[] players, int weight) throws PlayerNotFoundException {

//        for(Player player:players){
//            if(player.getWeight())
//        }

        return null;
    }


    public static boolean injured(Player player) throws PlayerInjuredException {
        return false;
    }

    public static void main(String[] args) {

        Player[] players = {
                new Player(80, true, "Smolov"),
                new Player(120, false, "Dzuba")};

//        Player player = findPlayer(players, 80);
//
//        if (injured(player)) {
//            System.out.println(player.getName() + " is ready to play");
//        }
    }

}
