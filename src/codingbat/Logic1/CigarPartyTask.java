package codingbat.Logic1;

public class CigarPartyTask {
    public static void main(String[] args) {
        boolean isCigarPartySucessful = cigarParty(100, true);
        System.out.println(isCigarPartySucessful);

    }

    public static boolean cigarParty(int cigars, boolean isWeekend) {
        if (isWeekend && cigars >= 40) {
            return true;
        } else if ( cigars >= 40 && cigars <= 60)
        {
            return true;
        }
        else {
            return false;
        }
    }


    public boolean cigarParty2(int cigars, boolean isWeekend) {
        if (isWeekend) {
            return (cigars >= 40);
        } else {
            return (cigars >= 40 && cigars <= 60);
        }
    }
}