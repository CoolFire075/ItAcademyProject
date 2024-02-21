package codingbat.Logic1;

public class TeaParty {
    public static void main(String[] args) {
        int isPartySucessful = teaParty(8 , 17);
        System.out.println(isPartySucessful);
    }
    public static int teaParty(int tea, int candy) {
        if (tea < 5 || candy < 5){
            return 0;
        } else if (tea * 2 <= candy || candy * 2 <= tea){
            return 2;
        } return 1;
    }
}
