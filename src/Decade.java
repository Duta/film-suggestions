public enum Decade {
    SEVENTIES,
    EIGHTIES,
    NINETIES,
    NOUGHTIES;

    @Override
    public String toString() {
        switch(this) {
            case SEVENTIES: return "70s";
            case EIGHTIES:  return "80s";
            case NINETIES:  return "90s";
            case NOUGHTIES: return "00s";
            default:        return "<Unknown>";
        }
    }
}