import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class GenreBranchNode extends Node {
    private Node
        sciFiNode,
        dramaNode,
        westernNode,
        comedyNode;

    public GenreBranchNode(List<Film> films) {
        List<Film>
            sciFiFilms = getFilms(films, Genre.SCIFI),
            dramaFilms = getFilms(films, Genre.DRAMA),
            westernFilms = getFilms(films, Genre.WESTERN),
            comedyFilms = getFilms(films, Genre.COMEDY);
        sciFiNode = getNode(sciFiFilms);
        dramaNode = getNode(dramaFilms);
        westernNode = getNode(westernFilms);
        comedyNode = getNode(comedyFilms);
        System.out.println("a");
        Map<Node, List<Film>> map = new HashMap<Node, List<Film>>();
        map.put(sciFiNode, sciFiFilms);
        map.put(dramaNode, dramaFilms);
        map.put(westernNode, westernFilms);
        map.put(comedyNode, comedyFilms);
        System.out.println("map size = " + map.size());
        for(Entry<Node, List<Film>> entry : map.entrySet()) {
            Node node = entry.getKey();
            List<Film> subset = entry.getValue();
            System.out.println(node + ":");
            for(Film film : subset) {
                System.out.println(" - " + film);
            }
        }
    }

    // films.filter(film => film.getGenre() == genre)
    private List<Film> getFilms(List<Film> films, Genre genre) {
        List<Film> subset = new ArrayList<Film>();
        for(Film film : films) {
            if(film.getGenre() == genre) {
                subset.add(film);
            }
        }
        return subset;
    }

    private Node getNode(List<Film> films) {
        if(films.isEmpty()) {
            return null;
        } else if(films.size() == 1) {
            Film film = films.get(0);
            Opinion opinion = film.getOpinion();
            return new OpinionLeafNode(opinion);
        } else {
            List<Film> likes = new ArrayList<Film>();
            List<Film> dislikes = new ArrayList<Film>();
            for(Film film : films) {
                switch(film.getOpinion()) {
                    case LIKES:
                        likes.add(film);
                        break;
                    case DISLIKES:
                        dislikes.add(film);
                        break;
                    default:
                        // Just skip it
                }
            }
            if(likes.isEmpty()) {
                return new OpinionLeafNode(Opinion.DISLIKES);
            } else if(dislikes.isEmpty()) {
                return new OpinionLeafNode(Opinion.LIKES);
            } else {
                return new OpinionLeafNode(Opinion.UNKNOWN);
            }
        }
    }
}