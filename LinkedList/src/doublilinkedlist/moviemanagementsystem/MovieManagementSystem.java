package doublilinkedlist.moviemanagementsystem;

public class MovieManagementSystem {
    public static void main(String[] args) {
        MovieLinkedList movieLinkedList = new MovieLinkedList("Avengers","Deepansh",2020,"5");
        movieLinkedList.displayInForward();

        movieLinkedList.atTheBeginning("Ant Man","ABC",2018,"4");
        movieLinkedList.displayInForward();

        movieLinkedList.atTheEnding("No Way Home","DEF",2022,"4.5");
        movieLinkedList.displayInForward();

        movieLinkedList.atSpecificPosition("Iron Man","GHI",2002,"5",2);
        movieLinkedList.displayInForward();

        movieLinkedList.removeMovie("Ant Man");

        movieLinkedList.displayInForward();

        movieLinkedList.searchByDirector("Deepansh");
        movieLinkedList.searchByRating("4.5");

        movieLinkedList.updateRating("No Way Home","4.75");

        movieLinkedList.displayInForward();
        movieLinkedList.displayInBackward();
    }
}
