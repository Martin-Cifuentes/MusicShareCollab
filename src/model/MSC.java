package model;
public class MSC{
	public static final int CANT_USERS = 10;
	public static final int CANT_PLAYLIST = 20;
	public static final int CANT_SONGS = 30;
	public String name;
	private Song[] pool;
	private Playlist[] library;
	private User[] users;
	private int canUsers;
	/** 
     * this constructor method creates a msc objet
     * @param n String, the name of the app
     */
	public MSC(String n){
		this.name = n;
		this.pool = new Song[CANT_SONGS];
		this.library = new Playlist[CANT_PLAYLIST];
		this.users = new User[CANT_USERS];
		this.canUsers = 0;
	}
	/** 
     * this method shows the list of the users in the app
     * <b>pre:</b> it must be called by another method on the main class
     * <b>post:</b> sows the users data
     */
	public void makeListUsers(){
		String printed;
		for(int i = 0; i < CANT_USERS; i++){
			if(users[i] != null){
				printed = users[i] + "\n";
				System.out.println(printed);
			}
		}
	}
	/** 
     * this method shows the list of the songs in the pool
     * <b>pre:</b> it must be called by another method on the main class
     * <b>post:</b> sows the songs data
     */
	public void makeListPlaylist(){
		String printed;
		for(int i = 0; i < CANT_PLAYLIST; i++){
			if(library[i] != null){
				printed = library[i] + "\n";
				System.out.println(printed);
			}
		}
	}
	/** 
     * this method shows the list of the playlist in the library
     * <b>pre:</b> it must be called by another method on the main class
     * <b>post:</b> sows the playlist data
     */
	public void makeListSongs(){
		String printed;
		for(int i = 0; i < CANT_SONGS; i++){
			if(pool[i] != null){
				printed = pool[i] + "\n";
				System.out.println(printed);
			}
		}
	}
	/** 
     * this method finds the playlist and the song that is gonna be added
     * <b>pre:</b> it must be called by another method on the main class
     * <b>post:</b> defines the apropiate method to call on playlist
     * @param plN String, name of the playlist
     * @param sN String, name of the song
     * @param uN String, name of the user
     */
	public void putSongOnPlaylist(String plN,String sN,String uN){
		int i = 0;
		int p,s;
		boolean encontroSong = false;
		boolean encontroPl = false;
		encontroSong = findSong(sN);
		encontroPl = findPlaylist(plN);
		if(encontroSong){
			s = getSongPos(sN);
			if(encontroPl){
				p = getPlaylistPos(plN);
				if(library[p] instanceof PublicPlaylist){
					library[p].addPlaylistSong(pool[s]);
				}else{
					library[p].addPlaylistSong(uN,pool[s]);
				}
			}
		}
	}
	/** 
     * this method calls the playlist and quialifyes ti with the user's score
     * <b>pre:</b> it must be called by another method on the main class
     * @param plN String, name of the playlist
     * @param q int, the user's score
     */
	public void addScoreToPlaylist(String plN, int q){
		int i = 0;
		int p;
		PublicPlaylist pPlaylist;
		boolean encontro = false;
		p = getPlaylistPos(plN);
		if(library[p] instanceof PublicPlaylist){
			pPlaylist = (PublicPlaylist) library[p];
			pPlaylist.changeScore(q);
		}
	}
	/** 
     * this method calls and sends to the Song class constructor the necesary info to make a new song
     * <b>pre:</b> it must be called by another method on the main class
     * @param t String, title of the song
     * @param art String, artist or musical group
     * @param d int, the duration of the song in seconds
     * @param rd String, the relase date
     * @param a int, the genre of the song
     * @param user String, the name of the user who added the song
     */
	//creates
	public void createSong(String t, String art, int d, String rd, int a, String user){
		int s;
		int i = 0;
		boolean encontro = false;
		int o = 30;
		Genre genre;
		s = getUserPos(user);
		switch(a){
			case 1: genre = Genre.ROCK;
			break;
			case 2: genre = Genre.HIP_HOP;
			break;
			case 3: genre = Genre.CLASSIC;
			break;
			case 4: genre = Genre.RAGGAE;
			break;
			case 5: genre = Genre.SALSA;
			break;
			case 6: genre = Genre.METAL;
			break;
			default: genre = Genre.POP;
			break;
		}
		encontro = false;
		while(i < 10 && !encontro){
			if(pool[i]!= null && pool[i].getTitle().equalsIgnoreCase(t)){
				System.out.println("No pueden crearse dos canciones con el mismo nombre");
				encontro = true;
			}
			if(pool[i] == null){
				pool[i] = new Song(t,art,d,rd,genre);
				users[s].increaseSharedSongs();
				encontro = true;
			}
			i++;
		}
		if(!encontro){
			System.out.println("No pueden crearse mas canciones");	
		}
		
	}
	/** 
     * this method calls and sends to the Playlist (Public,Privete,Shared) class constructor the necesary info to make a new playlist
     * <b>pre:</b> it must be called by another method on the main class
     * @param n String, title of the playlist
     * @param c String, the name of the  user who created it
     * @param w String array, the list of users that can modify it
     * @param type String, define if the playlist is Public,Privete or Shared
     */

	public void createPlaylist(String n,String c,String w[],int type){
		int i = 0;
		boolean encontro = false;
		while(i < 10 && !encontro){
			if(library[i]!= null && library[i].getName().equalsIgnoreCase(n)){
				System.out.println("No pueden crearse dos canciones con el mismo nombre");
				encontro = true;
			}
			if(library[i] == null){
				switch(type){
					case 1: library[i] = (Playlist) new PrivatePlaylist(n,c);
					break;
					case 2:library[i] = (Playlist) new SharedPlaylist(n,w);
					break;
					case 3:library[i] = new PublicPlaylist(n);
					break;
				}
				encontro = true;
			}
			i++;
		}
		if(!encontro){
			System.out.println("No pueden crearse mas playlist");	
		}
	}
	/** 
     * this method calls and sends to the Song class constructor the necesary info to make a new song
     * <b>pre:</b> it must be called by another method on the main class
     * @param n String, the name of the user
     * @param p String, the password of the user
     * @param a int, the age of the user
     */

