package webcrawler;

import java.util.Scanner;

public class Main {

		private static Scanner in;
		public static void main(String[] args) {
			
			in = new Scanner(System.in);
			System.out.print("Enter Website you want to crawl : ");
			String root = in.next();
			BFS bfs = new BFS();	
			bfs.discoverWeb(root);
		}
	}
