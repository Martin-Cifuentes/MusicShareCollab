package ui;
import java.util.Scanner;
import model.MSC;
public class Main{
	private static MSC msc;
	private static Scanner sc;
	public static void main(String[] args){
		sc = new Scanner(System.in);
		msc = new MSC("Music Share & Collab");
		System.out.println("(((((((((((((((((((((((((((((((((((((((((((((((((");
		System.out.println("((((((((((((((((/((((((((((((((((((((((((((((((((");
		System.out.println("(((/  .(((((((*  .((((((*        (((((/      /(((");
		System.out.println("(((/   .((((((.  .(((((   ,((((((((((*  .((((((((");
		System.out.println("(((/    /((((/   .((((/  ,(((((((((((.  /((((((((");
		System.out.println("(((/     ((((*   .((((*  ,(((((((((((/   ((((((((");
		System.out.println("(((/  *  *(((     ((((*  ,((((((((((((,  .(((((((");
		System.out.println("(((/  /.  ((*     ((((*  *(((((((((((((,   ((((((");
		System.out.println("(((/  *(*  ,  (   ((((*  *((((((((((((((((   /(((");
		System.out.println("(((/  ,(/    ,(   /(((*  ,(((((((((((((((((   (((");
		System.out.println("(((/  .((    ((   /((((  .(((((((((((((((((.  /((");
		System.out.println("(((/  .((.  .((.  *((((,  *((((((((((((((((   /((");
		System.out.println("(((/  .((((((((.  *(((((   *((((/,/(((((((/   (((");
		System.out.println("(((/  .((((((((.  *((((((.        *((   .   .((((");
		System.out.println("(((((((((((((((/*/((((((((((///(((((((////(((((((");
		System.out.println("(((((((((((((((((((((((((((((((((((((((((((((((((");
		System.out.println("               ./(###((///((###(*                ");
		System.out.println("           *#(,                   *((,           ");
		System.out.println("        ,#/                           ((         ");
		System.out.println("      .#*          .**/////*,.          ((       ");
		System.out.println("     *(.      .//////////////////*       *#      ");
		System.out.println("    .#,     *///////////////////////,     /(     ");
		System.out.println("    /(    *///////////////////////////    .#.    ");
		System.out.println("  ,/////,*/////////////////////////////,*////*.  ");
		System.out.println("  /////////////////////////*,...,/////////////,  ");
		System.out.println("  //////*,,,********,,.............,,,,,//////,  ");
		System.out.println("  //////*.........//*........//*.......,//////,  ");
		System.out.println("  //////*.........,,.........,,........,//////,  ");
		System.out.println("  //////*..............................,//////,  ");
		System.out.println("   *///*  ........,/.........**.......  .*///,   ");
		System.out.println("            .......,/*.....,/*.......            ");
		System.out.println("               ........,,,,.......               ");
		System.out.println("                    .........                    ");   
		System.out.println("*************************************************");
		//cargarDatos();
		int o = 1;
		while(o != 0){
			o = menu();
			definirAccion(o);
		}
	}
	/** 
     * this method shows the posible actions that the user is able to do
     * <b>pre:</b> doesn't aply
     * <b>post:</b> returns the user decision
     * @return int user decision
     */
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
		System.out.println("-(8) Consultar cantidad de canciones");
		System.out.println("-(9) Consultar cantidad de playlist");
		System.out.println("-(10) Agregar cancion a playlist");
		System.out.println("-(11) Agregar calificacion a playlist");
		System.out.println("-(12) Listar usuarios");
		System.out.println("-(13) Listar canciones");
		System.out.println("-(14) Listar playlist");
		System.out.println("-(0) Salir");
		opcion = sc.nextInt();
		sc.nextLine();
		return opcion;
	}
	/** 
     * this method calls to other segun la opcion that the user choose
     * <b>pre:</b> the param number must be an integer and a valid option
     * <b>post:</b> the user's action has been defined
     * @param op valid int betwen the options
     */
	public static void definirAccion(int op){
		switch(op){
			case 0: //done
			break;
			case 1: addUser();//done
			break;
			case 2: addSong();//done
			break;
			case 3: addPlaylist();//done
			break;
			case 4: searchUser();//done
			break;
			case 5: searchSong();//done
			break;
			case 6: searchPlaylist();//done
			break;
			case 7: getUsersNum();//done
			break;
			case 8: getSongsNum();//done
			break;
			case 9: getPlaylistNum();//done
			break;
			case 10: addSongToPlaylist();//done
			break;
			case 11: qualifyPlaylist();//done
			break;
			case 12: listUsers();//done
			break;
			case 13: listSongs();//done
			break;
			case 14: listPlaylist();//done
			break;
			default: System.out.println("Opcion no valida, intente nuevamente");
			//menu();
			break;
		}
	}
	/** 
     * this method calls to another on th class msc to print the users
     * <b>pre:</b> it must have been chosen by the user on menu
     * <b>post:</b> the method has been called 
     */
	public static void listUsers(){
		msc.makeListUsers();
	}
	/** 
     * this method calls to another on th class msc to print the songs
     * <b>pre:</b> it must have been chosen by the user on menu
     * <b>post:</b> the method has been called 
     */
	public static void listSongs(){
		msc.makeListSongs();
	}
	/** 
     * this method calls to another on th class msc to print the playlist
     * <b>pre:</b> it must have been chosen by the user on menu
     * <b>post:</b> the method has been called 
     */
	public static void listPlaylist(){
		msc.makeListPlaylist();
	}
	/** 
     * this method ask for the necesary data to score a playlist
     * <b>pre:</b> it must have been chosen by the user on menu
     * <b>post:</b> the data was acquired 
     */
	public static void qualifyPlaylist(){
		String p;
		int q;
		System.out.println("*************************************************");
		System.out.println("Inserte el nombre de la playlist");
		p = sc.nextLine();
		System.out.println("Inserte el calificacion");
		q = sc.nextInt();
		sc.nextLine();
		msc.addScoreToPlaylist(p,q);
		System.out.println("*************************************************");
	}
	/** 
     * this method ask for the necesary data to add a song to a playlist
     * <b>pre:</b> it must have been chosen by the user on menu
     * <b>post:</b> the data was acquired 
     */
	//adds
	public static void addSongToPlaylist(){
		String plName,sName,uName;
		boolean x,y,z;
		System.out.println("*************************************************");
		System.out.println("Ingrese el nombre del usuario que va a agregar la cancion");
		uName = sc.nextLine();
		x = msc.findPlaylist(uName);
		System.out.println("Ingrese el nombre de la playlist a la cual quiere agregar la cancion");
		plName = sc.nextLine();
		y = msc.findPlaylist(plName);
		System.out.println("Ingrese el nombre de la cancion que quiere agregar");
		sName = sc.nextLine();
		z = msc.findPlaylist(sName);
		if(x && y && z){
			msc.putSongOnPlaylist(plName,sName,uName);
		}else{
			System.out.println("Alguno de los datos que ingreso no existe");
		}
		System.out.println("*************************************************");
	}
	/** 
     * this method ask for the necesary data to add a user
     * <b>pre:</b> it must have been chosen by the user on menu
     * <b>post:</b> the data was acquired 
     */
	public static void addUser(){
		String a,b;
		int c;
		System.out.println("*************************************************");
		System.out.println("Ingrese el nombre del usuario");
		a = sc.nextLine();
		System.out.println("Ingrese la contrasena del usuario");
		b = sc.nextLine();
		System.out.println("Ingrese la edad del usuario");
		c = sc.nextInt();
		sc.nextLine();
		msc.createUser(a,b,c);
		System.out.println("*************************************************");
	}
	/** 
     * this method ask for the necesary data to add a song to the pool
     * <b>pre:</b> it must have been chosen by the user on menu
     * <b>post:</b> the data was acquired 
     */
	public static void addSong(){
		String a,b,d,u;
		int c,e;
		System.out.println("*************************************************");
		System.out.println("Inserte el nombre del usuario que a a agregar la cancion");
		u = sc.nextLine();
		System.out.println("Ingrese el titulo de la cancion");
		a = sc.nextLine();
		System.out.println("Ingrese el artista o banda de la cancion");
		b = sc.nextLine();
		System.out.println("Ingrese la duracion de la cancion en segundos");
		c = sc.nextInt();
		sc.nextLine();
		System.out.println("Ingrese la fecha de lanzamiento de la cancion");
		d = sc.nextLine();
		System.out.println("Indique cual es el genero de la cancion:\n(1)ROCK\n(2)HIP_HOP\n(3)CLASSIC\n(4)RAGGAE\n(5)SALSA\n(6)METAL\n(7)POP");
		e = sc.nextInt();
		sc.nextLine();
		msc.createSong(a,b,c,d,e,u);
		System.out.println("*************************************************");
	}
	/** 
     * this method ask for the necesary data to add a playlist to the library
     * <b>pre:</b> it must have been chosen by the user on menu
     * <b>post:</b> the data was acquired
     */
	public static void addPlaylist(){
		String n = " ";
		String cN = " ";
		int type,o; int i = 0;
		boolean parar = false;
		String[] wL = new String[30];
		System.out.println("*************************************************");
		System.out.println("Indique si va a crear una playlist:\n(1)Privada\n(2)Restringido\n(3)Publico");
		type = sc.nextInt();
		sc.nextLine();
		System.out.println("Ingrese el nombre de la playlist");
		n : sc.nextLine();
		switch(type){
			case 1: System.out.println("Ingrese el nombre del usuario creador de la playlist");
			cN = sc.nextLine();
			msc.createPlaylist(n,cN,wL,type);
			break;
			case 2: System.out.println("Ingrese los usuarios que podran editar la playlist");
			while(parar != true||i < 30){
				System.out.println("ingrese al usuario " + (1+i));
				wL[i] = sc.nextLine();
				System.out.println("Ingresar otro usuario?\n(1)Si\n(2)No");
				o = sc.nextInt();
				sc.nextLine();
				if(o == 2){
					parar = true;
				}
				i++;
			}
			msc.createPlaylist(n,cN,wL,type);
			break;
			case 3: msc.createPlaylist(n,cN,wL,type);
			break;
		}
		System.out.println("*************************************************");
	}
	/** 
     * this method ask for the necesary data to search a user
     * <b>pre:</b> it must have been chosen by the user on menu
     * <b>post:</b> the data was acquired
     */
	//search
	public static void searchUser(){
		String user;
		boolean find;
		System.out.println("*************************************************");
		System.out.println("Inserte el nombre del usuario que desea buscar");
		user = sc.nextLine();
		find = msc.findUser(user);
		if(find){
			System.out.println("El usuario si existe");
		}else{
			System.out.println("El usuario no existe");
		}
		System.out.println("*************************************************");
	}
	/** 
     * this method ask for the necesary data to search a song
     * <b>pre:</b> it must have been chosen by the user on menu
     * <b>post:</b> the data was acquired
     */
	public static void searchSong(){
		String song;
		boolean find;
		System.out.println("*************************************************");
		System.out.println("Inserte el nombre de la cancion que desea buscar");
		song = sc.nextLine();
		find = msc.findSong(song);
		System.out.println(find);
		if(find){
			System.out.println("La cancion si existe");
		}else{
			System.out.println("La cancion no existe");
		}
		System.out.println("*************************************************");
	}
	/** 
     * this method ask for the necesary data to search a playlist
     * <b>pre:</b> it must have been chosen by the user on menu
     * <b>post:</b> the data was acquired
     */
	public static void searchPlaylist(){
		String playlist;
		boolean find;
		System.out.println("*************************************************");
		System.out.println("Inserte el nombre de la playlist que desea buscar");
		playlist = sc.nextLine();
		find = msc.findPlaylist(playlist);
		if(find){
			System.out.println("La playlist si existe");
		}else{
			System.out.println("La playlist no existe");
		}
		System.out.println("*************************************************");
	}
	/** 
     * this method shows how much users are in the app
     * <b>pre:</b> it must have been chosen by the user on menu
     * <b>post:</b> the data was acquired
     */
	//count
	public static void getUsersNum(){
		String x = msc.countUsers();
		System.out.println("*************************************************");
		System.out.println(x);
		System.out.println("*************************************************");
	}
	/** 
     * this method shows how much songs are in the pool
     * <b>pre:</b> it must have been chosen by the user on menu
     * <b>post:</b> the data was acquired
     */
	public static void getSongsNum(){
		String x = msc.countSongs();
		System.out.println("*************************************************");
		System.out.println(x);
		System.out.println("*************************************************");
	}
	/** 
     * this method shows how much playlist are in the library
     * <b>pre:</b> it must have been chosen by the user on menu
     * <b>post:</b> the data was acquired
     */
	public static void getPlaylistNum(){
		String x = msc.countPlaylist();
		System.out.println("*************************************************");
		System.out.println(x);
		System.out.println("*************************************************");
	}
}