package talentless_smolov;

public class PlayerStore {

    public static Player findPlayer(Player[] players, int weight) throws PlayerNotFoundException {

        Player readyPlayer = null;
        for (Player player : players) {
            if (player.getWeight() > weight) {
                System.err.println("Player "+ player.getName () +" has exceeded its weight by: " + (player.getWeight() - 80) + "kg");
            } else if (player.isInjury()) {
                System.err.println("Player "+ player.getName () +" is injured ...");
            } else {
                System.out.println("Player "+ player.getName () +" is in great shape !!!");
                readyPlayer = player;
            }
        }
        if (readyPlayer == null)
            throw new PlayerNotFoundException("Player not found, All players need to lose weight urgently!!!");

        return readyPlayer;
    }


    public static boolean injured(Player player) throws PlayerInjuredException {

        if (player.isInjury()) throw new PlayerInjuredException("Player "+ player.getName () +" is injured ...");
        else return true;
    }

    public static void main(String[] args) {

        Player[] players = {
                new Player(80, false, "Smolov"),
                new Player(80, true, "Dzuba"),
                new Player(100, false, "Kirzjakov")};

        try {
            Player player = findPlayer(players, 80);

            if (injured(player)) {
                System.out.println(player.getName() + " is ready to play");
            }
        } catch (PlayerNotFoundException e) {
            System.err.println(e.getMessage());
        }

//
    }

}
