package Office_Hours.Practice_12_16_2020;

public class Test {

    public static void main(String[] args) {

        FacebookUser userOne = new FacebookUser("abcJames", "007");

        FacebookUser userTwo = new FacebookUser("bryan1275", "word32", "Bryan Mocha",
                30, 40);

        System.out.println(userTwo);

        System.out.println(userOne.url);

        System.out.println(userTwo.getNumberOfFriends());

        userOne.sendFriendRequest(userTwo);

        System.out.println(userTwo.getNumberOfFriends());



    }

}
