public enum Opinion {
    LIKES,
    DISLIKES,
    UNKNOWN;

    @Override
    public String toString() {
        switch(this) {
            case LIKES:    return "Likes";
            case DISLIKES: return "Dislikes";
            case UNKNOWN:  return "Unknown";
            default:       return "<Unknown>";
        }
    }
}