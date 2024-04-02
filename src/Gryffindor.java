public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honour;
    private int bravery;

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonour() {
        return honour;
    }

    public void setHonour(int honour) {
        this.honour = honour;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public Gryffindor(int thePowerOfMagic, int transgressionDistance, String fullName, int nobility, int honour, int bravery) {
        super(thePowerOfMagic, transgressionDistance, fullName);
        this.nobility = nobility;
        this.honour = honour;
        this.bravery = bravery;
    }
    protected void compareToStudent(Gryffindor gryffindor) {
        int sumOfCharacteristics1 = this.sumBaseCharacteristics();
        int sumOfCharacteristics2 = gryffindor.sumBaseCharacteristics();
        if (sumOfCharacteristics1 > sumOfCharacteristics2) {
            System.out.printf(
                    "Студент %s лучше студента %s (%d vs %d)%n",
                    this.getFullName(),
                    gryffindor.getFullName(),
                    sumOfCharacteristics1,
                    sumOfCharacteristics2
            );
        } else if (sumOfCharacteristics1 < sumOfCharacteristics2) {
            System.out.printf(
                    "Студент %s лучше студента %s (%d vs %d)%n",
                    this.getFullName(),
                    gryffindor.getFullName(),
                    sumOfCharacteristics2,
                    sumOfCharacteristics1
            );
        } else {
            System.out.printf(
                    "Студены %s и %s одинаковые (%d vs %d)%n",
                    this.getFullName(),
                    gryffindor.getFullName(),
                    sumOfCharacteristics2,
                    sumOfCharacteristics1
            );
        }
    }

    @Override
    protected int sumOfCharacteristics() {
        return nobility+honour+bravery;
    }
}
