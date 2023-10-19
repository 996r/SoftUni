package definingClasses.google;

public class Pokemon extends Person {

        private String pokemonName;
        private String pokemonType;
        public Pokemon (String pokemonName, String pokemonType, String name) {
            super(name);
            this.pokemonName = pokemonName;
            this.pokemonType = pokemonType;
        }
}
