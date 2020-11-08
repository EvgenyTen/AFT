package homework8.task4;

public class Entity implements Validatable {
    protected String name;
    protected String uuid;

    public Entity(String name) {
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Override
    public void validate() {
        ValidatorStub.validateEntety(this);
    }
}
