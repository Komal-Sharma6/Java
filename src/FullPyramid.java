public class FullPyramid {
    public static void main(String [] args){
        int n=5;
        for(int i=1 ; i<=n ; i++){
            for(int j=1 ; j<=n-i ;j++){
                System.out.print(" ");
            }
            for (int star=1 ; star<=(2*i-1) ;star++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

}
