public class SampleMatrixClass03 {

    public static void main(String[] args)
    {
        Person[][] aPerson = new Person[4][];
        int sizeX = aPerson.length;

        for (int i=0; i < sizeX; i++)
        {
            aPerson[i] = new Person[4];
        }

        int count = 1;
        for (int i=0; i < 4; i++)
        {
            for (int j=0; j < 4; j++)
            {
                aPerson[i][j] = new Person(count++, "Pessoa");
            }
        }

        for (int i=0; i < 4; i++)
        {
            for (int j=0; j < 4; j++)
            {
                System.out.println(aPerson[i][j]);
            }
        }
        /*        
        for (Person person : aPerson)
        { 
            boolean status = person == null;

            System.out.println(person + " : " + status);
        }
        */
    }

}