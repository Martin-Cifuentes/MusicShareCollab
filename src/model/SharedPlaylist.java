package model;
public class SharedPlaylist extends Playlist{
	public String[] whiteList;
	/** 
     * this constructor calls the super method from playlist to create a shared playlist
     * <b>pre:</b> it needs a name and a list of users that can modify the playlist
     * <b>post:</b> the Sared playlist is crated
     * @param name String, name of the playlist
     * @param c String, array of names of the users that can add songs to the playlist
     */
	public SharedPlaylist(String name,String[] c){
		super(name);
		this.whiteList = new String[5];
	}
	/** 
     * this method adds a song to a playlist
     * <b>pre:</b> it must have been called by a method on msc
     * <b>post:</b> the song has been added
     * @param s Song, the song that is gonna be added
     */
	public void addPlaylistSong(Song s){
		return;
	}
	/** 
     * this method adds a song to a playlist
     * <b>pre:</b> it must have been called by a method on msc
     * <b>post:</b> the song has been added
     * @param n String, the name of the user that is adding the song
     * @param s Song, the song that is gonna be added
     */
	public void addPlaylistSong(String n, Song s){
		boolean encontro = false;
		int i = 0;
		while(i < 5 && !encontro){
			if(songs[i]!= null && songs[i] == s){
				System.out.println("No pueden agregarse dos veces la misma cancion");
				encontro = true;
			}
			if(whiteList[i] == n && songs[i] == null){
				songs[i] = s;
				encontro = true;
				duration = duration + s.getDuration();
			}
			if(whiteList[i] != n){
				System.out.println("Este usuario no puede agregar canciones en esta playlist");
			}
			i++;
		}
		if(!encontro){
			System.out.println("No pueden crearse mas canciones");	
		}
		i = 0;
		while(i < 10){
			if(genres[i] != null){
				genres[i] = s.getGenre();
			}
		}
		duration += s.getDuration();
	}
	/** 
     * this method swous the information of the playlist
     * <b>pre:</b> it must have been called by a method on msc
     * <b>post:</b> the playlist information
     * @return String, the playlist information
     */
	public String toString(){
		String editors = "";
		for(int i = 0; i < 5; i++){
			if(whiteList[i] != null){
				editors += " " + whiteList[i];
			}
		}
		return "**************  Playlist **************" + "\n**  Title: " + name + "\n**  Duration: " +
				 duration/60 + ":" + (duration%60) +
				 "\n**  Genre: " + getGenres() + "\n**  Editors: " + editors;
	}
}