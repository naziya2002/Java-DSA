public class StringSearch {

    public static void main(String[] args) {
        String item="Naziya";
        char target='u';
        // boolean answer=Search(item, target);
        boolean answer=Search2(item, target);

        if(answer){
            System.out.println("'target Found'");
        }else{
            System.out.println("Not Found");
        }

        
    }


    public static boolean Search(String var, char target){
    

        if(var.length()==0){
            return false;
        }
        for(int i=0;i<var.length();i++){
            if(var.charAt(i)==target){
                return true;
            }
        }



        return false;
    }


    // using forEach

      public static boolean Search2(String var, char target){
    

        if(var.length()==0){
            return false;
        }
        for(char ch: var.toCharArray()){
            if(ch==target){
                return true;
            }
        }



        return false;
    }
    
}
