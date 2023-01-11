public class practice1 {
    public static void main(String[] args) {
    }

    public static void displayplayersposition(String playerName, int highscoreposition) {
        System.out.println(playerName + "managed into get position" + highscoreposition + " on thr high score list");
    }

    public static int calculatehighscoreposition(int playerscore) {
        if(playerscore>=1000)
        {
            return 1;
            
        } else if (playerscore>=500 && playerscore<1000) {
            return 2;
        }
        else if(playerscore>=100 && playerscore<500){
            return 3;
        }
        else{
            return 4;
        }
    }

}
