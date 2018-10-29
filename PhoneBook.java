import java.util.ArrayList;
public class PhoneBook{
    ArrayList<Person> phoneBook = new ArrayList<>();
    public PhoneBook(){
        
    }
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
        return null;
    }
    public void printPhoneBook(){
         for (Person element: this.phoneBook){
               System.out.print(element.name+": ");
             for(String phone: element.phone){
                 System.out.println(phone);
             }
        }
    }
    public void addPhone(String name, String number){
        Person tmp = getPerson(name);
        tmp.addPhone(number);
    }
    public static void main(String[] arg){
        Person newP = new Person("Nata","56433");
        PhoneBook phoneBk = new PhoneBook();
        phoneBk.addPerson(newP);
        phoneBk.addPerson(new Person("Ira","12314"));
        phoneBk.addPhone("Nata","345436");
        phoneBk.addPhone("Nata","56844");
        phoneBk.printPhoneBook();
    }
}