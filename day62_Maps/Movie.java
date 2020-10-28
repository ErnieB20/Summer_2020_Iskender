package day62_Maps;

public abstract class Movie {
  // public abstract void makeMovie();

}

abstract class Comedy extends Movie{
public abstract void makeJoke();


}
class StandUp extends Movie{
    public void makeJoke(){
        System.out.println("Joke");
    }
}

