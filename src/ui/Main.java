package ui;
import java.util.Scanner;
import model.User;
public class Main{
	private static User[] users;
	private static Scanner sc;
	public static void main(String[] args){
		sc = new Scanner(System.in);
		System.out.println("(((((((((((((((((((((((((((((((((((((((((((((((((")
		System.out.println("((((((((((((((((/((((((((((((((((((((((((((((((((")
		System.out.println("(((/  .(((((((*  .((((((*        (((((/      /(((")
		System.out.println("(((/   .((((((.  .(((((   ,((((((((((*  .((((((((")
		System.out.println("(((/    /((((/   .((((/  ,(((((((((((.  /((((((((")
		System.out.println("(((/     ((((*   .((((*  ,(((((((((((/   ((((((((")
		System.out.println("(((/  *  *(((     ((((*  ,((((((((((((,  .(((((((")
		System.out.println("(((/  /.  ((*     ((((*  *(((((((((((((,   ((((((")
		System.out.println("(((/  *(*  ,  (   ((((*  *((((((((((((((((   /(((")
		System.out.println("(((/  ,(/    ,(   /(((*  ,(((((((((((((((((   (((")
		System.out.println("(((/  .((    ((   /((((  .(((((((((((((((((.  /((")
		System.out.println("(((/  .((.  .((.  *((((,  *((((((((((((((((   /((")
		System.out.println("(((/  .((((((((.  *(((((   *((((/,/(((((((/   (((")
		System.out.println("(((/  .((((((((.  *((((((.        *((   .   .((((")
		System.out.println("(((((((((((((((/*/((((((((((///(((((((////(((((((")
		System.out.println("(((((((((((((((((((((((((((((((((((((((((((((((((")
		System.out.println("               ./(###((///((###(*                ")
		System.out.println("           *#(,                   *((,           ")
		System.out.println("        ,#/                           ((         ")
		System.out.println("      .#*          .**/////*,.          ((       ")
		System.out.println("     *(.      .//////////////////*       *#      ")
		System.out.println("    .#,     *///////////////////////,     /(     ")
		System.out.println("    /(    *///////////////////////////    .#.    ")
		System.out.println("  ,/////,*/////////////////////////////,*////*.  ")
		System.out.println("  /////////////////////////*,...,/////////////,  ")
		System.out.println("  //////*,,,********,,.............,,,,,//////,  ")
		System.out.println("  //////*.........//*........//*.......,//////,  ")
		System.out.println("  //////*.........,,.........,,........,//////,  ")
		System.out.println("  //////*..............................,//////,  ")
		System.out.println("   *///*  ........,/.........**.......  .*///,   ")
		System.out.println("            .......,/*.....,/*.......            ")
		System.out.println("               ........,,,,.......               ")
		System.out.println("                    .........                    ")   
		System.out.println("*************************************************");
		cargarDatos();
		int o = 0;
		while(o != 10){
			o = menu();
			definirAccion(o);
		}
	}
	public static int menu(){
		int opcion;
		System.out.println("***********************MENU**********************");
		System.out.println("-(1) Agregar Usuario");
		System.out.println("-(2) Agregar cancion");
		System.out.println("-(3) Agregar playlist");
		System.out.println("-(4) Buscar si el usuario existe");
		System.out.println("-(5) Buscar si la cancion existe");
		System.out.println("-(6) Buscar si el playlist existe");
		System.out.println("-(7) Consultar cantidad de usuarios");
		System.out.println("-(8) Consultar cantidad de playlist");
		System.out.println("-(9) Consultar cantidad de canciones");
		System.out.println("-(7) Consultar cantidad de usuarios");
		System.out.println("-(8) Consultar cantidad de playlist");
		System.out.println("-(9) Consultar cantidad de canciones");
		System.out.println("-(10) Salir");
		opcion = sc.nextInt();
		sc.nextLine();
		return opcion;
	}
}