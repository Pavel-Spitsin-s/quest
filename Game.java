public class Game {
    public void start() {
        while (checksituation[0] >= 0 && checksituation[1] >= 0) {
            situations[checksituation[0]][checksituation[1]].Situation();
        }
    }

    public Situation[][] situations = new Situation[10][10];
    public int[] checksituation = {5, 5};
}
