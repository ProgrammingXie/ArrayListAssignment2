import java.util.ArrayList;

class Question3 {
    public static void main(String[] args){
        ArrayList<Integer> A = new ArrayList<Integer>(); 
        A.add(6);
        A.add(8);
        A.add(8);
        A.add(5);
        ArrayList<Integer> B = new ArrayList<Integer>();
        B.add(3);
        B.add(3);
        B.add(9);
        B.add(1);
        ArrayList<Integer> Anwser = Calculation(A,B);
        System.out.println(Anwser);
    }
    
    public static ArrayList<Integer> Calculation(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> NewAnswer = new ArrayList<Integer>();
        int CarryExtraOne = 0;
        int EndA = a.size()-1;
        int EndB = b.size()-1;
        while (EndA >= 0 || EndB >= 0){// Add numbers from the back 
            int Object = 0;
            if (EndA >= 0 && EndB >= 0){// add number from A and B
                Object = a.get(EndA) + b.get(EndB) + CarryExtraOne;
            }
            else if (EndA >= 0){// add number from A
                Object = a.get(EndA) + CarryExtraOne;
            }
            else if (EndB >= 0){// add number from B
                Object = b.get(EndB) + CarryExtraOne;
            }
            
            if (Object >= 10){// Check carry yes or no
                Object = Object - 10;
                CarryExtraOne = 1;
            }
            else {
                CarryExtraOne = 0;
            }
            
            NewAnswer.add(0,Object);   
            EndA--;
            EndB--;
        }
        
        if (CarryExtraOne == 1){// Check if the last 2 numbers add up to 10
            NewAnswer.add(0,1);
        }
        
        return NewAnswer;
    }
}