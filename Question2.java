import java.util.ArrayList;

class Question2{  
    public static void main(String[] args){         
        for (int i = 4; i <= 100; i+=2){
            List(i);
        }
        //List(1000);
    }   
    
    public static void List (int Input){
       ArrayList<Integer> Original = new ArrayList<Integer>();
       for (int i = 2; i <= 100; i++){
           Original.add(i);
       }
       int FirstNumber;
       for (int k = 0; k < Original.size();k++){
           FirstNumber = Original.get(k);
           for (int p = k+1; p < Original.size(); p++){
               if (Original.get(p) % FirstNumber == 0){
                   Original.remove(p);
               }
           }
       }
       int TestNumber = 0;
       //int f = 0;
       //while (f < Original.size()){
       for (int f = 0; f < Original.size(); f++){
          TestNumber = Input - Original.get(f);
          if (Original.contains(TestNumber)){
               System.out.println(Input + " = " + TestNumber + " + " + Original.get(f));
               return;
               //break;
           }
          //f++;
       }
       
       //System.out.println(Input + " = " + TestNumber + " + " + Original.get(f));
       
    }  
}