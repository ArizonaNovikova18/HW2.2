public abstract class Hogwarts {
    private String fullName;
    private  int thePowerOfMagic;
    private int transgressionDistance;

    public int getThePowerOfMagic() {
        return thePowerOfMagic;
    }

    public void setThePowerOfMagic(int thePowerOfMagic) {
        this.thePowerOfMagic = thePowerOfMagic;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }

    public void setTransgressionDistance(int transgressionDistance) {
        this.transgressionDistance = transgressionDistance;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Hogwarts(int thePowerOfMagic, int transgressionDistance, String fullName) {
        this.thePowerOfMagic = thePowerOfMagic;
        this.transgressionDistance = transgressionDistance;
        this.fullName = fullName;
    }
    protected int sumBaseCharacteristics(){
        return thePowerOfMagic + transgressionDistance;
    }
    protected abstract int sumOfCharacteristics();
    protected void compareToStudent(Hogwarts hogwarts){
        int sumOfCharacteristics1 = this.sumBaseCharacteristics();
        int sumOfCharacteristics2 = hogwarts.sumBaseCharacteristics();
        if (sumOfCharacteristics1 > sumOfCharacteristics2){
            System.out.printf(
                    "Студент %s лучше студента %s (%d vs %d)%n",
            this.getFullName(),
            hogwarts.getFullName(),
            sumOfCharacteristics1,
            sumOfCharacteristics2
            );
            } else if (sumOfCharacteristics1 < sumOfCharacteristics2){
            System.out.printf(
                    "Студент %s лучше студента %s (%d vs %d)%n",
                    this.getFullName(),
                    hogwarts.getFullName(),
                    sumOfCharacteristics2,
                    sumOfCharacteristics1
            );
        } else {
            System.out.printf(
                    "Студены %s и %s одинаковые (%d vs %d)%n",
                    this.getFullName(),
                    hogwarts.getFullName(),
                    sumOfCharacteristics2,
                    sumOfCharacteristics1
            );
        }
    }
}
