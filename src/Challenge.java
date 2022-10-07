public class Challenge {
    /**
     * @author: Hejociara
     */
    public static void main(String[] args) {
        String value = "#";
        for (int i = 1; i <=5; i++){ // 5, número de repetições
            System.out.println(value);
            value += "#";
        }
        for(String v = "#"; !v.equals("#####");v +="#"){ //Enquanto v for diferente
            System.out.println(v);
        }
    }
}
