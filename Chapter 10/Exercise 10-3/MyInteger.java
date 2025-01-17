public class MyInteger{
    int value = 0;
    MyInteger(int number) {
        value = number;
    }
    double getValue(){
        return value;
    }

    boolean isEven(){
        boolean myReturn = false;
    if (value % 2 == 0){
        myReturn =  true;
    }
    return myReturn;
    }

    boolean isOdd(){
        boolean myReturn = false;
    if (value % 2 == 1){
        myReturn = true;
    }
    return myReturn;
    }

    boolean isPrime(){
        if(value<=1)
        {
            return false;
        }
       for(int i=2;i<=value/2;i++)
       {
           if((value%i)==0)
               return  false;
       }
       return true;
    }

    boolean isEven(int Plus){
        boolean myReturn = false;
        if (value % 2 == 0){
            myReturn =  true;
        }
        return myReturn;

    }

    boolean isOdd(int Less){
        boolean myReturn = false;
        if (value % 2 == 1){
            myReturn = true;
        }
        return myReturn;

    }

    boolean isPrime(int Same){
        if(value<=1)
        {
            return false;
        }
       for(int i=2;i<=value/2;i++)
       {
           if((value%i)==0)
               return  false;
       }
       return true;
    }

    boolean isEven(MyInteger in){

        boolean myReturn = false;
        if (in.value % 2 == 0){
            myReturn =  true;
        }
        return myReturn;

    }

    boolean isOdd(MyInteger out){
        boolean myReturn = false;
    if (out.value % 2 == 1){
        myReturn = true;
    }
    return myReturn;
        
    }

    boolean isPrime(MyInteger Or){
        if(Or.value<=1)
        {
            return false;
        }
       for(int i=2;i<=Or.value/2;i++)
       {
           if((Or.value%i)==0)
               return  false;
       }
       return true;
    }

    boolean equals(int pm){
        boolean myReturn = false;
        if (this.value == pm){
            myReturn = true; 
        }
        return myReturn;

    }

    boolean equals(MyInteger Run){
        boolean myReturn = false;
        if (this.value == Run.value){
            myReturn = true;
        }
        return myReturn;
    }

    int parseint(char[] act){
        // array of characters(numbers) translate into an integer
        int number = 0;
        for (int i = 0; i < act.length; i++){
            number += act[i];
        }
        return number;
    }
    
    int parseint(String beef){
        int number = 0;
        for (int i = 0; i < beef.length(); i++){
           number += beef.charAt(i);
        }
        return number;
    }

    


    
}
    
    

