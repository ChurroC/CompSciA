public class Villain {
    String name;
    Power superPower;

    /**
     * Creates a villain
     * @param name name of villain
     * @param superPower villains superpower
     */
    Villain(String name, Power superPower) {
        this.name = name;
        this.superPower = superPower;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Power getSuperPower() {
        return superPower;
    }

    public void setSuperPower(Power superPower) {
        this.superPower = superPower;
    }
}
