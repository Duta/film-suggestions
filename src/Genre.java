public enum Genre {
    SCIFI,
    WESTERN,
    DRAMA,
    COMEDY;

    @Override
    public String toString() {
        switch(this) {
            case SCIFI:   return "SciFi";
            case WESTERN: return "Western";
            case DRAMA:   return "Drama";
            case COMEDY:  return "Comedy";
            default:      return "<Unknown>";
        }
    }
}