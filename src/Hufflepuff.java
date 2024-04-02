public class Hufflepuff extends Hogwarts{
    private int industriousness;
    private int loyalty;
    private int honesty;

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public Hufflepuff(int thePowerOfMagic, int transgressionDistance, String fullName, int industriousness, int loyalty, int honesty) {
        super(thePowerOfMagic, transgressionDistance, fullName);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }
    protected void compareToStudent(Hufflepuff hufflepuff) {
        int sumOfCharacteristics1 = this.sumBaseCharacteristics();
        int sumOfCharacteristics2 = hufflepuff.sumBaseCharacteristics();
        if (sumOfCharacteristics1 > sumOfCharacteristics2) {
            System.out.printf(
                    "Студент %s лучше студента %s (%d vs %d)%n",
                    this.getFullName(),
                    hufflepuff.getFullName(),
                    sumOfCharacteristics1,
                    sumOfCharacteristics2
            );
        } else if (sumOfCharacteristics1 < sumOfCharacteristics2) {
            System.out.printf(
                    "Студент %s лучше студента %s (%d vs %d)%n",
                    this.getFullName(),
                    hufflepuff.getFullName(),
                    sumOfCharacteristics2,
                    sumOfCharacteristics1
            );
        } else {
            System.out.printf(
                    "Студены %s и %s одинаковые (%d vs %d)%n",
                    this.getFullName(),
                    hufflepuff.getFullName(),
                    sumOfCharacteristics2,
                    sumOfCharacteristics1
            );
        }
    }

    @Override
    protected int sumOfCharacteristics() {
        return industriousness+loyalty+honesty;
    }
}



