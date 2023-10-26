//Display the months that have fewer than 31 days, along with thier number of days
public class Exercitiul3 {
    public static void main(String[] args){
        int month_days[]={31,28,31,30,31,30,31,31,30,31,30,31};
        String months[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
        for(int i=0;i<12;i++){
            if(month_days[i]<31) {
                System.out.println(months[i]+' '+month_days[i]+" days");
            }
        }
    }
}
