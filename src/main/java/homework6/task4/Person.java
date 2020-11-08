package homework6.task4;

public class Person {
    private String surname;
    private String name;
    private IdentityDocument identityDocument;

    public Person(String surname, String name, IdentityDocument identityDocument) {
        this.surname = surname;
        this.name = name;
        this.identityDocument = identityDocument;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public IdentityDocument getIdentityDocument() {
        return identityDocument;
    }

    public static Person random() {
        String surname = NameGenerator.generate();
        String name = NameGenerator.generate();
        IdentityDocument identityDocument = IdentityDocument.random();
        return new Person(surname, name, identityDocument);
    }
}

