public class SampleMatrixClass01 {

    public static void main(String[] args)
    {
        Person[] aPerson = new Person[10];
        int size = aPerson.length;

        for (int i=0; i < size; i++)
        {
            aPerson[i] = new Person(i+1,"description " + (i+1));
        }
        
        for (Person person : aPerson)
        { 
            boolean status = person == null;

            System.out.println(person + " : " + status);
        }
    }

}