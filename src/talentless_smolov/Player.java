package talentless_smolov;

public class Player {

    private int weight;
    private boolean injury;
    private String name;

    public Player(int weight, boolean injury, String name) {
        this.weight = weight;
        this.injury = injury;
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public boolean isInjury() {
        return injury;
    }

    public String getName() {
        return name;
    }


}
