public class PrintService {
    public void print(Slytherin[] slytherins){
        System.out.println("Ученики Слизерина:");
        for (int i = 0; i < slytherins.length; i++) {
            Slytherin slytherin = slytherins[i];
            System.out.println("Имя: " + slytherin.getFullName()
            + "; Сила магии: " + slytherin.getThePowerOfMagic()
            + "; Дистанция трансгрессии: " + slytherin.getTransgressionDistance()
            + "; Хитрость: " + slytherin.getTrick()
            + "; Решительность: " + slytherin.getDetermination()
            + "; Амбициозность: " + slytherin.getAmbition()
            + "; Находчивость: " + slytherin.getResourcefulness()
            + "; Жажда власти: " + slytherin.getThirstForPower());
        }
    }
    public void print(Kogtevran[] kogtevrans){
        System.out.println("Ученики Когтеврана:");
        for (int i = 0; i < kogtevrans.length; i++) {
            Kogtevran kogtevran = kogtevrans[i];
            System.out.println("Имя: " + kogtevran.getFullName()
            + "; Сила магии: " + kogtevran.getThePowerOfMagic()
            + "; Дистанция трансгрессии: " + kogtevran.getTransgressionDistance()
            + "; Ум: " + kogtevran.getMind()
            + "; Мудрость: " + kogtevran.getWisdom()
            + "; Остроумие: " + kogtevran.getWit()
            + "; Творчество: " + kogtevran.getCreation());
        }
    }
    public void print(Gryffindor[] gryffindors){
        System.out.println("Ученики Гриффиндора:");
        for (int i = 0; i < gryffindors.length; i++) {
            Gryffindor gryffindor = gryffindors[i];
            System.out.println("Имя: " + gryffindor.getFullName()
                    + "; Сила магии: " + gryffindor.getThePowerOfMagic()
                    + "; Дистанция трансгрессии: " + gryffindor.getTransgressionDistance()
                    + "; Благородство: " + gryffindor.getNobility()
                    + "; Честь: " + gryffindor.getHonour()
                    + "; Храбрость: " + gryffindor.getBravery());
        }
        }
    public void print(Hufflepuff[] hufflepuffs){
        System.out.println("Ученики Пуффендуя:");
        for (int i = 0; i < hufflepuffs.length; i++) {
            Hufflepuff hufflepuff = hufflepuffs[i];
            System.out.println("Имя: " + hufflepuff.getFullName()
                    + "; Сила магии: " + hufflepuff.getThePowerOfMagic()
                    + "; Дистанция трансгрессии: " + hufflepuff.getTransgressionDistance()
                    + "; Трудолюбие: " + hufflepuff.getIndustriousness()
                    + "; Верность: " + hufflepuff.getLoyalty()
                    + "; Честность: " + hufflepuff.getHonesty());
        }
    }
}

