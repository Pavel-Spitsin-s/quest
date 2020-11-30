public class Game {
    public void start() {
        while (checksituation[0] >= 0 && checksituation[1] >= 0) {
            situations[checksituation[0]][checksituation[1]].Situation();
            int k;
            k = situations[checksituation[0]][checksituation[1]].getAnswer();
            if (k == 0){
                checksituation[0] -= 1;
            }
            else if (k == 1){
                checksituation[0] += 1;
            }
            else if (k == 2){
                checksituation[1] += 1;
            }
            else if (k == 3){
                checksituation[1] -= 1;
            }
        }
    }

    public Situation[][] situations = new Situation[10][10];
    public int[] checksituation = {5, 5};
}
