package homework6.task4;

import java.util.Random;
import java.util.stream.DoubleStream;

public class IdentityDocument {
    private IdentityDocumentType type;
    private String id;

    public IdentityDocument(IdentityDocumentType type, String id) {
        this.type = type;
        this.id = id;
    }

    public IdentityDocumentType getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    public static IdentityDocument random() {
        IdentityDocumentType documentType = IdentityDocumentType.values()[new Random().nextInt(IdentityDocumentType.values().length)];
        String id = Template.generate(documentType);
        return new IdentityDocument(documentType, id);
    }
}

