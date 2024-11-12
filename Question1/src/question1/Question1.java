package question1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Question1 {


    public static void main(String[] args) {
        String[] Movies = {"Napolean","Oppenheimer"};
                
        int[][] movie_sales = { 
           {3000, 3500},
           {1500,1200},
           {1700,1600}, 
        };
        
        int Napolean = TotalSalesNapoleon(movie_sales);
        System.out.println(Napolean);
        
        int Oppemheimer = TotalSalesOppenheimer(movie_sales);
        System.out.println(Oppemheimer);

        
        String TopPerformingMovie = CalculationTopPerformance(Movies, Napolean,Oppemheimer);
        
        System.out.println("-------------");
        System.out.println(TopPerformingMovie);
        System.out.println("MOVIE TICKET SALES REPORT - 2024");
        System.out.println("\t\t\tJAN\t\tFEB\t\tMAR");
        System.out.println("---------------------------------------------------------------");
        System.out.println("Napoleon\t\t"+"3000\t\t"+"1500\t\t"+"1700");
        System.out.println("Oppenheimer\t\t"+"3500\t\t"+"1200\t\t"+"1600");
        System.out.println("\n");
        System.out.println("Total movie ticket sales for Napoleon: "+Napolean);
        System.out.println("Total movie ticket sales for Oppenheimer: "+Oppemheimer);
        System.out.println("\n");
        System.out.println("Top performing movie: "+TopPerformingMovie);
    }
    
    public static int TotalSalesNapoleon(int[][] MovieSales) {
        int NapoleonJAN = MovieSales[0][0];
        int NapoleonFEB = MovieSales[1][0];
        int NapoleonJan = MovieSales[2][0];
        
        int TotalNapoleon = NapoleonJAN+NapoleonFEB+NapoleonJan;
        
        return TotalNapoleon;
    };
    
    public static int TotalSalesOppenheimer(int[][] MovieSales) {
        int OppenheimerJAN = MovieSales[0][1];
        int OppenheimerFEB = MovieSales[1][1];
        int OppenheimerJan = MovieSales[2][1];
        
        int TotalOppenheimer = OppenheimerJAN+OppenheimerFEB+OppenheimerJan;
        
        return TotalOppenheimer;
    };

    
    public static String CalculationTopPerformance(String[] movies, int NapoleonSales, int OppemheimerSales) {
        int [] sale  = new int[2];
        
        sale[0] = NapoleonSales;
        sale[1] = OppemheimerSales;
        
        
        int maxIndex = 0;
        for (int i = 1; i < sale.length; i++) {
            if (sale[i] > sale[maxIndex]) {
                maxIndex = i;
            }
        }

        
        return movies[maxIndex];
    }
    
    
}