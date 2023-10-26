//Repeat exercise 1, but only display the first 3 characters of each month's name
public class Exercitiul5 {
    public static void main(String[] args){
        int month_days[]={31,28,31,30,31,30,31,31,30,31,30,31};
        String months[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
        for(int i=0;i<12;i++){
            System.out.println(months[i].substring(0,3)+' '+month_days[i]+" days");
        }
    }
}

