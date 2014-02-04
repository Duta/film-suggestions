public enum Rating {
    PG,
    U,
    TWELVE_A,
    FIFTEEN;

    @Override
    public String toString() {
        switch(this) {
            case PG:       return "PG";
            case U:        return "U";
            case TWELVE_A: return "12A";
            case FIFTEEN:  return "15";
            default:       return "<Unknown>";
        }
    }
}