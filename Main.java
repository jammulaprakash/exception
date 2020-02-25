import java.util.*;
import java.io.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static void main(String args[]) throws IOException {
        Scanner sc=new Scanner(System.in);
        OutputStreamWriter streamWriter = new OutputStreamWriter(System.out);
        streamWriter.write("Enter principal");
        double principal=sc.nextDouble();
        streamWriter.write("Enter time");
        double time=sc.nextDouble();
        streamWriter.write("Enter rate_of_interest");
        double rate_of_interest=sc.nextDouble();
        streamWriter.write("is automated?");
        boolean automated=sc.nextBoolean();
        streamWriter.write("Enter material");
        String material=sc.next();
        streamWriter.write("Enter area");
        double area=sc.nextDouble();

        sim_in s=new sim_in(principal,time,rate_of_interest);
        double simple_interest=s.cal();
        streamWriter.write("/nsimple interest:"+simple_interest);

        com_in c=new com_in(principal,time,rate_of_interest);
        double compound_interest=c.cal();
        streamWriter.write("/ncompound interest:"+compound_interest);

        construction con=new construction(automated,material,area);
        double cost=con.construct();
        streamWriter.write("/ntotal cost:"+cost);
    }
}