	public void createUser(String n, String p, int a){
		Category c = Category.NEWBIE;
		int i = 0;
		boolean encontro = false;
		while(i < 10 && !encontro){
			if(users[i]!= null && users[i].getName() == n){
				System.out.println("No pueden crearse dos usuarios con el mismo nombre");
				encontro = true;
			}
			if(users[i] == null){
				users[i] = new User(n,p,a,c);
				canUsers++;
				encontro = true;
			}
		}
		if(!encontro){
			System.out.println("No pueden crearse mas usuarios");	
		}
	}
	/** 
     * this method gets the array position of an user using the name 
     * <b>pre:</b> it must be called by another method on the main class
     * <b>post:</b> sends back the user's position
     * @param userName String, the user's name
     * @return the user's position
     */
	//getPositions
	public int getUserPos(String userName){
		boolean encontro = false;
		int u = 0;
		int i = 0;
		while(i < CANT_SONGS && !encontro){
			if(users[i] != null && users[i].getName().equalsIgnoreCase(userName)){
				u = i;
				encontro = true;
			}
			i++;
		}
		return u;
	}
	/** 
     * this method gets the array position of a song using the name 
     * <b>pre:</b> it must be called by another method on the main class
     * <b>post:</b> sends back the song's position
     * @param songName String, the song's name
     * @return the song's position
     */
	public int getSongPos(String songName){
		boolean encontro = false;
		int s = 0;
		int i = 0;
		while(i < CANT_SONGS && !encontro){
			if(library[i] != null && pool[i].getTitle().equalsIgnoreCase(songName)){
				s = i;
				encontro = true;
			}
			i++;
		}
		return s;
	}
	/** 
     * this method gets the array position of a playlist using the name 
     * <b>pre:</b> it must be called by another method on the main class
     * <b>post:</b> sends back the user's position
     * @param playlistName String, the playlist name
     * @return the playlist position
     */
	public int getPlaylistPos(String playlistName){
		boolean encontro = false;
		int p = 0;
		int i = 0;
		while(i < CANT_PLAYLIST || !encontro){
			if(library[i] != null && library[i].getName().equalsIgnoreCase(playlistName)){
				p = i;
				encontro = true;
			}
			i++;
		}
		return p;
	}
	/** 
     * this method search the user on the array till find it using the name 
     * <b>pre:</b> it must be called by another method on the main class
     * <b>post:</b> sends back a boolean if the user exists
     * @param user String, the user's name
     * @return true or false if the user exist (boolean)
     */
	//finds
	public boolean findUser(String user){
		int i = 0;
		boolean encontro = false;
		while(i < CANT_USERS && encontro == false){
			if(users[i] != null && user.equalsIgnoreCase(users[i].getName())){
				encontro = true;
			}
			i++;
		}
		return encontro;
	}
	/** 
     * this method search the song on the array till find it using the name 
     * <b>pre:</b> it must be called by another method on the main class
     * <b>post:</b> sends back a boolean if the song exists
     * @param song String, the song's name
     * @return true or false if the user exist (boolean)
     */
	public boolean findSong(String song){
		int i = 0;
		boolean encontro = false;
		while(i < CANT_USERS && encontro == false){
			if(pool[i] != null && song.equalsIgnoreCase(pool[i].getTitle())){
				encontro = true;
			}
			i++;
		}
		return encontro;
	}
	/** 
     * this method search the playlist on the array till find it using the name 
     * <b>pre:</b> it must be called by another method on the main class
     * <b>post:</b> sends back a boolean if the playlist exists
     * @param pl String, the playlist's name
     * @return true or false if the playlist exist (boolean)
     */
	public boolean findPlaylist(String pl){
		int i = 0;
		boolean encontro = false;
		while(i < CANT_USERS && encontro == false){
			if(library[i] != null && pl.equalsIgnoreCase(library[i].getName())){
				encontro = true;
			}
			i++;
		}
		return encontro;
	}
	/** 
     * this method counts the amount of users on the array and returns the number 
     * <b>pre:</b> it must be called by another method on the main class
     * <b>post:</b> sends back the amount of the users
     * @return the amount of users
     */
	//counts
	public String countUsers(){
		int z = 0;
		String x;
		for(int i = 0; i < CANT_USERS; i++){
			if(users[i] != null){
				z++;
			}
		}
		x = ("la cantidad total de usuarios es: " + z);
		return x;
	}
	/** 
     * this method counts the amount of songs on the array and returns the number 
     * <b>pre:</b> it must be called by another method on the main class
     * <b>post:</b> sends back the amount of the songs
     * @return the amount of songs
     */
	public String countSongs(){
		int z = 0;
		String x;
		for(int i = 0; i < CANT_SONGS; i++){
			if(pool[i] != null){
				z++;
			}
		}
		x = ("la cantidad total de canciones es: " + z);
		return x;
	}
	/** 
     * this method counts the amount of playlist on the array and returns the number 
     * <b>pre:</b> it must be called by another method on the main class
     * <b>post:</b> sends back the amount of the playlist
     * @return the amount of playlist
     */
	public String countPlaylist(){
		int z = 0;
		String x;
		for(int i = 0; i < CANT_PLAYLIST; i++){
			if(library[i] != null){
				z++;
			}
		}
		x = ("la cantidad total de playlist es: " + z);
		return x;
	}
}