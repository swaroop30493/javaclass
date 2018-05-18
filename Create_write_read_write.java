package FileReadingandWriting;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Create_write_read_write {

	public void create(String a,int n) {

		File f = new File("B:\\Random.txt");
		try (FileWriter f_writer = new FileWriter(f); 
				PrintWriter p_writer = new PrintWriter(f_writer)) {

			for (int i = 1; i <= n; i++) {
				p_writer.println(i + " -- " + a);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void copy(int n) {
		try (FileReader f_reader = new FileReader("B:\\\\Random.txt");
				FileWriter f_writer = new FileWriter("B:\\\\Random.txt"); 
				BufferedReader b_reader = new BufferedReader(f_reader);
				PrintWriter pr=new PrintWriter(f_writer);) {
			int i=0;
			String a;
			while ((a = b_reader.readLine()) != null && i<n/2) {
				pr.println(a);;
				i++;
			}
		} catch (IOException io) {
			io.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		System.out.println("Enter number of lines in the file ");
		int n=sc.nextInt();
		

		Create_write_read_write frw = new Create_write_read_write();
		frw.create(a,n);
		frw.copy(n);
		sc.close();
	}
}
	

