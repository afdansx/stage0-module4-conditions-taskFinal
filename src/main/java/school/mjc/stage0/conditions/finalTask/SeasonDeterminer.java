package school.mjc.stage0.conditions.finalTask;

public class SeasonDeterminer {
    public void tellTheSeason(int monthNumber) {
        switch(monthNumber){
            case 2:
                System.out.println("Winter");
                break;
            case 6:
                System.out.println("Summer");
                break;
            case 12:
                System.out.println("Winter");
                break;
                default:
                    System.out.println("Wrong month number");
                    break;
        }
    }
}
