import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Film> trainingSet = getTrainingSet();
        new GenreBranchNode(trainingSet);
    }

    private static List<Film> getTrainingSet() {
        List<Film> trainingSet = new ArrayList<Film>();
        trainingSet.add(new Film(
            "Star Wars",
            Genre.SCIFI,
            Decade.SEVENTIES,
            Format.LIVE,
            Rating.PG,
            Opinion.LIKES));
        trainingSet.add(new Film(
            "Maverick",
            Genre.WESTERN,
            Decade.NINETIES,
            Format.LIVE,
            Rating.PG,
            Opinion.DISLIKES));
        trainingSet.add(new Film(
            "Children of Men",
            Genre.DRAMA,
            Decade.NOUGHTIES,
            Format.LIVE,
            Rating.FIFTEEN,
            Opinion.LIKES));
        trainingSet.add(new Film(
            "South Park",
            Genre.COMEDY,
            Decade.NINETIES,
            Format.ANIMATED,
            Rating.FIFTEEN,
            Opinion.LIKES));
        trainingSet.add(new Film(
            "Team America",
            Genre.COMEDY,
            Decade.NOUGHTIES,
            Format.LIVE,
            Rating.FIFTEEN,
            Opinion.LIKES));
        trainingSet.add(new Film(
            "Iron Man",
            Genre.SCIFI,
            Decade.NOUGHTIES,
            Format.LIVE,
            Rating.TWELVE_A,
            Opinion.DISLIKES));
        trainingSet.add(new Film(
            "Transformers 2",
            Genre.SCIFI,
            Decade.NOUGHTIES,
            Format.LIVE,
            Rating.TWELVE_A,
            Opinion.DISLIKES));
        trainingSet.add(new Film(
            "Final Fantasy",
            Genre.SCIFI,
            Decade.NOUGHTIES,
            Format.ANIMATED,
            Rating.PG,
            Opinion.DISLIKES));
        trainingSet.add(new Film(
            "Space Jam",
            Genre.COMEDY,
            Decade.NINETIES,
            Format.ANIMATED,
            Rating.U,
            Opinion.DISLIKES));
        trainingSet.add(new Film(
            "Lost in Translation",
            Genre.DRAMA,
            Decade.NOUGHTIES,
            Format.LIVE,
            Rating.FIFTEEN,
            Opinion.LIKES));
        return trainingSet;
    }
}