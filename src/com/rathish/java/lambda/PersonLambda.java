package com.rathish.java.lambda;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class PersonLambda {

    public static void main(String[] args) {
        List<Person> roster = Arrays.asList(new Person("Rathish", LocalDate.now(), "test@testmail.com", 20, Person.Sex.MALE),
                new Person("Madan", LocalDate.now(), "testmail@testmail.com", 24, Person.Sex.MALE));

        /*processPersonWithFunctionGeneric(roster,
                person -> person.getGender() == Person.Sex.MALE
                        && person.getAge() >= 18
                        && person.getAge() <= 25,
                person -> person.getName(),
                emailAddress -> System.out.println(emailAddress));*/

        roster
                .stream()
                .filter(person -> person.getGender() == Person.Sex.MALE
                        && person.getAge() >= 18
                        && person.getAge() <= 25)
                .map(person -> person.getEmailAddress())
                .forEach(email -> System.out.println(email));
    }

    /*public static void processPersonsWithFunction(List<Person> roster,
                                           Predicate<Person> tester,
                                           Function<Person, String> mapper,
                                           Consumer<String> blocker){
        for(Person person : roster){
            if(tester.test(person)){
                String data = mapper.apply(person);
                blocker.accept(data);
            }
        }
    }

    public static <X, Y> void processPersonWithFunctionGeneric(
            Iterable<X> roster,
            Predicate<X> tester,
            Function<X, Y> mapper,
            Consumer<Y> blocker){
        for(X x: roster){
            if(tester.test(x)){
                Y data = mapper.apply(x);
                blocker.accept(data);
            }
        }

    }*/

}

class Person {

    public enum Sex {MALE, FEMALE};

    private String name;

    private LocalDate birthDate;

    private String emailAddress;

    private Integer age;

    private Sex gender;

    public Person(String name, LocalDate birthDate, String emailAddress, Integer age, Sex gender) {
        this.name = name;
        this.birthDate = birthDate;
        this.emailAddress = emailAddress;
        this.age = age;
        this.gender = gender;
    }

    public void printPerson(){
        System.out.println("Person{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", emailAddress='" + emailAddress + '\'' +
                ", gender=" + gender +
                '}');
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Sex getGender() {
        return gender;
    }

    public void setGender(Sex gender) {
        this.gender = gender;
    }
}
