package definingClasses.google;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.SimpleTimeZone;

public class Person {
        private String name;
        private Company company;
        private Car car;

        List<Parents> parentsList = new ArrayList<>();
        List<Children> childrenList = new ArrayList<>();
        List<Pokemon> pokemonList = new ArrayList<>();
        List<Person> personList = new ArrayList<>();

        public Person(String name){
            this.name = name;
         //   this.personList = parentsList;
        }

        public String getName(){
            this.name = name;
            return name;
    }
        public void addCompany (Company company) {
            this.company =  company;
        }
        public void addPokemon (Pokemon pokemon) {
            pokemonList.add(pokemon);
        }
        public void addChildren (Children children) {
            childrenList.add(children);
        }
        public void addParents (Parents parents) {
            parentsList.add(parents);
        }
        public void addCar (Car car) {
            this.car = car;
        }
        public void addPerson(Person person) {
            personList.add(person);
        }


 }



