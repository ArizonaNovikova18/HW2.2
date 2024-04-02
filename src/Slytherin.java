public class Slytherin extends Hogwarts{
    private int trick;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;

    public int getTrick() {
        return trick;
    }

    public void setTrick(int trick) {
        this.trick = trick;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public Slytherin(int thePowerOfMagic, int transgressionDistance, String fullName, int trick, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(thePowerOfMagic, transgressionDistance, fullName);
        this.trick = trick;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    protected void compareToStudent(Slytherin slytherin) {
        int sumOfCharacteristics1 = this.sumBaseCharacteristics();
        int sumOfCharacteristics2 = slytherin.sumBaseCharacteristics();
        if (sumOfCharacteristics1 > sumOfCharacteristics2) {
            System.out.printf(
                    "Студент %s лучше студента %s (%d vs %d)%n",
                    this.getFullName(),
                    slytherin.getFullName(),
                    sumOfCharacteristics1,
                    sumOfCharacteristics2
            );
        } else if (sumOfCharacteristics1 < sumOfCharacteristics2) {
            System.out.printf(
                    "Студент %s лучше студента %s (%d vs %d)%n",
                    this.getFullName(),
                    slytherin.getFullName(),
                    sumOfCharacteristics2,
                    sumOfCharacteristics1
            );
        } else {
            System.out.printf(
                    "Студены %s и %s одинаковые (%d vs %d)%n",
                    this.getFullName(),
                    slytherin.getFullName(),
                    sumOfCharacteristics2,
                    sumOfCharacteristics1
            );
        }
    }

    @Override
    protected int sumOfCharacteristics() {
        return trick+determination+ambition+resourcefulness+thirstForPower;
    }
    }

