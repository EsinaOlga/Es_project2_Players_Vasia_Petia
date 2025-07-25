import java.util.Random;
///Вася и Петя играют в игру “Камень, ножницы, бумага”.
/// Каждый из них показывает свою фигуру камень-0, ножницы-1, бумага-2.
/// Программа определяет, кто из них выиграл.
/// Выбор каждого участника формируется случайным образом.
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //String name1 =  new String ("Вася");
        //String name2 =  new String("Петя");
        Random pl =new Random();
        Integer choiceVasiy = pl.nextInt(3);
        Integer choicePetiy = pl.nextInt(3);

        System.out.println("Вася выкинул (камень-0, ножницы-1, бумага-2):"+choiceVasiy);
        System.out.println("Петя выкинул (камень-0, ножницы-1, бумага-2):"+choicePetiy);
        if (choiceVasiy.equals(choicePetiy))
        {System.out.println("ничья");}
      else if ( (choiceVasiy==0 && choicePetiy==1) || (choiceVasiy==2 && choicePetiy==0)||
                (choiceVasiy==1 && choicePetiy==2))
        {System.out.println("Выиграл Вася");}
       else if ((choiceVasiy==1 && choicePetiy==0) || (choiceVasiy==2 && choicePetiy==1)|| (choiceVasiy==0 && choicePetiy==2))
        {System.out.println("Выиграл Петя");}

        }
    }
