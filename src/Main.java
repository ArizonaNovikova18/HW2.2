//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Slytherin[] slytherins = {
                new Slytherin(23, 34, "Draco Malfoy", 45, 56, 67, 67, 45),
                new Slytherin(78, 12, "Graham Montague", 50, 34, 23, 53, 76),
                new Slytherin(45, 48, "Gregory Goyle", 34, 67, 85, 25, 76),
        };
        Kogtevran[] kogtevrans = {
          new Kogtevran(45, 76, "Zhou Chang", 65, 43, 87, 56),
          new Kogtevran(67, 34, "Padma Patil", 65, 43, 42, 83),
          new Kogtevran(56, 47,"Marcus Belby", 54, 70, 43, 40)
        };
        Gryffindor[] gryffindors = {
          new Gryffindor(65, 76, "Harry Potter", 56, 43,98),
          new Gryffindor(65, 76, "Hermione Granger", 76, 69,79),
          new Gryffindor(40, 67, "Ron Weasley", 59, 54, 41),
        };
        Hufflepuff[] hufflepuffs = {
          new Hufflepuff(45, 76,"Zachariach Smith", 45, 87, 90),
          new Hufflepuff(69, 65, "Cedric Diggory", 76, 56, 67),
          new Hufflepuff(60, 78, "Justin Finch-Fletchley", 67, 46, 89)

        };
        PrintService printService = new PrintService();
        printService.print(slytherins);
        printService.print(kogtevrans);
        printService.print(hufflepuffs);
        printService.print(gryffindors);

    }


    }

