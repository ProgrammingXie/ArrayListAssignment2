import java.util.ArrayList;

class Question1 {
    public static void main (String[] args){
        ArrayList<Integer> Number = new ArrayList<Integer>();
        for (int i = 0; i <= 100; i++){
            Number.add(i);
        }  
        for (int p = 0; p < 2; p++){        
            Number.remove(0);
        }       
        System.out.println("Original List: " + Number);
        System.out.println("List: " + List(Number));
    }
    
    public static ArrayList<Integer> List(ArrayList<Integer> Input){
        int FirstNumber;
        for (int i = 0; i < Input.size(); i++){
            FirstNumber = Input.get(i);
            for (int k = i+1; k < Input.size(); k++){
                if (Input.get(k) % FirstNumber == 0){
                    Input.remove(k);
                }
            }
        }
        return Input;
    }
}
