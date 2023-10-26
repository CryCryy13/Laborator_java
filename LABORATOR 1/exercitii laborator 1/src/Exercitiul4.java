//Calculate and display the total number of days for months with fewer than 31 days
public class Exercitiul4 {
    public static void main(String[] args){
        int month_days[]={31,28,31,30,31,30,31,31,30,31,30,31};
        String months[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
        int s=0;
        for(int i=0;i<12;i++){
            if(month_days[i]<31) {
                s+=month_days[i];
            }
        }
        System.out.println(s);
    }
}
