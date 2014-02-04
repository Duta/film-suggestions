public enum Format {
    LIVE,
    ANIMATED;

    @Override
    public String toString() {
        switch(this) {
            case LIVE:     return "Live";
            case ANIMATED: return "Animated";
            default:       return "<Unknown>";
        }
    }
}