package ua.karev.springcourse.dao;


import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;
import ua.karev.springcourse.models.Person;

@Component
public class PersonDAO {
  private static int PEOPLE_COUNT;
  private List<Person> people;

  {
    people = new ArrayList<>();
    people.add(new Person(++PEOPLE_COUNT, "Andrey", 19 , "Andrey@gmail.com"));
    people.add(new Person(++PEOPLE_COUNT, "Vova", 39 , "Vova@gmail.com"));
    people.add(new Person(++PEOPLE_COUNT, "Sveta", 29 , "Sveta@gmail.com"));
    people.add(new Person(++PEOPLE_COUNT, "Slava", 19 , "Slava@gmail.com"));
  }

  public List<Person> index(){
    return people;
  }

  public  Person show(int id){
    return people.stream().filter(person -> person.getId() == id).findAny().orElse(null);
  }

  public void save(Person person){
    person.setId(++PEOPLE_COUNT);
    people.add(person);
  }

  public void update(int id, Person updatedPerson){
    Person personToBeUpdated = show(id);
    personToBeUpdated.setName(updatedPerson.getName());
    personToBeUpdated.setAge(updatedPerson.getAge());
    personToBeUpdated.setEmail(updatedPerson.getEmail());
  }

  public void delete(int id){
    people.removeIf(p -> p.getId() == id);
  }
}
