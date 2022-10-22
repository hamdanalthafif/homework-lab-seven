public class PersonDemo
{
    public static void main(String[] args)
    {
        Person man = new Person();
        man.setName("Mohammed");
        man.setBirthYear(1988);

        Student boy = new Student("CS");
        boy.setName("Hamdan");
        boy.setBirthYear(2003);

        Instructor teacher = new Instructor(450000);
        teacher.setName("Fatma");
        teacher.setBirthYear(1998);

        System.out.println(man.toString());
        System.out.println(boy.toString());
        System.out.println(teacher.toString());
    }
}
