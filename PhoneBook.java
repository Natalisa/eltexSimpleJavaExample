import java.util.ArrayList;
public class PhoneBook{
    ArrayList<Person> phoneBook = new ArrayList<>();
    public PhoneBook(Person newPerson){
        this.phoneBook.add(newPerson);
    }
    public void addPerson(Person p){
        this.phoneBook.add(p);
    }
    public Person getPerson(String name){
        for (Person element: this.phoneBook){
            if(element.name.equals(name)){
                return element;
            }
        }
    }
    public void printPhoneBook(){
         for (Person element: this.phoneBook){
               System.out.println(element.name);   
        }
    }
    public static void main(String[] arg){
        Person newP = new Person("Nata","56433");
        PhoneBook phoneBk = new PhoneBook(new Person("Nata","56433"));
        phoneBk.addPerson(newP);
        phoneBk.printPhoneBook();
    }
}