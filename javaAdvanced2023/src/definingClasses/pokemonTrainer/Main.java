package definingClasses.pokemonTrainer;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String input = keyboard.nextLine();
        LinkedHashMap<String, Trainer> storeTrainer = new LinkedHashMap<>();
        List<Pokemon> storePokemon = new ArrayList<>();
        while(!input.equals("Tournament")) {
            String cmd[] = input.split("\\s+");
            if(!storeTrainer.containsKey(cmd[0])){
                Trainer trainer = new Trainer(cmd[0],new ArrayList<>( Collections.singletonList(cmd[1])));
                storeTrainer.put(cmd[0],trainer);
            } else {
                storeTrainer.get(cmd[0]).addPokemon(cmd[1]);
            }
            Pokemon pokemon = new Pokemon(cmd[1],cmd[2],Integer.parseInt(cmd[3]));
            storePokemon.add(pokemon);
            input = keyboard.nextLine();
        }
        input = keyboard.nextLine();
        while(!input.equals("End")) {
           for(Map.Entry<String, Trainer> entry: storeTrainer.entrySet()) {
boolean earnBadges = false;
               for (int i = 0; i < storePokemon.size() ; i++) {
                   if (storePokemon.get(i).getElement().equals(input) ) {
                       if (entry.getValue().getPokemonList()
                               .contains(storePokemon.get(i).getName())) {
                           entry.getValue().addBadges(1);
                           earnBadges = true;
                           break;
                       }
                   }
               }
               {
                       for (int j = 0; j < entry.getValue().getPokemonList().size() ; j++) {
                           for (int k = 0; k < storePokemon.size() ; k++) {
if(storePokemon.get(k).getName().equals(entry.getValue().getPokemonList().get(j)) && earnBadges == false) {
    storePokemon.get(k).removeHealth();

} if(storePokemon.get(k).getHealth() <= 0 && earnBadges == false){
                                   System.out.println(entry.getValue().getPokemonList());
                                   entry.getValue().getPokemonList().remove(k);
                                   storePokemon.remove(k);
                                   if(entry.getValue().getPokemonList().size() <= 0){
                                       break;
                                   }
                               }
                           }
                       }
               }
           }
           input = keyboard.nextLine();
        }
        System.out.println("dds");

    }
}
