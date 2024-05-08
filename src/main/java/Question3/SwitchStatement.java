package Question3;

public class SwitchStatement {
    public static void main(String args[]){
        int age =59;
        //switch statement based on age
        switch (age){
            case 12:
                System.out.println("you are a child");
                break;

            case 19:
                System.out.println("you are a teenager");
                break;

            case 59:
                System.out.println("your are an adult");
                break;

            default:
                if(age >= 60){
                    System.out.println("your a senior citizen");
                }
                else{
                    System.out.println("invalid age");
                    break;
                }
        }
    }
}
