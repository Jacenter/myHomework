package demos;

public class Animal {
    public int numberofLegs;

    public Animal(int numberofLegs) {
        this.numberofLegs = numberofLegs;
    }

    //Method for animal to walk
    public void walk() {
        System.out.println("Look that animal walked");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "numberofLegs=" + numberofLegs +
                '}';
    }
}
//C:\Users\Jared\IdeaProjects\homeworkforJava\src\main\java\demos\Animal.java//
