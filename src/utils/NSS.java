package utils;

public class NSS {

    String numss;

    public NSS(String numss){
        try{
            long numero = Long.parseLong(numss.substring(0,10));
            int control = Integer.parseInt(numss.substring(10));

            if(numero%97 == control){
                this.numss = numss;
            }else{
                throw new IllegalArgumentException();
            }
        }catch (Exception e){
            throw new IllegalArgumentException();
        }
    }

    public String control(){
        return numss.substring(10);
    }

    public int numero(){
        return Integer.parseInt(numss.substring(2,10));
    }

    public Provincia provincia(){
        return Provincia.get(numss.substring(0,2));
    }

}
