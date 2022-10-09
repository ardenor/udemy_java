package sec4;

public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature){
//        int limit = summer ? 45 : 35;
        int limit = 0;
        if(summer){
            limit = 45;
        } else {
            limit = 35;
        }
        return temperature >= 25 && temperature <= limit;
    }
}
