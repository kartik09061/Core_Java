package controlStatements.decisionMakingControlStatements.switchDemos;

public class Demo2 {
    static void main(String[] args) {
        byte month = 12;
        String monthToPrint = switch (month){
          case 1 -> "jan";
          case 2 -> "feb";
          case 3 -> "march";
          case 4 -> "april";
          case 5 -> "may";
          case 6 -> "june";
          case 7-> "july";
          case 8 -> "aug";
          case 9 -> "sept";
          case 10 -> "oct";
          case 11 -> "nov";
          case 12 -> "dec";
            default -> "invalid month";

        };
        System.out.println(monthToPrint);
    }
}
