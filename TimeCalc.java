public class TimeCalc {
    public static void main(String[] args) {
        //input of an hour and amount of minutes and returns the new hour after adding the minutes
        
        String hours = "" + args[0].charAt(0) + args[0].charAt(1);
        String minutes = "" + args[0].charAt(3) + args[0].charAt(4);
        int minutesToAdd = Integer.parseInt(args[1]);
        int hours1 = Integer.parseInt(hours);
        int minutes1 = Integer.parseInt(minutes);
        int newH,newM,addM, addH, moreta;
        if((minutesToAdd + minutes1)<60)
        {
            newH = hours1;
            newM = minutes1 + minutesToAdd;
        }
        else
        {
            addH = minutesToAdd/60;
            addM = minutesToAdd - addH*60;
            newM = ((addM+minutes1)%60);
            if((addM+minutes1)>=60)
                moreta = 1;
            else
                moreta = 0;         
            newH = (hours1 + addH + moreta)%24;
            
        }
        String prH = "" +newH;
        String prM = "" +newM;
        if(newM<10)
            prM = "0"+prM;
        if(newH<10)    
            prH = "0"+prH;
        System.out.println(prH + ":" + prM);

    }
}
