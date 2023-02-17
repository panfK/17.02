import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int loop = 1;
        while (loop==1) {
            int Ex, Exloop;
            Exloop = 1;
            System.out.println("какое задание проверим? 1-4 5=конец проверки");
            Ex = S.nextInt();
            if (Ex==1){
                while (Exloop==1){
                    int year;
                    System.out.println("характеристику какого года вы желаете увидеть?(если до нашей эры пишите со знаком '-')");
                    year = S.nextInt();
                    if (year>=0){
                        if ((year % 4)==0){
                            System.out.println(year + " високосный год нашей эры");
                        }
                        else {
                            System.out.println(year + " год нашей эры");
                        }
                    }
                    else{
                        year=year*(-1);
                        if ((year % 4)==0){
                            System.out.println(year + " високосный год до нашей эры");
                        }
                        else {
                            System.out.println(year + " год до нашей эры");
                        }
                    }
                    System.out.println("продолжим проверку задания? 1-да 2-нет");
                    Exloop =S.nextInt();
                }
            }
            if (Ex==2){
                while (Exloop==1) {
                    int mon;
                    System.out.println("введите ваш остаток средств на этот месяц (1-99 копеек)");
                    mon = S.nextInt();
                    if ((mon <= 9)||(mon>=21)) {
                        if ((mon % 10) == 1) {
                            System.out.println("у вас осталось " + mon + " копейка");
                        }
                        else if (((mon % 10)>=2)&&((mon % 10)<=4)){
                            System.out.println("у вас осталось " + mon + " копейки");
                        }
                        else{
                            System.out.println("у вас осталось " + mon + " копеек");
                        }
                    }
                    else {
                        System.out.println("у вас осталось " + mon + " копеек");
                    }
                    System.out.println("продолжим проверку задания? 1-да 2-нет");
                    Exloop = S.nextInt();
                }
            }
            if (Ex==3){
                while (Exloop==1){
                    int d,n;
                    System.out.println("введите месяц");
                    n = S.nextInt();
                    System.out.println("введите день");
                    d = S.nextInt();
                    if (n==1) {
                        if (d>=21){
                            System.out.println("водолей");
                        }
                        else {
                            System.out.println("козерог");
                        }
                    }
                    if (n==2) {
                        if (d>=19){
                            System.out.println("рыбы");
                        }
                        else {
                            System.out.println("водолей");
                        }
                    }
                    if (n==3) {
                        if (d>=21){
                            System.out.println("овен");
                        }
                        else {
                            System.out.println("рыбы");
                        }
                    }
                    if (n==4) {
                        if (d>=21){
                            System.out.println("телец");
                        }
                        else {
                            System.out.println("овен");
                        }
                    }
                    if (n==5) {
                        if (d>=21){
                            System.out.println("близнецы");
                        }
                        else {
                            System.out.println("телец");
                        }
                    }
                    if (n==6) {
                        if (d>=22){
                            System.out.println("рак");
                        }
                        else {
                            System.out.println("близнецы");
                        }
                    }
                    if (n==7) {
                        if (d>=23){
                            System.out.println("лев");
                        }
                        else {
                            System.out.println("рак");
                        }
                    }
                    if (n==8) {
                        if (d>=24){
                            System.out.println("дева");
                        }
                        else {
                            System.out.println("лев");
                        }
                    }
                    if (n==9) {
                        if (d>=24){
                            System.out.println("весы");
                        }
                        else {
                            System.out.println("дева");
                        }
                    }
                    if (n==10) {
                        if (d>=24){
                            System.out.println("скорпион");
                        }
                        else {
                            System.out.println("весы");
                        }
                    }
                    if (n==11) {
                        if (d>=23){
                            System.out.println("стрелец");
                        }
                        else {
                            System.out.println("скорпион");
                        }
                    }
                    if (n==12) {
                        if (d>=22){
                            System.out.println("козерог");
                        }
                        else {
                            System.out.println("стрелец");
                        }
                    }
                    System.out.println("продолжим проверку задания? 1-да 2-нет");
                    Exloop =S.nextInt();
                }
            }
            if (Ex==4){
                while (Exloop==1){
                    int d;
                    System.out.println("введите день 1-365");
                    d=S.nextInt();
                    d=d-1;
                    if ((d%7)==0) {
                        System.out.println("понедельник");
                    }
                    else if ((d%7)==1) {
                        System.out.println("вторник");
                    }
                    else if ((d%7)==2) {
                        System.out.println("среда");
                    }
                    else if ((d%7)==3) {
                        System.out.println("четверг");
                    }
                    else if ((d%7)==4) {
                        System.out.println("пятница");
                    }
                    else if ((d%7)==5) {
                        System.out.println("суббота");
                    }
                    else if ((d%7)==6) {
                        System.out.println("воскрсенье");
                    }
                    System.out.println("продолжим проверку задания? 1-да 2-нет");
                    Exloop =S.nextInt();
                }
            }
            else {
                loop = 2;
            }
        }
    }
}
Footer