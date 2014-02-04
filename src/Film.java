public class Film {
    private String title;
    private Genre genre;
    private Decade decade;
    private Format format;
    private Rating rating;
    private Opinion opinion;

    public Film(String title, Genre genre, Decade decade,
                Format format, Rating rating) {
        this(title, genre, decade,
            format, rating, Opinion.UNKNOWN);
    }

    public Film(String title, Genre genre, Decade decade,
                Format format, Rating rating, Opinion opinion) {
        this.title = title != null ? title : "<Unknown>";
        this.genre = genre;
        this.decade = decade;
        this.format = format;
        this.rating = rating;
        this.opinion = opinion;
    }

    public String getTitle() {
        return title;
    }

    public Genre getGenre() {
        return genre;
    }

    public Decade getDecade() {
        return decade;
    }

    public Format getFormat() {
        return format;
    }

    public Rating getRating() {
        return rating;
    }

    public Opinion getOpinion() {
        return opinion;
    }

    public void setOpinion(Opinion opinion) {
        this.opinion = opinion;
    }

    @Override
    public String toString() {
        return "{"
            + "Genre: "   + genre  + ", "
            + "Decade: "  + decade + ", "
            + "Format: "  + format + ", "
            + "Rating: "  + rating + ", "
            + "Opinion: " + opinion
            + "}";
    }
}