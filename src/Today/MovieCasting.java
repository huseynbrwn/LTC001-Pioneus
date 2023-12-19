package Today;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MovieCasting {
    public static void main(String[] args) {
        ArrayList<Actor> actors = new ArrayList<>();
        actors.add(new Actor("Kevin Spacey", 64, 10, "male"));
        actors.add(new Actor("Noah Jupe", 18, 7,"male"));
        actors.add(new Actor("Shia LaBeouf", 37, 9, "male"));
        actors.add(new Actor("Margot Robbie", 33, 8, "female"));
        actors.add(new Actor("Ryan Gosling", 43, 10, "male"));
        actors.add(new Actor("Scarlett Johansson", 39, 8, "female"));
        actors.add(new Actor("Haluk Bilginer", 69, 10, "male"));
        actors.add(new Actor("Armie Hammer", 37, 8, "male"));
        actors.add(new Actor("Anne Hathaway", 41, 8, "female"));
        actors.add(new Actor("Huseyn Huseynov", 23, 3, "male"));

        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new Role("President Francis Underwood", 60, 70, "male"));
        roles.add(new Role("Officer K",35, 45, "male" ));
        roles.add(new Role("Qeen of England", 35, 45, "female"));
        roles.add(new Role("Homeless", 18, 25, "male"));
        roles.add(new Role("Jesus", 30, 40, "male" ));
        roles.add(new Role("Harley Quinn", 25, 35, "female"));

        Collections.sort(actors, Comparator.comparingInt((Actor actor) -> actor.actingSkill));
        Collections.sort(roles, Comparator.comparingInt(role -> role.minAge ));

        for (Actor actor : actors) {
            for (Role role : roles) {
                if (actor.age >= role.minAge && actor.age <= role.maxAge && actor.gender.equals(role.gender)) {
                    System.out.println(actor.name + " is cast as " + role.name + " (" + actor.age + ")");
                }
            }
        }
    }
}
