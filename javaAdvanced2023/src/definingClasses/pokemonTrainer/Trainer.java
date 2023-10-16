package definingClasses.pokemonTrainer;


import java.util.List;

public class Trainer {
    private String name;
    private int numOfBadges;
     private List<String> pokemonList;

    public Trainer(String name, int numOfBadges, List pokemonList){
        this.name = name;
        this.numOfBadges = numOfBadges;
        this.pokemonList = pokemonList;
    }
    public Trainer(String name, List pokemonList){
        this(name,0, pokemonList);
    }

    public String getName() {
        return name;
    }
    public int getNumOfBadges() {
        return numOfBadges;
    }
    public List getPokemonList(){
        return pokemonList;
    }
    public void addPokemon(String element) {
        pokemonList.add(element);
    }
    public void removePokemon(String element) {
        pokemonList.remove(element);
    }
    public void addBadges(int num) {
        numOfBadges ++;
    }
}


