

public class SampleClass01 {

    public static void main(String[] args)
    {
        Person person = new Person();
        Person person2 = new Person(100,"description 100");
        System.out.println("Person : " + person.toString());
        System.out.println("Person2: " + person2.toString());
        person.setId(200);
        person.setDescription("Estrutura de Dados");
        System.out.println("Person: " + person.toString());

    }

}