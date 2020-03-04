package com.epam.CollectionFramework;

import java.util.Scanner;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;


public class Main{
	public static final Logger log =  LogManager.getLogger(App.class);
	public static void main(String[] args){
		CustomList<Integer> list = new CustomList<Integer>();
		Scanner sc = new Scanner(System.in);
		log.info("Enter number of elements in list:");
		int n;
		n = sc.nextInt();
		log.info("Enter elements in the list:");
		int[] arr = new int[n];
		for(int i = 0; i<n;i++){
			arr[i] = sc.nextInt();
			list.add(arr[i]);
		}
		log.info(list);
		log.info("enter number of elements to be removed:");
		int p = sc.nextInt();
		log.info("Enter position of element to be removed:");
		int[] remo = new int[p];
		for(int i = 0; i<p;i++){
			remo[i] =sc.nextInt();
			log.info( list.remove(remo[i]) );
		}
		log.info(list);
		log.info("enter number elements to be retrived:");
		int m = sc.nextInt();
		log.info("Enter position of element to be retrived:");
		int[] retrived = new int[m];
		for(int i = 0; i<m;i++){
			retrived[i]=sc.nextInt();
			log.info( list.Retrive(retrived[i]) );
		}
		log.info("Size is: " +list.size());
	}
}