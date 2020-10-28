package day62_Maps;

public class Test {

    public static void main(String[] args) {

        //String favoriteColor2 = "Pink";

        Color favoriteColor = Color.White;

        System.out.println(favoriteColor);

       // String browserName = "opera";

        //Browser browserName = Browser.opera;

        Browser browserName = Browser.chrome;

        switch (browserName){
            case chrome:
                System.out.println("Chrome browser is set");
                break;
            case firefox:
                System.out.println("Firefox browser is set");
                break;
            case safari:
                System.out.println("Safari browser is set");
                break;
            case edge:
                System.out.println("Edge browser is set");
                break;
        }

        System.out.println("=======================================");

        Day day1 = Day.Mon;
        Day day2 = Day.Tue;
        Day day3 = Day.Thu;

        Month month1 = Month.Jan;

        Level level1 = Level.Low;
        Level level2 = Level.Medium;
        Level level3 = Level.High;
        Level level4 = Level.BruceLee;
        //Level level5 = Level.ChuckNorris;




    }

}
