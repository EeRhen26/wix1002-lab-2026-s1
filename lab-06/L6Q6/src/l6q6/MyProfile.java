package l6q6;
public class MyProfile {
    public static void main(String[] args) {
        int num = 0;
        System.out.println("The first 20 palindrome numbers are: ");
        for(int i =1; i<=20; i++){
            num = palindrome(i);
            System.out.print(num+" ");
        }
        System.out.println("");
        System.out.println("The first 20 emirp are: ");
        for(int i =1; i<=20; i++){
            num = emirp(i);
            System.out.print(num+" ");
        }
        System.out.println("");
    }
    public static int palindrome (int n){
        int count = 0, palinCount = 0, i = 1;
        while(palinCount != n){
            i++;
            count = i-1;
            while(count != 1){
                if(i%count == 0){
                    break;
                }
                else{
                    count--;
                }
            }
            if(count == 1){
                if(i/1000 == 0){
                    if(i/100 == 0){
                        if(i/10 == 0){
                            palinCount ++;
                        }
                        else{
                            if(i%10 == i/10){
                                palinCount ++;
                            }
                        }
                    }
                    else{
                        if(i/100 == i%10){
                            palinCount++;
                        }
                    }
                }
                else{
                    if((i/1000 == i%10)&&((i%100)/10 == (i/100)%10)){
                        palinCount++;
                    }
                }
            }
        }
        return i;
    }
    public static int inverterHundreds(int a){
        int hundreds = 0, tens = 0, ones = 0, ans = 0;
        ones = a/100;
        tens = (a/10) % 10;
        hundreds = a%10;
        ans = hundreds*100 + tens*10 + ones;
       return ans;
    }
    public static boolean primeCheck(int a){
        boolean ans = false;
        int count = a-1;
        if(a>1){
            while(count != 1){
                if(a%count == 0){
                    break;
                }
                else{
                    count--;
                }
            }
            if(count == 1){
                ans = true;
            }
        }
        return ans;
    }
    public static int emirp(int n){
        int count = 0, palinCount = 0, i = 1, counter = 0;
        boolean checker = false;
        while(palinCount != n){
            i++;
            checker = primeCheck(i);
            if(checker){
                if(i/1000 == 0){
                    if(i/100 == 0){
                        if(i/10 == 0){
                            palinCount --;
                        }
                        else{
                            if(i%10 == i/10){
                                palinCount --;
                            }
                            else if(primeCheck(i/10+(i%10)*10)){
                                ;
                            }
                            else{
                                palinCount--;
                            }
                        }
                    }
                    else{
                        counter = inverterHundreds(i);
                        if(i/100 == i%10){
                            palinCount--;
                        }
                        else if(primeCheck(counter)){
                            ;
                        }
                        else{
                            palinCount --;
                        }
                    }
                }
                else{
                    if((i/1000 == i%10)&&((i%100)/10 == (i/100)%10)){
                        palinCount--;
                    }
                    else if(primeCheck(i/1000+(((i/100)%10)*10)+(((i%100)/10)*100)+((i%10)*1000))){
                        ;
                    }
                    else{
                        palinCount--;
                    }
                }
                palinCount++;
            }
        }
        return i;
    }
}
