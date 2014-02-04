public class OpinionLeafNode extends Node {
    private final Opinion opinion;

    public OpinionLeafNode(Opinion opinion) {
        this.opinion = opinion;
    }

    public Opinion getOpinion() {
        return opinion;
    }

    @Override
    public String toString() {
        return "{Opinion: " + opinion + "}";
    }
}