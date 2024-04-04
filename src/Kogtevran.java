
public class Kogtevran extends Hogwarts {
    private int mind;
    private int wisdom;
    private int wit;
    private int creation;


    public Kogtevran(int thePowerOfMagic, int transgressionDistance, String fullName, int mind, int wisdom, int wit, int creation) {
        super(thePowerOfMagic, transgressionDistance, fullName);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getMind() {
        return mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreation() {
        return creation;
    }

    public void setCreation(int creation) {
        this.creation = creation;
    }


    protected void compareToStudent(Kogtevran kogtevran) {
        int sumOfCharacteristics1 = this.sumBaseCharacteristics();
        int sumOfCharacteristics2 = kogtevran.sumBaseCharacteristics();
        if (sumOfCharacteristics1 > sumOfCharacteristics2) {
            System.out.printf(
                    "Студент %s лучше студента %s (%d vs %d)%n",
                    this.getFullName(),
                    kogtevran.getFullName(),
                    sumOfCharacteristics1,
                    sumOfCharacteristics2
            );
        } else if (sumOfCharacteristics1 < sumOfCharacteristics2) {
            System.out.printf(
                    "Студент %s лучше студента %s (%d vs %d)%n",
                    this.getFullName(),
                    kogtevran.getFullName(),
                    sumOfCharacteristics2,
                    sumOfCharacteristics1
            );
        } else {
            System.out.printf(
                    "Студены %s и %s одинаковые (%d vs %d)%n",
                    this.getFullName(),
                    kogtevran.getFullName(),
                    sumOfCharacteristics2,
                    sumOfCharacteristics1
            );
        }
    }

    @Override
    protected int sumOfCharacteristics() {
        return mind+wisdom+wit+creation;
    }
}
