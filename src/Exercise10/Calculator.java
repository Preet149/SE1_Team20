package Exercise10;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

     int total=0;
     List<Integer> digits=new ArrayList<>();
     List<Character>characters=new ArrayList<>();
     int index=0;


     public int calculation(char operand, int digit){

          index++;

          switch (operand){

               case '+': total+=digit;
                         digits.add(digit);
                         characters.add(operand);

                         break;

               case '-':  total-=digit;
                          digits.add(digit);
                          characters.add(operand);


                          break;

               case '*':  total*=digit;
                          digits.add(digit);
                          characters.add(operand);

                          break;

               case '/':  total/=digit;
                          digits.add(digit);
                          characters.add(operand);

                          break;

               default:   break;

          }

          return total;


     }

     public int redo(){

          switch(characters.get(index)){

               case '+': total+= digits.get(index);
                    break;


               case '-': total-= digits.get(index);
                    break;


               case '/': total/= digits.get(index);
                    break;


               case '*': total*= digits.get(index);
                    break;
          }

          index++;

          return total;
     }

     public int undo(){

          index--;

          switch(characters.get(index)){

               case '+': total-= digits.get(index);
                         break;


               case '-': total+= digits.get(index);
                         break;


               case '/': total*= digits.get(index);
                         break;


               case '*': total/= digits.get(index);
                         break;
          }

          return total;
     }
}

//2+2+3+=7
//7 4 2