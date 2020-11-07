package model;
public class PrivatePlaylist extends Playlist{
	public String creatorName;
	/** 
     * this constructor calls the super method from playlist to create a private playlist
     * <b>pre:</b> it needs a name and the name of the user that created it
     * <b>post:</b> the Private playlist is crated 
     * @param name String, name of the playlist
     * @param c String, name of the user creator of the playlist
     */
	public PrivatePlaylist(String name,String c){
		super(name);
		this.creatorName = c;
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
		if(creatorName == n){
			while(i < 5 && !encontro){
				if(songs[i]!= null && songs[i] == s){
					System.out.println("No pueden agregarse dos veces la misma cancion");
					encontro = true;
				}
				if(songs[i] == null){
					songs[i] = s;
					encontro = true;
					duration = duration + s.getDuration();
				}
				i++;
			}
			if(!encontro){
				System.out.println("No pueden crearse mas canciones");	
			}
		}else{
			System.out.println("Este usuario no puede agregar canciones en esta playlist");
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
	//toString
	public String toString(){
		return "**************  Playlist **************" + "\n**  Title: " + name + "\n**  Duration: " 
		          + duration/60 + ":" + (duration%60) +
				 "\n**  Genre: " + getGenres() + "\n**  Creator: " + creatorName;
	}
	//get
	public String getCreatorName(){
		return this.creatorName;
	}
	//set
	public void setCreatorName(String c){
		this.creatorName = c;
	}
}